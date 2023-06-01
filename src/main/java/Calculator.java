import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Multiply mul = new Multiply();
        int mulRes = mul.multiplyTwoNumbers(num1, num2);
        System.out.printf("Result of Calculation \n 곱셈 : %d\n", mulRes);
    }
}
