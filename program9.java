

public class program9 {

    public static void name(String []Arg) {
        int a,b,c;
        double r1,r2;

        System.out.println("Enter values of a,b and c ");
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        
        System.out.println("Root are "+r1+" "+r2);

    }
}
