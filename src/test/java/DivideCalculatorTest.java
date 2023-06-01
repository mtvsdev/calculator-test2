import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivideCalculatorTest {

    private DivideCalculatorTest divideCalc;

    @BeforeEach
    public void setUp() {
        this.divideCalc = new DivideCalculatorTest();
    }
    //검증내용
    // 1. 30을 4로 나눌 때 7이 나오는지 확인
    // 2. 60을 7로 나눌 때 8이 나오는지 확인
    // 3. 나눌 수가 0일때 IllegalArgumentException이 발생하는지 확인

    @DisplayName("30을 4로 나눌 때 7이 나오는지 확인")
    @Test
    public void divideTwoNumbers() {

        int num1 = 30;
        int num2 = 4;

        DivideCalculator divideCalc = new DivideCalculator();
        int result = divideCalc.divideTwoNumbers(num1, num2);

        Assertions.assertEquals(7, result);

    }

    @DisplayName("60을 7로 나눌 때 8이 나오는지 확인")
    @Test
    public void divideTwoNumbers2() {

        int num1 = 60;
        int num2 = 7;

        DivideCalculator divideCalc = new DivideCalculator();
        int result = divideCalc.divideTwoNumbers(num1, num2);

        Assertions.assertEquals(8, result);
    }

    @DisplayName("나눌수가 0일때 IllegalArgumentException이 발생하는지 확인")
    @Test
    public void divideTwoNumbers3() {

        int num1 = 20;
        int num2 = 0;

        DivideCalculator divideCalc = new DivideCalculator();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> divideCalc.divideTwoNumbers(num1, num2)
        );
    }
}