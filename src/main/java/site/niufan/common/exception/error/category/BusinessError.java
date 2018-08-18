package site.niufan.common.exception.error.category;

import site.niufan.common.exception.category.BusinessException;
import site.niufan.common.exception.error.AbstractError;

/**
 * @author Fan Niu
 * @since 2018/7/20
 */
public class BusinessError<Code, Message> extends AbstractError<Code, Message, BusinessException> {

    public BusinessError(Code code, Message message) {
        super(code, message);
    }

    @Override
    public Class<BusinessException> getType() {
        return BusinessException.class;
    }
}
