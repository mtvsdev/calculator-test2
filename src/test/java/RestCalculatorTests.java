import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RestCalculatorTests {

    private RestCalculator restCalc;

    @BeforeEach
    public void setUp() {
        System.out.println("setUp 동작 확인...");
        this.restCalc = new RestCalculator();
    }

    @DisplayName("20과 3을 넣었을 때 2라는 결과가 계산되는지 확인")
    @Test
    public void testRestTwoNumbers() {

        // given
        int num1 = 20;
        int num2 = 3;

        // when
        int result = restCalc.restTwoNumbers(num1, num2);

        // then (verify)
        Assertions.assertEquals(2, result);
    }

    @DisplayName("30과 3을 넣엇을 때 0이라는 결과가 계산되는지 확인")
    @Test
    public void testTestTwoNumbers2() {

        // given
        int num1 = 30;
        int num2 = 3;

        // when
        int result = restCalc.restTwoNumbers(num1, num2);

        // then (verify)
        Assertions.assertEquals(0, result);
    }

    @DisplayName("20과 0을 넣었을 때 예외 발생하는지 확인")
    @Test
    public void testZeroArgument() {

        // given
        int num1 = 20;
        int num2 = 0;

        // when & then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> restCalc.restTwoNumbers(num1, num2)
        );
    }
}
