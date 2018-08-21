package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.Failure;
import site.niufan.common.exception.message.AbstractMessage;

/**
 * 失败信息
 * @author Fan Niu
 * @since 2018/8/18
 */
public abstract class FailureMessage<Code, Message, Type extends Failure> extends AbstractMessage<Code, Message, Type> {

    public FailureMessage(Code code, Message message) {
        super(code, message);
    }

}
