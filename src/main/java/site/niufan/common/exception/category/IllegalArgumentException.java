package site.niufan.common.exception.category;

import site.niufan.common.exception.error.Error;

/**
 * 不合法的参数异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class IllegalArgumentException extends CommonException {

    public IllegalArgumentException(Error errorCode) {
        super(errorCode);
    }

    public IllegalArgumentException(Error errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public IllegalArgumentException(CommonException commonException) {
        super(commonException);
    }
}
