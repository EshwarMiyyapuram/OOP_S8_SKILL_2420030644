package skill2;
import java.util.Scanner;
public class WrapperClass {
public static void main(String[] args) {
int a=10;
Integer aObj=Integer.valueOf(a);
Integer autoBoxed=a;
int unBoxed=aObj.intValue();
int autoUnBoxed=autoBoxed;
System.out.println("Primitive int a: "+a);
System.out.println("Boxed Integer aObj: "+aObj);
System.out.println("Auto-boxed Integer: "+autoBoxed);
System.out.println("Unboxed int: "+unBoxed);
System.out.println("Auto-unboxed int: "+autoUnBoxed);
double d=56.78;
Double dObj=d;
System.out.println("Double object: "+dObj);
String str="123";
int num=Integer.parseInt(str);
System.out.println("Parsed integer from string: "+num);
}
}