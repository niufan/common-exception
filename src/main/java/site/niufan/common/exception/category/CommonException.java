package site.niufan.common.exception.category;

import site.niufan.common.exception.error.Error;

/**
 * 通用异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class CommonException extends RuntimeException {

    public CommonException(Error errorCode) {
        super(String.valueOf(errorCode));
    }

    public CommonException(Error errorCode, Throwable cause) {
        super(String.valueOf(errorCode), cause);
    }

    public CommonException(CommonException commonException) {
        super(commonException);
    }

    public Throwable getRootCause() {
        Throwable cause = this;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    public CommonException getRootCommonException() {
        CommonException cause = this;
        while (cause.getCause() != null && cause.getCause() instanceof CommonException) {
            cause = (CommonException) cause.getCause();
        }
        return cause;
    }
}
