package BasicJava;


import java.util.ArrayList;
import  java.util.Scanner;
public class demo {
    public static void  main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f= Float.valueOf(4.34f);
        System.out.println(f);


        ArrayList<Integer> list= new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println(list.get(2));

        for (int j = 0; j <list.size() ; j++) {
            System.out.print(list.get(j)+" ");
        }

        list.add(2,12);
        System.out.println(list);
    }
}
