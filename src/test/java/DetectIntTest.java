import org.junit.Assert;
import org.junit.Test;

public class DetectIntTest {
    @Test
    public void checkInt_45222_ReturnsTrue() {
        // Arrange
        final boolean expected = true;

        // Act
        final boolean actual = DetectInt.checkInt("45222");

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkInt_This_Is_A_Test4me_ReturnsTrue() {
        // Arrange
        final boolean expected = true;

        // Act
        final boolean actual = DetectInt.checkInt("This Is A Test4me");

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkInt_IAMGOOD_ReturnsTrue() {
        // Arrange
        final boolean expected = false;

        // Act
        final boolean actual = DetectInt.checkInt("IAMGOOD");

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkInt_There_Is_no_Integer_ReturnsTrue() {
        // Arrange
        final boolean expected = false;

        // Act
        final boolean actual = DetectInt.checkInt("There Is no Integer");

        // Assert
        Assert.assertEquals(expected, actual);
    }
}
