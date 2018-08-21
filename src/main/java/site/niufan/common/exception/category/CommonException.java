package site.niufan.common.exception.category;

import site.niufan.common.exception.message.category.ExceptionMessage;

/**
 * 通用异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class CommonException extends RuntimeException implements Failure {

    public CommonException(ExceptionMessage message) {
        super(String.valueOf(message));
    }

    public CommonException(ExceptionMessage message, Throwable cause) {
        super(String.valueOf(message), cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
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
