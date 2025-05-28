package BasicJava.Recursion.recursionONSring;

public class subsequ {

    static  void subseqq(String str,String currentans){

        if (str.length()==0){
            System.out.println(currentans);
            return;
        }
        char ch=str.charAt(0);
        String restofstring=str.substring(1);
        subseqq(restofstring,currentans+ch);
        subseqq(restofstring,currentans);
    }
    public static void main(String[] args) {
    subseqq("abcd","");

    }
}
