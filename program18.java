public class program18 {
    public static void main(String [] arg) {
             
        int a=5,b=10,c=15;
         
        System.out.println(a<b && a<c);//&& Used for AND statements
          
         
        System.out.println(a<b && a>c);
          
        System.out.println(a<b || a<c);// || this symbol is used for OR statements

        float x=5.4f , y= 5.5f ,z = 15;

        System.out.println(x<y && z<y);

        //Now comming to Conditional Statements

        //int n = 5;
        int n = -5;
        if (n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.print("Negative");
        }

        int d =5,e=15,f=4;
        if (d>e && d>f)
        {
            System.out.println(d);
        }
        else if (e>f)
        {
            System.out.println(e);
        }
        else 
        {
            System.out.println(f);
        }



        
    }
    
}
