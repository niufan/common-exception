package site.niufan.common.exception.category;

import site.niufan.common.exception.message.category.IllegalArgumentExceptionMessage;

/**
 * 不合法的参数异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class IllegalArgumentException extends CommonException {

    public IllegalArgumentException(IllegalArgumentExceptionMessage message) {
        super(message);
    }

    public IllegalArgumentException(IllegalArgumentExceptionMessage message, Throwable cause) {
        super(message, cause);
    }

    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
