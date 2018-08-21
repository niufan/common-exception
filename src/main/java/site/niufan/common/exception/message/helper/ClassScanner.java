package site.niufan.common.exception.message.helper;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * 类扫描器
 * @author Fan Niu
 * @since 2018/8/20
 */
public class ClassScanner {

    private static final String CLASS_FILE_SUFFIX = ".class";
    private static final String PACKAGE_SEPARATOR = ".";

    private ClassLoader classLoader;
    private Set<String> packages;

    public ClassScanner(ClassLoader classLoader, String... packages) {
        this.classLoader = classLoader;
        this.packages = new HashSet<>(Arrays.asList(packages));
    }

    public Set<Class<?>> scan() {
        Set<Class<?>> classes = new HashSet<>();
        for (String _package: packages) {
            String resourceName = _package.replace(PACKAGE_SEPARATOR, "/");
            String basePackagePath = resourceName.replace("/", File.separator);
            ClassLoader classLoader = getClassLoader();
            Enumeration<URL> urls;
            try {
                urls = classLoader.getResources(resourceName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                if (url != null) {
                    List<File> classFiles = new ArrayList<>();
                    File file = new File(url.getPath());
                    if (file.isDirectory()) {
                        classFiles.addAll(listFilesByRecursion(file, one -> one.isFile() && one.getName().endsWith(CLASS_FILE_SUFFIX)));
                    } else {
                        if (file.getName().endsWith(CLASS_FILE_SUFFIX)) {
                            classFiles.add(file);
                        }
                    }
                    for (File classFile: classFiles) {
                        String currentPath = classFile.getPath();
                        String currentClassName = classFile.getName();
                        currentClassName = currentClassName.substring(0, currentClassName.length() - CLASS_FILE_SUFFIX.length());
                        currentPath = currentPath.substring(0, currentPath.indexOf(currentClassName));
                        String currentPackageName = currentPath.substring(currentPath.indexOf(basePackagePath)).replace(File.separator, ".");
                        String className = currentPackageName + currentClassName;
                        try {
                            Class<?> clazz = classLoader.loadClass(className);
                            classes.add(clazz);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return classes;
    }

    public ClassLoader getClassLoader() {
        if (classLoader == null) {
            return this.getClass().getClassLoader();
        }
        return classLoader;
    }

    public static List<File> listFilesByRecursion(File file, FileFilter filter) {
        List<File> files = new ArrayList<>();
        for (File temp: listFiles(file, true)) {
            if ((filter == null) || filter.accept(temp))
                files.add(temp);
        }
        return files;
    }

    private static List<File> listFiles(File file, boolean recursion) {
        List<File> files = new ArrayList<>();
        File[] children = file.listFiles();
        if (children != null) {
            for (File child: children) {
                files.add(child);
                if (child.isDirectory() && recursion) {
                    files.addAll(listFiles(child, true));
                }
            }
        }
        return files;
    }
}
