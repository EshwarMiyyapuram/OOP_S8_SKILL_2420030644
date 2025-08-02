package skill3;
import java.util.Scanner;
public class Array3rev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int[] rev = new int[n];
         for(int i=n-1;i>=0;i--){
           rev[n-i-1]=arr[i];
         }
         for(int i=0;i<n;i++)
           System.out.print(rev[i]+" ");
      }
}
