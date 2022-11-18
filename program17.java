public class program17 {
    public static void main(String [] arg) {
        //Find if the email is is on gmail 
        String email="programmmer@gmail.com";
        int i=email.indexOf("@");
        String uname=email.substring(0,i);
        String domain=email.substring(i+1,email.length());

        System.out.println("Usernam" +uname);
        System.out.println("Domain" + domain);
        int j=domain.indexOf(".");
        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        String name=domain.substring(0, j);
        System.out.println(name.equals("gmail"));

    }
    
}
