package site.niufan.common.exception.error.category;

import site.niufan.common.exception.category.DataException;
import site.niufan.common.exception.error.AbstractError;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class DataError<Code, Message> extends AbstractError<Code, Message, DataException> {

    public DataError(Code code, Message message) {
        super(code, message);
    }

    @Override
    public Class<DataException> getType() {
        return DataException.class;
    }
}
