import java.util.*;

class L3 {
  public static void main(String[] args) {
    
    //QUESTION 1(basic calculator)
    
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    String op=x.next();
    int b=x.nextInt();
   
    switch(op){
      case "+": System.out.println(a+b);
        break;
      case "-": System.out.println(a-b);
        break;
      case "*": System.out.println(a*b);
        break;
      case "/": if(b==0)System.out.println("invalid division");
                else System.out.println(a/b);
        break;
      case "%": if(b==0)System.out.println("invalid division");
                else System.out.println(a%b);
        break;
      default:System.out.println("enter a valid operator");
    }
    
    //QUESTION 2  (month name)
    
    int mo=x.nextInt();
    switch(mo){
      case 1: System.out.println("jan");
        break;
      case 2: System.out.println("feb");
        break;
      case 3: System.out.println("march");
        break;
      case 4: System.out.println("april");
        break;
      case 5: System.out.println("may");
        break;
      case 6: System.out.println("june");
        break;
      case 7: System.out.println("july");
        break;
      case 8: System.out.println("aug");
        break;
      case 9: System.out.println("sep");
        break;
      case 10: System.out.println("oct");
        break;
      case 11: System.out.println("nov");
        break;
      case 12: System.out.println("dec");
        break;
      default: System.out.println("enter a valid momth number");
    }
    
  }
}
