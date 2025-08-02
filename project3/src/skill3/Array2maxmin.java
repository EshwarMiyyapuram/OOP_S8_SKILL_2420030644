package skill3;
import java.util.Scanner;
public class Array2maxmin {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter size of array: ");
	      int n = sc.nextInt();
	      int[] arr = new int[n];
	      for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	      }
	      int maxarr=arr[0];
	      int minarr=arr[0];
	      for(int i=0;i<n;i++){
	        if(arr[i]>maxarr){
	          maxarr=arr[i];
	        }
	        if(arr[i]<minarr){
	          minarr=arr[i];
	        }
	      }
	      System.out.println("Maximum element in array is: "+maxarr);
	      System.out.println("Minimum element in array is: "+minarr);
	    }

}
