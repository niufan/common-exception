package site.niufan.common.exception.message.helper;

import site.niufan.common.exception.message.Message;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 信息帮助
 * @author Fan Niu
 * @since 2018/7/17
 */
public interface MessageHelper<Code, E extends Message> {

    default E codeOf(Code code) {
        E result;
        List<E> matched = new ArrayList<>();
        for (E temp: messages()) {
            if (code == null && temp.getCode() == null
                    || code != null && temp.getCode() != null && code.equals(temp.getCode())) {
                matched.add(temp);
            }
        }
        int size = matched.size();
        if (size <= 0) {
            throw new IllegalArgumentException(String.format("Message code[%s] not match [%s].", code, Message.class));
        } else if (size > 1) {
            StringBuilder sb = new StringBuilder();
            for (E one: matched) {
                sb.append("\n");
                sb.append(one.getClass().getName());
            }
            String messageClassNames = sb.toString();
            throw new IllegalArgumentException(String.format("Message code[%s] must be match one rather than match %s %s:%s", code, Message.class, size, messageClassNames));
        } else {
            result = matched.get(0);
        }
        return result;
    }

    Collection<E> messages();
}
