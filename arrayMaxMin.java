import java.util.*;
import javax.swing.ScrollPaneLayout;
public class arrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array :");
        int n = sc.nextInt();
        System.out.print("Enter array ELments :");
        int[] arr = new int[n]; 
        
        for(int i = 0 ; i < n ; i++){
               arr[i] = sc.nextInt();
        } 
             int max = arr[0];
             int min = arr[0];

             for(int i = 1 ; i < arr.length ; i++){
                if(max < arr[i])
                max = arr[i];
                if(min > arr[i])
                min = arr[i];
             }
      System.out.print("Maximum Value = "+ max + " Minimum Value ="+ min);

    }
}
