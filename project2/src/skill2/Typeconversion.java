package skill2;
public class Typeconversion {
	    public static void main(String[] args) {
	        System.out.println("Implicit Type Conversion");
	        int num = 100;
	        long bigNum = num; 
	        float floatVal = bigNum; 
	        System.out.println("int value: " + num);
	        System.out.println("Converted to long: " + bigNum);
	        System.out.println("Converted to float: " + floatVal);
	        System.out.println("Explicit Type Conversion");
	        double pi = 3.14159;
	        int piInt = (int) pi;
	        long longVal = 9876543210L;
	        int intVal = (int) longVal;
	        System.out.println("double value: " + pi);
	        System.out.println("Converted to int (pi): " + piInt);
	        System.out.println("long value: " + longVal);
	        System.out.println("Converted to int (with data loss): " + intVal);
	    }
	}