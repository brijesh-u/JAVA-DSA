import java.util.*;
class L2 {
  public static void main(String[] args) {
   
    //QUESTION 1 (diff datatype variables)
    
    int age;
    char name;
    float marks;
    double percentage;
    boolean alive;
    
    //QUESTION 2  (area of circle)
    
    Scanner x=new Scanner(System.in);
    int radius=x.nextInt();
    double area=3.14*radius*radius;
    System.out.println(area);
    
    //QUESTION 3  (table of a number)
    
    int number=x.nextInt();
    for (int i=1; i<=10; i++)
      System.out.println(number*i);   
  }
}