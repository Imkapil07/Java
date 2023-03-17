public class arrLinearsearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int x = 300 ;
        int ans = -1 ; 

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                ans = i ;
                break; // use to terminate loop if same elements is found to ignore last same elements 
            }
        } 
        System.out.print("Found " + x + " at index " + ans);
    }
}
