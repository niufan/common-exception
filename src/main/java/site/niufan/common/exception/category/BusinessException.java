package site.niufan.common.exception.category;

import site.niufan.common.exception.message.category.BusinessExceptionMessage;

/**
 * 业务异常类
 * @author Fan Niu
 * @since 2018/7/17
 */
public class BusinessException extends CommonException {

    public BusinessException(BusinessExceptionMessage message) {
        super(message);
    }

    public BusinessException(BusinessExceptionMessage message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}
