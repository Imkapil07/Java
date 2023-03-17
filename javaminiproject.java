// Java In One Program Mini Project :
import java.util.Scanner;
public class javaminiproject {

     public static void main(String []args){
         int ch ;
       System.out.println(" ******************************************\n");  
             System.out.println("\n BASIC PROGRAMS OF 'JAVA' \n \t  \t\t By-KAPIL RAI : \n\n"); 
             System.out.println(" \t \t: BASIC JAVA PROGRAMS :\n ");
         System.out.println(" \n 1. Hello World\n ");
         System.out.println(" 2. Sum Of Two Numbers\n");
         System.out.println(" 3. Subtration of Two Numbers\n ");
         System.out.println(" 4. Multiplication of Two Number\n ");  
         System.out.println(" 7. Check Year Is Leaf OR Not\n  ");  
         System.out.println(" 8. Check Given Integer Is ODD & EVEN \n");  
         System.out.println(" 11. Area Of Circle Java Program \n"); 
         System.out.println(" 12. Area Of Triangle Java Program \n");  
         System.out.print(" 13. Bitwise AND Operator \n ");
        
         System.out.println("\n\n\t\t : ADVANCED SSIMPLE PROGRAMMING :\n\n ");  
         
         System.out.println(" 50. Factorial Program In Java \n"); 

        System.out.println(" \n******************************************");
          Scanner s=new Scanner(System.in);
        System.out.print("\nEnter the choice : ");  
        ch =s.nextInt();
        switch(ch){
            case 1 :  
            System.out.println("Source Code :");
            System.out.println("--------------------------");
            System.out.println("public class Main{ \n  public static void main(String[ ] args){ \n System.out.print('hello world'');\n}\n}\n");
            System.out.println("Output : ");
               System.out.println("Hello World");
                break ;
            case 2 : {
             System.out.println("Source Code :");
            System.out.println("-----------------------------");
            System.out.print("import java.util.Scanner;\n public class Main{ \n  public static void main(String[ ] args);\n int a , b , sum ; \n Scanner sc=new Scanner(System.in);\n  System.out.print(''Enter the Values of a and b ');\n a = sc.nextInt(); \n b = sc.nextInt(); \n Sum = a + b ; \n System.out.print(''Sum is : ''+sum);\n}\n}\n");  
            System.out.println("--------------------------------");
            System.out.println("Output : ");
                    int a , b , sum ;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the Values of a and b : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    sum = a + b ;
                    System.out.print(" The Sum Is :"+sum); }
                break ;
            case 3 :  {  
             System.out.println("Source Code :");
            System.out.println("-----------------------------");
            System.out.print("import java.util.Scanner;\n public class Main{ \n  public static void main(String[ ] args);\n int a , b , sub ; \n Scanner sc=new Scanner(System.in);\n  System.out.print(''Enter the Values of a and b ');\n a = sc.nextInt(); \n b = sc.nextInt(); \n sub= a - b ; \n System.out.print(''Subtration is : ''+sub);\n}\n}\n");  
            System.out.println("--------------------------------");
                   int a , b , sub ;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the Values of a and b : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    sub = a - b ;
                    System.out.print(" The sub Is :"+sub); }
                break;
            case 4 :
               
   

                break;
                      case 5 :
                break;
                      case 6 :
                break;
                      case 7 :  
                          {
                   
                              int year;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any Year:");
    year = scan.nextInt();
    scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
   
                          }
                break;
                      case 8 : {
                           int num;
                    System.out.print("Enter an Integer number: ");
                    Scanner input = new Scanner(System.in);
                     num = input.nextInt();

                   if ( num % 2 == 0 )
                            System.out.println(num+" is an even number.");
                            else
                     System.out.println(num+" is an odd number.");
                      }
                break;  
               
                case 11 :
                    {
                     System.out.println("---------------------------------------");
                       System.out.println(" import java.util.Scanner;\nclass AreaOfCircle \n\n{ \n\n  public static void main(String args[]) \n  {   \n  Scanner s= new Scanner(System.in); \n System.out.println(''Enter the radius:'');     \n  double r= s.nextDouble();  \n  double  area=(22*r*r)/7 ;\n  System.out.println(''Area of Circle is: '' + area); \n  } \n } \n ");
                  System.out.println("------------------------------------------");
                  Scanner s1= new Scanner(System.in);
       
                  System.out.println("Enter the radius:");
                  double r= s1.nextDouble();
                  double  area=(22*r*r)/7 ;
                  System.out.println("Area of Circle is: " + area);    
                  break ;
                    } 
                    case 12 :
                    { 
                        System.out.println("---------------------------------------"); 
                     System.out.println("import java.util.Scanner; \n public class AreaOfTriangle \n{ \n public static void main(String args[]) \n\n {   \n\n  Scanner s= new Scanner(System.in);\n System.out.println(''Enter the width of the Triangle:'');\ndouble b= s.nextDouble();\n\n   System.out.println(''Enter the height of the Triangle:'');\ndouble h= s.nextDouble();\n\n  //Area = (width*height)/2\n     double area=(b*h)/2;\n System.out.println(''Area of Triangle is: '' + area);   \n    }\n}\n ");  
                     System.out.println("-----------------------------------------\n");
                     Scanner s2= new Scanner(System.in);
        
                        System.out.println("Enter the width of the Triangle:");
                        double b= s2.nextDouble();
                
                        System.out.println("Enter the height of the Triangle:");
                         double h= s2.nextDouble();
                
                                 //Area = (width*height)/2
                     double area=(b*h)/2;
                     System.out.println("Area of Triangle is: " + area);       
                    
                     break ;  
                    } 
                 /*    case 13 ;  
                    {
                    System.out.println("--------------------------------------------------");
                    System.out.println("here program code :");

                    int w , z ; 
                    Scanner xy = new Scanner(System.in); 
                    System.out.println("Enter the Value Of w nd z ``"); 
                    w = xy.nextInt();
                    z = xy.nextInt();
                    System.out.println(w & z);
                   
                    break ;  
                    }*/
                     case 50 :
                    {  
                        System.out.println(" ---------------------------------------"); 
                        System.out.println("import java.util.Scanner; \n public class Factorial \n { \n public static void main(String[] args)\n { \n int n , fact = 1 ; \n Scanner s=new Scanner(System.in); \n System.out.println(''Enter the any number : ''); \n n = s.nextInt();    \n  for(int i=1 ; i<=n ; i++) { \n     fact = fact * i ;     \n} \n System.out.print(''Factorial of '' +n+ '' is : '' +fact); \n } \n } \n ");
                        System.out.println(" ---------------------------------------"); 
                       
                              int n , fact = 1 ;
                            Scanner r=new Scanner(System.in);
                            System.out.println("Enter the any number : ");
                              n = r.nextInt();  
                            
                               for(int i=1 ; i<=n ; i++) {
                                  fact = fact * i ;
                             }
                       System.out.print("Factorial of " +n+ " is : " +fact); 
                            
                     break ; 
                    }  
 
                    case 51 :
                
                    
                default :
                System.out.print("Wrong Data/Choice Entryy");
                    }
               
        }
}

