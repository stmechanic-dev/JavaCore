package Lesson3.string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    String[] strings = {
            "String",
            "Array",
            "The longest string here",
            "Java",
            "Maven"
    };

    BigString result = StringUtils.getTheBiggestStringFromArray(strings);
    BigString expected = new BigString(23, "The longest string here");

    @Test
    public void getTheBiggestStringFromArrayTestLenght() {

        Assert.assertEquals(expected.getLength(), result.getLength());
    }

    @Test
    public void getTheBiggestStringFromArrayTestValue() {

        Assert.assertEquals(expected.getValue(), result.getValue());
    }
}