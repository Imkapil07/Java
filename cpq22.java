/*This program defines a class called "Rectangle" that has properties of length and width, and
methods to calculate its area and perimeter. 
The program then creates two Rectangle objects with different dimensions and calculates their areas and perimeters. 
Finally, the program prints out the calculated values for each rectangle.
==================================================================================================================================*/
 class Rectangle { 
    private int length ;
    private int width ;

    public Rectangle(int length , int width){
        this.length = length ;
        this.width = width ;
    } 

    public int getArea(){
        return length*width;
    } 
    public int getPerimeter(){
        return 2*(length + width);
    } 
}
public class cpq22{
    public static void main(String[] args) {
        Rectangle s = new Rectangle(5, 7);
        Rectangle s1 = new Rectangle(10, 15); 

        int area1 = s.getArea();
        int perimeter1 = s.getPerimeter();
        int area2 = s1.getArea();
        int perimeter2 = s1.getPerimeter();

        System.out.println(area1 + " " + perimeter1);
        System.out.println(area2 + " " + perimeter2);
    }
}