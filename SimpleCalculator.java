import java.util.Scanner;

public class SimpleCalculator {
    public static void add(int a, int b) {
        int result1 = a + b;
        System.out.println(a + " + " + b + " = " + result1);
    }

    public static void sub(int a, int b) {
        int result2 = a - b;
        System.out.println(a + " - " + b + " = " + result2);
    }

    public static void mul(int a, int b) {
        int result3 = a * b;
        System.out.println(a + " * " + b + " = " + result3);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.err.println("ERROR: division by zero is not allowed.");
            return;
        }
        double result4 = (double) a / b;
        System.out.println(a + " / " + b + " = " + result4);
    }

    public static void mod(int a, int b) {
        if (b == 0) {
            System.err.println("ERROR: division by zero is not allowed.");
            return;
        }
        int result5 = a % b;
        System.out.println(a + " % " + b + " = " + result5);
    }

    public static void power(int base, int exponent) {
        if (exponent == 0) {
            System.out.println(base + "^" + exponent + " = 1");
            return;
        }
        if (exponent < 0) {
            double positivePower = Math.pow(base, Math.abs(exponent));
            double result6 = 1.0 / positivePower;
            System.out.println(base + "^" + exponent + " = " + result6);
            return;
        }
        double result = Math.pow(base, exponent);
        if (result == Math.round(result)) {
            System.out.println(base + "^" + exponent + " = " + (long) result);
        } else {
            System.out.println(base + "^" + exponent + " = " + result);
        }
    }

    public static void sqrt(double a) {
        if (a < 0) {
            System.err.println("ERROR: square root of negative number is not allowed.");
            return;
        }
        double result7 = Math.sqrt(a);
        System.out.println("√" + a + " = " + result7);
    }

    public static void factorial(int a) {
        if (a < 0) {
            System.err.println("ERROR: factorial of negative number is not allowed.");
            return;
        }
        long result8 = 1;
        for (int i = 1; i <= a; i++) {
            result8 *= i;
        }
        System.out.println(a + "! = " + result8);
    }

    public static void abs(int a) {
        int result9 = Math.abs(a);
        System.out.println("|" + a + "| = " + result9);
    }

    public static void average(int a, int b) {
        double result10 = (double) (a + b) / 2;
        System.out.println("Average(" + a + "," + b + ") = " + result10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== Simple Calculator =====");
        System.out.println("Please select the arithmetic type you want:");

        while (true) {
            System.out.println();
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Square Root (√)");
            System.out.println("8. Factorial (!)");
            System.out.println("9. Absolute Value (|x|)");
            System.out.println("10. Average");
            System.out.println("0. To exit this program");
            System.out.println();
            System.out.print("Enter your option(0-10): ");
            int option = s.nextInt();

            if (option == 0) {
                System.out.println("Thank you for choosing this program, see you!");
                break;
            }

            if (option < 1 || option > 10) {
                System.err.println("ERROR: the valid option range is 0-10.");
                continue;
            }

            if (option == 7 || option == 8 || option == 9) {
                System.out.println("Enter number:");
                int num = s.nextInt();
                switch (option) {
                    case 7:
                        sqrt(num);
                        break;
                    case 8:
                        factorial(num);
                        break;
                    case 9:
                        abs(num);
                        break;
                }
            } else {
                System.out.println("Enter your first number:");
                int num1 = s.nextInt();
                System.out.println("Enter your second number:");
                int num2 = s.nextInt();
                switch (option) {
                    case 1:
                        add(num1, num2);
                        break;
                    case 2:
                        sub(num1, num2);
                        break;
                    case 3:
                        mul(num1, num2);
                        break;
                    case 4:
                        div(num1, num2);
                        break;
                    case 5:
                        mod(num1, num2);
                        break;
                    case 6:
                        power(num1, num2);
                        break;
                    case 10:
                        average(num1, num2);
                        break;
                }
            }
            System.out.println("=============================");
        }
        s.close();
    }
}
