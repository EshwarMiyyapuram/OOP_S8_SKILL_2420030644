package skill3;
import java.util.Scanner;
public class Array5sumofmatrix {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];  
    }
}
        System.out.println("Sum of matrices: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(sum[i][j] + " ");
    }
            System.out.println();
}
    }
}
