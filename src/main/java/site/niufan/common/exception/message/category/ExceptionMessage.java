package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.CommonException;

/**
 * 异常信息
 * @author Fan Niu
 * @since 2018/8/20
 */
public abstract class ExceptionMessage<Code, Message, Type extends CommonException> extends FailureMessage<Code, Message, Type> {

    public ExceptionMessage(Code code, Message message) {
        super(code, message);
    }
}
