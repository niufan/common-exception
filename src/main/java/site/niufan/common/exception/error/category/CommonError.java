package site.niufan.common.exception.error.category;

import site.niufan.common.exception.category.CommonException;
import site.niufan.common.exception.error.AbstractError;

/**
 * @author Fan Niu
 * @since 2018/8/18
 */
public class CommonError<Code, Message> extends AbstractError<Code, Message, CommonException> {

    public CommonError(Code code, Message message) {
        super(code, message);
    }

    @Override
    public Class<CommonException> getType() {
        return CommonException.class;
    }
}
