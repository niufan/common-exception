package site.niufan.common.exception.error;

/**
 * 错误码接口
 * @author Fan Niu
 * @since 2018/7/17
 */
public interface Error<Code, Message, Type> {

    /**
     * 获取编码
     * @return 编码
     */
    Code getCode();

    /**
     * 获取信息
     * @return 信息
     */
    Message getMessage();

    /**
     * 获取错误类型
     * @return 错误类型
     */
    Class<Type> getType();

    /**
     * 判断是否相等
     * @param error 错误
     * @return 是否相等
     */
    boolean equals(Error error);

    /**
     * 转换成字符串
     * @return 字符串
     */
    @Override
    String toString();

}
