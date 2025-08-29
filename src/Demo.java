class Student {
    int grnumber;
}

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.grnumber = 100;

        Student s2 = s; // s2 points to same object as s

        System.out.println(s); // This prints the object's reference, not its data
        System.out.println(s.grnumber); // This prints 100
        System.out.println(s2.grnumber); // Also prints 100
    }
}
