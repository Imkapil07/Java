class swappingDiffMethod {
    public static void main(String[] args) {

        //Method 1
        int a = 10 , b = 20;
        System.out.println("Before swapping values are a = " + a + " b = " + b );
        int temp = a;
               a = b;
               b = temp;
        System.out.println("After swapping values are a = " + a + " b = " + b );

        //Method 2
        int c = 10  , d = 20 ;
        System.out.println("Before swapping values are c = " + c + " d = " + d );
        c = c + d; //10 + 20 = 30
        d = c - d; //30 - 10 = 10
        c = c - d; //30 - 10 = 20
        System.out.println("After swapping values are c = " + c + " d = " + d );

        //Method 3 - use * and /  operator
        // In this method value of x and y should not be zero
        int x = 10 , y = 20 ;
        System.out.println("Before swapping values are x = " + x + " y = " + y );
        x = x * y ;  // 10 * 20 = 200
        y = x / y ;  // 200 / 20 = 10
        x = x / y ;  // 200 / 10 = 20
        System.out.println("After swapping values are x = " + x + " y = " + y );


        //Method 4 - using bitwise XOR ( ^ )
        int i = 10 , j = 20 ;
        System.out.println("Before swapping values are i = " + i + " j = " + j );
        //Binary Values - 10 = 1010 , 20 = 10100
        /* XOR Truth Table - 
         *                   x y x^y
         *                   0 0  0
         *                   0 1  1
         *                   1 0  1
         *                   1 1  0
         */
        i = i ^ j ; // 1010 - 10100 = 11110 = 30
        j = i ^ j ; // 30 ^ 20 -- 11110 - 10100 = 10 
        i = i ^ j ; // 30 - 10 -- 
        System.out.println("After swapping values are i = " + i + " j = " + j ); 

        //Method 5 - USing Single Statement  
        int k = 10 , l = 20 ;
        System.out.println("Before swapping values are k = " + k + " l = " + l );
        // It work from right to left <-- ( a = b ) = 20 mean a = 20 now  and a + b = 30 now
        l = k + l - ( k = l ); // k = 10 now
        System.out.println("After swapping values are k = " + k + " l = " + l );
    }
}