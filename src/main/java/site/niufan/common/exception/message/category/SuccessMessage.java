package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.Success;
import site.niufan.common.exception.message.AbstractMessage;

/**
 * 成功信息
 * @author Fan Niu
 * @since 2018/8/18
 */
public abstract class SuccessMessage<Code, Message, Type extends Success> extends AbstractMessage<Code, Message, Type> {

    public SuccessMessage(Code code, Message message) {
        super(code, message);
    }

}
