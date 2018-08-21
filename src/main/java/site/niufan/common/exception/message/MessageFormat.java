package site.niufan.common.exception.message;

/**
 * @author Fan Niu
 * @since 2018/8/18
 */
public class MessageFormat {

    private MessageFormat() {}

    public static String format(Message message) {
        return String.format("[%s : %s]", message.getCode(), message.getMessage());
    }
}
