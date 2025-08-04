/*
    ============================== STATIC Keyword in Java ==============================

    ➤ The `static` keyword in Java is used for memory management.
      It can be applied to:
        1. **Variables** (also called class variables)
        2. **Methods**
        3. **Blocks**
        4. **Nested Classes**

    1. Static Variables:
        - Belong to the class rather than any specific instance.
        - Only one copy exists regardless of how many objects are created.
        - Useful for constants or shared counters.
        - Accessed via class name (e.g., ClassName.variableName), though accessible via objects too.

    2. Static Methods:
        - Belong to the class, not to objects.
        - Can be called without creating an instance.
        - Cannot access non-static instance variables or methods directly (need an object reference).

    3. Static Blocks:
        - Used to initialize static data members.
        - Executed only once, when the class is loaded into memory.

    4. Static Nested Classes:
        - Can be created inside another class using `static` keyword.
        - Can access all static members of the outer class.
        - Do not require an object of the outer class.

    =======================================================================
*/

package OOPs;

public class Statickey {

    // Static nested class
    public static class Student {
        // Instance variables - unique for each object
        String name;
        double roll;
        String className;
        long contact;
        String email;

        // Static variable - shared across all instances
        static int numberOfStudents = 0;

        // Constructor to initialize object and increment static counter
        public Student(String name, double roll, String className, long contact, String email) {
            this.name = name;
            this.roll = roll;
            this.className = className;
            this.contact = contact;
            this.email = email;
            numberOfStudents++; // Static variable incremented
        }
        static int square(int x) {
            return x * x;
        }
    }

    public static void main(String[] args) {

        Student deep = new Student("Deep", 1, "12A", 1111111111L, "deep@example.com");
        System.out.println(Student.numberOfStudents); // Accessing static variable via class name

        Student kuldeep = new Student("Kuldeep", 2, "12A", 2222222222L, "kuldeep@example.com");
        System.out.println(Student.numberOfStudents);

        Student anj = new Student("Anj", 3, "12A", 3333333333L, "anj@example.com");
        System.out.println(Student.numberOfStudents);
        System.out.println(Student.square(5));

    }
}
