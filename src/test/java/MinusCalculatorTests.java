// test

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusCalculatorTests {

    private MinusCalculator minusCalc;

    @BeforeEach
    public void setUp() {
        minusCalc = new MinusCalculator();

    }


    @DisplayName("20에서 10을 뺀 결과가 10인지 확인합니다.")
    @Test
    public void testMinusTwoNumbers1() {

        // given
        int num1 = 20;
        int num2 = 10;

        // when
        //MinusCalculator minusCalc = new MinusCalculator();
        int result = minusCalc.minusTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(10, result);

    }
    @DisplayName("40에서 20을 뺀 결과가 20인지 확인합니다.")
    @Test
    public void testMinusTwoNumbers2() {

        // given
        int num1 = 40;
        int num2 = 20;

        // when
        //MinusCalculator minusCalc = new MinusCalculator();
        int result = minusCalc.minusTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(20, result);

    }

}