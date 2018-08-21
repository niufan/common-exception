package site.niufan.common.exception.message.enums;

import site.niufan.common.exception.category.Failure;
import site.niufan.common.exception.message.Message;
import site.niufan.common.exception.message.category.FailureMessage;

/**
 * @author Fan Niu
 * @since 2018/8/20
 */
public enum DefaultStringFailureMessage implements Message<String, String, Failure> {

    FAILURE("0", "失败")
    ;

    private Message<String, String, Failure> message;

    DefaultStringFailureMessage(String code, String message) {
        this.message = new FailureMessage<String, String, Failure>(code, message){};
    }

    @Override
    public String getCode() {
        return message.getCode();
    }

    @Override
    public String getMessage() {
        return message.getMessage();
    }

    @Override
    public Class<Failure> getType() {
        return message.getType();
    }

    @Override
    public boolean equals(Message message) {
        return this.message.equals(message);
    }

    @Override
    public String toString() {
        return message.toString();
    }
}
