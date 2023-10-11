import java.util.*;
public class simple_operation {

        public static void main(String []args) {
                System.out.println("Instruction for Simple Calculator \n"+
                                    "Perform number of Operation");
                System.out.println("Press Symbol(+) for Addition \n" +
                        "Press Symbol(-) For Subtraction \n" +
                        "Press Symbol(*) For Multiplication \n " +
                        "Press Symbol(/) For Division \n");
                        Scanner sc = new Scanner(System.in);
                        double result;
                        System.out.println("Enter the number");
                        double num1 = sc.nextDouble();
                        System.out.println("Enter the number");
                        double num2 = sc.nextDouble();
                        System.out.println("Enter the Arithmetic Operation");
                        char operation = sc.next().charAt(0);

                switch (operation) {
                                case '+': {
                                        result = num1 + num2;
                                        System.out.println(num1 + " + " + num2 + " = " + result);
                                        break;
                                }
                                case '-': {
                                        result = num1 - num2;
                                        System.out.println(num1 + " - " + num2 + " = " + result);
                                        break;
                                }
                                case '*': {
                                        result = num1 * num2;
                                        System.out.println(num1 + " * " + num2 + " = " + result);
                                        break;
                                }
                                case '/': {
                                        result = num1 / num2;
                                        System.out.println(num1 + " / " + num2 + " = " + result);
                                        break;
                                }
                                default:
                                        System.out.println("Invalid operator");
                }
        }
}
