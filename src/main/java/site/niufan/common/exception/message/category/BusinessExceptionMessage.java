package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.BusinessException;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class BusinessExceptionMessage<Code, Message> extends ExceptionMessage<Code, Message, BusinessException> {

    public BusinessExceptionMessage(Code code, Message message) {
        super(code, message);
    }

}
