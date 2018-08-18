package site.niufan.common.exception.category;

import site.niufan.common.exception.error.Error;

/**
 * 业务异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class BusinessException extends CommonException {

    public BusinessException(Error errorCode) {
        super(errorCode);
    }

    public BusinessException(Error errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public BusinessException(CommonException commonException) {
        super(commonException);
    }
}
