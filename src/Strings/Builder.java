package Strings;

public class Builder {


    public static void main(String[] args) {


        StringBuilder str = new StringBuilder("Hello World");
        System.out.println(str);

        str.append(" jack");
        str.setCharAt(4,'d');
        System.out.println(str);
        str.insert(3,'a');
        System.out.println(str);
        str.delete(0,1);
        System.out.println(str);
        str.reverse();
        System.out.println(str);


    }
}
