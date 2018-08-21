package site.niufan.common.exception.message.enums;

import site.niufan.common.exception.category.Success;
import site.niufan.common.exception.message.Message;
import site.niufan.common.exception.message.category.SuccessMessage;

/**
 * @author Fan Niu
 * @since 2018/8/20
 */
public enum DefaultStringSuccessMessage implements Message<String, String, Success> {

    SUCCESS("1", "成功")
    ;

    private Message<String, String, Success> message;

    DefaultStringSuccessMessage(String code, String message) {
        this.message = new SuccessMessage<String, String, Success>(code, message) {};
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
