public class printallprime {
    public static void main(String[] args) {
        for(int num=1 ; num <= 100 ; num++){
            int temp = 0 ;
            for(int i = 2 ; i <= num-1 ; i++){
                if(num%i==0){
                    temp = temp + 1 ;
                }
            } 
            if(temp==0){
                System.out.println(num);
            }
        }
    }
}

// TKE INPORT FORM THE USER :)
/*import java.util.*;;
public class printallprime {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start value : ");
        int strt = sc.nextInt();
        System.out.print("Enter End Value :");
        int end = sc.nextInt();
        for(int num=strt ; num <= end ; num++){
            int temp = 0 ;
            for(int i = 2 ; i <= num-1 ; i++){
                if(num%i==0){
                    temp = temp + 1 ;
                }
            } 
            if(temp==0){
                System.out.println(num);
            }
        }
    }
}*/