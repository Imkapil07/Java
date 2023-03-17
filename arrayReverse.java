public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        
        System.out.print("Before  Reverse :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i] + " ");
        } 
        
        System.out.println();
        System.out.print("After Reverse :");
        for(int i = 5 ; i >= 0 ; i--){
            System.out.print(" " + arr[i] + " ");
        } 
    }
}
