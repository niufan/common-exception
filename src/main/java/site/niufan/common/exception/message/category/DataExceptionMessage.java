package site.niufan.common.exception.message.category;

import site.niufan.common.exception.category.DataException;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class DataExceptionMessage<Code, Message> extends ExceptionMessage<Code, Message, DataException> {

    public DataExceptionMessage(Code code, Message message) {
        super(code, message);
    }

}
