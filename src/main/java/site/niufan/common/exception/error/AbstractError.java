package site.niufan.common.exception.error;

import java.lang.reflect.ParameterizedType;

/**
 * 抽象的错误
 * @author Fan Niu
 * @since 2018/7/17
 */
public abstract class AbstractError<Code, Message, Type> implements Error<Code, Message, Type> {

    private Code code;

    private Message message;

    public AbstractError(Code code, Message message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Code getCode() {
        return code;
    }

    @Override
    public Message getMessage() {
        return message;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Class<Type> getType() {
        return (Class<Type>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[2];
    }

    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if (object instanceof Error) {
            result = equals((Error) object);
        }
        return result;
    }

    @Override
    public boolean equals(Error that) {
        boolean result = false;
        if (that != null) {
            Object thisCode = this.getCode();
            Object thatCode = that.getCode();
            result = (thisCode == null && thatCode == null)
                    || (thisCode != null && thisCode.equals(thatCode));
        }
        return result;
    }

    @Override
    public String toString() {
        return ErrorFormat.format(this);
    }
}
