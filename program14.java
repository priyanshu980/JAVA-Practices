public class program14 {
    public static void main(String [] args){
        String Str = new String("netbeans");
        int len=Str.length();
        System.out.println(len);
        //Str.toUpperCase(); This will show an error beacuse it has talen a new string and we havent taken any variable to define the new string

      String Str1=  Str.toUpperCase();
      String Str2=  Str.trim();
      String Str3=  Str.substring(2);
      String Str4=  Str.substring(2, 5);
      String Str5=  Str.replace('t','l');
        System.out.println(Str1);
        System.out.println(Str2);
        System.out.println(Str3);
        System.out.println(Str4);
        System.out.println(Str5);
    }
    
}
