package site.niufan.common.exception.category;

import site.niufan.common.exception.message.category.DataExceptionMessage;

/**
 * 数据异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class DataException extends CommonException {

    public DataException(DataExceptionMessage message) {
        super(message);
    }

    public DataException(DataExceptionMessage message, Throwable cause) {
        super(message, cause);
    }

    public DataException(Throwable cause) {
        super(cause);
    }
}
