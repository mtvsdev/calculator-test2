import java.util.*;
public class Calculator {
    public static void main(String[] args){
        //숫자 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //계산 기능 객체
        PlusCalculator plus = new PlusCalculator();
        MinusCalculator minus = new MinusCalculator();
        MultiplyCalculator mul = new MultiplyCalculator();
        DivideCalculator div = new DivideCalculator();
        RestCalculator mod = new RestCalculator();

        //결과 값
        int plusRes = plus.sumTwoNumbers(num1, num2);
        int minusRes = minus.minusTwoNumbers(num1, num2);
        int mulRes = mul.multiplyTwoNumbers(num1, num2);
        int divRes = div.divideTwoNumbers(num1, num2);
        int modRes = mod.restTwoNumbers(num1, num2);

        System.out.printf("Result of Calculation \n 덧셈 : %d\n 뺄셈 : %d\n 곱셈 : %d\n 나눗셈 : %d\n 나머지 : %d\n", plusRes, minusRes, mulRes, divRes, modRes);
    }
}
