package site.niufan.common.exception.message.helper;

import site.niufan.common.exception.message.Message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * @author Fan Niu
 * @since 2018/7/18
 */
public class EnumMessageHelper implements MessageHelper<Serializable, Message> {

    private Collection<Message> messages;

    public EnumMessageHelper(String... packages) {
        messages = new ArrayList<>();
        ClassScanner classScanner = new ClassScanner(this.getClass().getClassLoader(), packages);
        Set<Class<?>> classes = classScanner.scan();
        for (Class<?> clazz: classes) {
            if (Message.class.isAssignableFrom(clazz) && clazz.isEnum()) {
                for (Object obj: clazz.getEnumConstants()) {
                    messages.add((Message) obj);
                }
            }
        }
    }

    @Override
    public Collection<Message> messages() {
        return messages;
    }

}
