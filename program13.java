public class program13 {
    public static void main(String [] args)
    {
        String str="My first string command";//portion inside inverted commas are known as litrals or wecan say string litrals
        char c[]={'a','e','i','o','u'};
        String str1=new String(c);
        //Converting a byte array
        byte b[]={65,66,67,68};
        String str2=new String(b,0,2);//Calculation of the legth of an array
        //This is called JAVA Pooling
        String str3=("JAVA");
        String str4=("JAVA");//This would be true
        //String str4=new String("JAVA");//This Would be false
        System.out.println(str3==str4);
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str);
        

    }
    
}
