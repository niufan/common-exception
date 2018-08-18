package site.niufan.common.exception.error.category;

import site.niufan.common.exception.error.AbstractError;
import site.niufan.common.exception.category.IllegalArgumentException;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class IllegalArgumentError<Code, Message> extends AbstractError<Code, Message, IllegalArgumentException> {

    public IllegalArgumentError(Code code, Message message) {
        super(code, message);
    }

    @Override
    public Class<IllegalArgumentException> getType() {
        return IllegalArgumentException.class;
    }
}
