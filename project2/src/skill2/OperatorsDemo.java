package skill2;
import java.util.Scanner;
public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b));
        System.out.println("Relational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("Logical Operators");
        System.out.println("(a > 0) && (b > 0): " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b < 0): " + ((a > 0) || (b < 0)));
        System.out.println("!(a > 0): " + !(a > 0));
        System.out.println("Assignment Operators");
        int x = a;
        System.out.println("x = " + x);
        x += b;
        System.out.println("x += b → " + x);
        x -= b;
        System.out.println("x -= b → " + x);
        x *= b;
        System.out.println("x *= b → " + x);
        x /= b;
        System.out.println("x /= b → " + x);
        System.out.println("Unary Operators");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); 
        System.out.println("a++ = " + (a++));
        System.out.println("--a = " + (--a)); 
        System.out.println("a-- = " + (a--));
    }
}