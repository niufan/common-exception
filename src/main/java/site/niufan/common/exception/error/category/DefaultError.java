package site.niufan.common.exception.error.category;

import site.niufan.common.exception.error.AbstractError;

/**
 * @author Fan Niu
 * @since 2018/8/18
 */
public class DefaultError<Code, Message, Data> extends AbstractError<Code, Message, Data> {
    public DefaultError(Code code, Message message) {
        super(code, message);
    }

    @Override
    public Class<Data> getType() {
        return null;
    }
}
