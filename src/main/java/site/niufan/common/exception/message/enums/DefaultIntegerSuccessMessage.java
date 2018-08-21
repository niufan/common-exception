package site.niufan.common.exception.message.enums;

import site.niufan.common.exception.category.Success;
import site.niufan.common.exception.message.Message;
import site.niufan.common.exception.message.category.SuccessMessage;

/**
 * @author Fan Niu
 * @since 2018/8/20
 */
public enum DefaultIntegerSuccessMessage implements Message<Integer, String, Success> {

    SUCCESS(1, "失败")
    ;

    private Message<Integer, String, Success> message;

    DefaultIntegerSuccessMessage(Integer code, String message) {
        this.message = new SuccessMessage<Integer, String, Success>(code, message) {};
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
    public Class<Success> getType() {
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
