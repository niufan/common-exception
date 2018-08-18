package site.niufan.common.exception.error;

/**
 * @author Fan Niu
 * @since 2018/8/18
 */
public class ErrorFormat {

    private ErrorFormat() {}

    public static String format(Error error) {
        return String.format("[%s : %s]", error.getCode(), error.getMessage());
    }
}
