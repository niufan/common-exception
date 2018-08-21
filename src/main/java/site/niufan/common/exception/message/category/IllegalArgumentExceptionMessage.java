package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.IllegalArgumentException;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class IllegalArgumentExceptionMessage<Code, Message> extends ExceptionMessage<Code, Message, IllegalArgumentException> {

    public IllegalArgumentExceptionMessage(Code code, Message message) {
        super(code, message);
    }

}
