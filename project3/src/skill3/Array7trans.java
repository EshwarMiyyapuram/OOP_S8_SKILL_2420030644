package skill3;
import java.util.Scanner;
public class Array7trans {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of rows of first matrix: ");
	        int r1 = sc.nextInt();
	        System.out.println("Enter number of columns of first matrix: ");
	        int c1 = sc.nextInt();
	        int[][] arr1 = new int[r1][c1];
	        System.out.println("Enter elements of first matrix:");
	        for (int i = 0; i < r1; i++)
	            for (int j = 0; j < c1; j++)
	                arr1[i][j] = sc.nextInt();
	        System.out.println("Transpose of matrix is: ");
	        for (int i = 0; i < c1; i++){
	            for (int j = 0; j < r1; j++){
	                System.out.print(arr1[j][i] + " ");
	        }
	            System.out.println();
	        }
	    }

}
