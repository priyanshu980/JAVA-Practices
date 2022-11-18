public class program16 {
    public static void main(String [] arg) {
        String str1="Pyramid";
        String str2="Pyramid";
        String str5=new String("Pyramid");
        String str3="Core";
        String str4="core";
        String str6="Chaina has a great wall";
        String str7="wall";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));
        //Comparing Using equalto symbols
        System.out.println(str1==str2);
        System.out.println(str2.equals(str5));//Here it will not check the contents so the output will be True.
        System.out.println(str2==str5);//Here it will check the contents so the output will be False.
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str4));
        System.out.println(str4.compareTo(str3));
        System.out.println(str4.compareTo(str2));
        System.out.println(str6.contains("has"));
        System.out.println(str6.contains(str7));
        System.out.println(str6 + str7);
        

        
    }
    
}
