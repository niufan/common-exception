package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.CommonException;

/**
 * @author Fan Niu
 * @since 2018/8/18
 */
public class CommonExceptionMessage<Code, Message> extends ExceptionMessage<Code, Message, CommonException> {

    public CommonExceptionMessage(Code code, Message message) {
        super(code, message);
    }

}
