package site.niufan.common.exception.category;

import site.niufan.common.exception.error.Error;

/**
 * 数据异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class DataException extends CommonException {

    public DataException(Error errorCode) {
        super(errorCode);
    }

    public DataException(Error errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public DataException(CommonException commonException) {
        super(commonException);
    }
}
