import java.util.*;

class L4 {
  public static void main(String[] args) {
    
    //QUESTION 1 (sum of n even numbers)
    
    Scanner x=new Scanner(System.in);
  /*  int n=x.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
      if(i%2==0) 
       sum=sum+i;
    } System.out.println(sum);
    
    //QUESTION 2  (analyze what happens )
    
    for(; ;) {
            System.out.println("fak of");
        } //infinite loop coz no initialization or terminating ststement is present*/
    
    //QUESTION 3
    
    int mks;
    int in= x.nextInt();
    if(in==1){
    do{
      mks=x.nextInt();
      if (mks>=90) System.out.println("this is good");
      else if (89>=mks&&mks>= 60) System.out.println("this is also good");
      else if (59>=mks&&mks>0) System.out.println("this is good too");
      else if(mks==0) System.out.println("marks dont matter, effort does!");
    }while(0<mks&&mks<=100);
    }
    else if (in==0)System.out.println("thanks");
    else System.out.println("only enter '1' or '0'");
    /*
    //BONUS QUESTION  (prime or not??)
     boolean isPrime= true;
     int y= x.nextInt();
     for(int i=2; i<y; i++){
      if(n%i==0)isPrime=false;
     }
    if (isPrime==true)	System.out.println("no. is prime");
    else System.out.println("not prime");
    */
  }
}
