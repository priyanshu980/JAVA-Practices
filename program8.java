import java.util.Scanner;

public class program8 {

    public static void main(String [] arg){
     
        float base,height,area;
        System.out.println("Enter Base and height");
        Scanner sc = new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();

        area=base*height/2;
        System.out.println("Area of triangle is" + area);


    }
}