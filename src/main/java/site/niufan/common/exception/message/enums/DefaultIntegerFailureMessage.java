package site.niufan.common.exception.message.enums;

import site.niufan.common.exception.category.Failure;
import site.niufan.common.exception.message.Message;
import site.niufan.common.exception.message.category.FailureMessage;

/**
 * @author Fan Niu
 * @since 2018/8/20
 */
public enum DefaultIntegerFailureMessage implements Message<Integer, String, Failure> {

    FAILURE(0, "失败")
    ;

    private Message<Integer, String, Failure> message;

    DefaultIntegerFailureMessage(Integer code, String message) {
        this.message = new FailureMessage<Integer, String, Failure>(code, message){};
    }

    @Override
    public Integer getCode() {
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
