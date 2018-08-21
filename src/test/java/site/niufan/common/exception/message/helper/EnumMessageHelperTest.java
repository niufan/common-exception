package site.niufan.common.exception.message.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import site.niufan.common.exception.category.CommonException;
import site.niufan.common.exception.category.Failure;
import site.niufan.common.exception.category.Success;
import site.niufan.common.exception.message.Message;
import site.niufan.common.exception.message.enums.DefaultStringFailureMessage;
import site.niufan.common.exception.message.enums.DefaultStringSuccessMessage;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Fan Niu
 * @since 2018/8/20
 */
@RunWith(JUnit4.class)
public class EnumMessageHelperTest {

    @Test
    public void test() {
        String[] packages = {"site.niufan.common"};
        EnumMessageHelper simpleErrorEnumHelper = new EnumMessageHelper(packages);
        Collection<Message> errors = simpleErrorEnumHelper.messages();
        System.out.println(Arrays.toString(errors.toArray()));
        Message message;
        message = simpleErrorEnumHelper.codeOf(DefaultStringSuccessMessage.SUCCESS.getCode());
        if (CommonException.class.isAssignableFrom(message.getType())) {
            System.out.println("Failure");
        } else if (Success.class.isAssignableFrom(message.getType())) {
            System.out.println("Success");
        }
        if (DefaultStringSuccessMessage.SUCCESS.equals(message)) {
            System.out.println(message + "|" + message.getType().getName());
        }
        message = simpleErrorEnumHelper.codeOf(DefaultStringFailureMessage.FAILURE.getCode());
        if (Failure.class.isAssignableFrom(message.getType())) {
            System.out.println("Failure");
        } else if (Success.class.isAssignableFrom(message.getType())) {
            System.out.println("Success");
        }
        if (DefaultStringFailureMessage.FAILURE.equals(message)) {
            System.out.println(message + "|" + message.getType().getName());
        }
    }
}
