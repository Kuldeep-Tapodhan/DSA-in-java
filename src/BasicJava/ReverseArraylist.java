package BasicJava;
import java.util.*;

public class ReverseArraylist {


public  static  void reverse1(ArrayList<Integer> list1){

    int i=0;
    int j=list1.size()-1;
    while (i<j){
        Integer temp= Integer.valueOf(list1.get(i));
        list1.set(i, list1.get(j));
        list1.set(j,temp);
        i++;
        j--;
    }
}
    public static void main(String[] args) {

        List<Integer> List1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        List1.add(sc.nextInt());
        List1.add(sc.nextInt());
        List1.add(sc.nextInt());
        List1.add(sc.nextInt());
        List1.add(sc.nextInt());

        System.out.println("Original list :"+List1);
        reverse1((ArrayList<Integer>) List1);
        System.out.println("Reversed list :"+List1);
        Collections.reverse(List1);
        System.out.println("Original list :"+List1);


        Collections.sort(List1);
        System.out.println("Sorted array list in asssending order:"+List1);
        Collections.sort(List1,  Collections.reverseOrder());
        System.out.println("Sorted array list in Descending order:"+List1);





    }

}
