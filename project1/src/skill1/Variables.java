package skill1;
import java.util.Scanner;
public class Variables {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your name:");
	        String name = sc.nextLine();
	        System.out.println("Enter your roll number (long):");
	        long rollNumber = sc.nextLong();
	        System.out.println("Enter your marks (float):");
	        float marks = sc.nextFloat();
	        System.out.println("Enter your gender (M/F):");
	        char gender = sc.next().charAt(0);
	        System.out.println("Did you pass? (true/false):");
	        boolean passed = sc.nextBoolean();
	        System.out.println("Name       : " + name);
	        System.out.println("Roll No.   : " + rollNumber);
	        System.out.println("Marks      : " + marks);
	        System.out.println("Gender     : " + gender);
	        System.out.println("Passed     : " + passed);
	  }
}
