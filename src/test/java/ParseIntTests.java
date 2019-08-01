import org.junit.Assert;
import org.junit.Test;

public final class ParseIntTests {
    @Test
    public void getValue_123123_Returns123123() {
        // Arrange
        final int expectedValue = 123123;
        final boolean expectedIsInt = true;

        // Act
        ParseInt test = new ParseInt("123123");
        final int actualValue = test.getValue();
        final boolean actualIsInt = test.getIsInt();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedIsInt, actualIsInt);
    }

    @Test
    public void getValue_Neg123123_ReturnsNeg123123() {
        // Arrange
        final int expectedValue = -123123;
        final boolean expectedIsInt = true;

        // Act
        ParseInt test = new ParseInt("-123123");
        final int actualValue = test.getValue();
        final boolean actualIsInt = test.getIsInt();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedIsInt, actualIsInt);
    }

    @Test
    public void getValue_123123123123123_ReturnsNotInt() {
        // Arrange
        final int expectedValue = -1;
        final boolean expectedIsInt = false;

        // Act
        ParseInt test = new ParseInt("123123123123123");
        final int actualValue = test.getValue();
        final boolean actualIsInt = test.getIsInt();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedIsInt, actualIsInt);
    }

    @Test
    public void getValue_abcdefg_ReturnsNotInt() {
        // Arrange
        final int expectedValue = -1;
        final boolean expectedIsInt = false;

        // Act
        ParseInt test = new ParseInt("abcdefg");
        final int actualValue = test.getValue();
        final boolean actualIsInt = test.getIsInt();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedIsInt, actualIsInt);
    }

    @Test
    public void getValue_aa123aaa_ReturnsNotInt() {
        // Arrange
        final int expectedValue = -1;
        final boolean expectedIsInt = false;

        // Act
        ParseInt test = new ParseInt("aa123aaa");
        final int actualValue = test.getValue();
        final boolean actualIsInt = test.getIsInt();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedIsInt, actualIsInt);
    }
}
