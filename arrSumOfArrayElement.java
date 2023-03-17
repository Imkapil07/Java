public class arrSumOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {10, 2,3};
        int sum =  0 ;
        int multi = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];  
            multi = multi * arr[i];
        } 
        System.out.println(sum);
        System.out.print(multi);
    }
}
