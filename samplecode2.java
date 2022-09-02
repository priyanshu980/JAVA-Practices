/*public class example2 {
public static void main(String[] args) {
     short salary=30000;
    alary=(short) (salary+5000);
      System.out.println(salary);
      */
        
 /*public class example3 {
 public static void main(String[] args) {
  byte b1=10;
byte b2=30;
    byte res=(byte) (b1+b2);
    System.out.println(res);
      
   }
  }*/
/* public class example4 {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);
    int n1=2147483647;
    int n2 = n1 +3;
    System.out.println(n2);


  }
}*/

//---------------------------------------smaple code---------------------------------------------------------//
/*public class samplecode1 {
  public static void main(String[] args){
    byte num=(byte)2000;
    System.out.println(num);

  }

  

}*/
/* 
public class samplecode2{
public static void main(String[] args){
  byte b =100;
  int n = b;
  System.out.println(n);
  int data = 30;
  byte num =(byte)data;
  System.out.println(num);
}
}
*/
/*public class samplecode2{
  public static void main(String[] args){
    short salary=3000;
    salary=(short)(salary+5000);
    System.out.println(salary);
  }
}*/
/*public class samplecode2{
  public static void main(String[] args) {

    System.out.println("The first 10 Even Natural numbers are");
    for(int i=1; i<=10; i++)

    {
      System.out.println(2*i);
    }
  }
}*/
/*import java.util.Scanner;
public class samplecode2 {
  public static void main(String args[]) {
    int num1, num2;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the first number ::");
    num1 = Sc.nextInt();
    System.out.println("Enter the Second number ::");
    num2 = Sc.nextInt();

    for (int i = num1; i<num2; i++){
      int check, rem, sum = 0;
      check = i;
      while(check !=0) {
        rem = check % 10;
        sum = sum +(rem*rem*rem);
        check = check / 10;

      }
      if(sum == i){
        System.out.println(""+i+"is an Armstrong number.");

      }
    }
  }
}*/
public class samplecode2{
public static void main(String[] args) {
  int n = 10, firstterm = 0, secondTerm = 1;
  System.out.println("Fibonicci Series till "+ n + "terms:");

  for (int i = 1; i <= n; ++i) {
    System.out.println(firstterm + ", ");

    //Compute the next term
    int nextTerm = firstterm + secondTerm;
    firstterm = secondTerm;
    secondTerm = nextTerm;


  }
  
}
}