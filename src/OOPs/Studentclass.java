package OOPs;


/**
 ✅ Array
 An array is a collection of elements of the same data type.

 It is used to store multiple values in a single variable.

 Access is done using index numbers (e.g., arr[0]).

 Arrays do not define behavior — they only hold data.

 Memory is allocated in a contiguous block.

 Arrays are less flexible and primarily used for simple data storage.

 Cannot represent real-world entities directly.

 ✅ Class
 A class is a user-defined blueprint for creating objects.

 It encapsulates data (attributes) and behavior (methods) together.

 A class can have multiple data types as fields.

 Objects of a class access members using dot notation (e.g., obj.name).

 Memory is dynamically allocated for each object.

 Classes are highly flexible, support inheritance, encapsulation, etc.

 Perfect for modeling real-world entities like Student, Car, etc.

 🔁 Summary Statement
 Use an array when you just need to store and access a list of similar items, and use a class when you need to model entities with both data and behavior.


 **/
public class Studentclass {

    public  static  class student{
        String name;
        double roll;
        String Class;
        double contact;
        String email;
    }

    public static void main(String[] args) {
        student s=new student();
        s.Class="X";
        s.contact=88888888;
        s.email="aefha@gmail.com";
        s.name="Jayesh";
        s.roll=42;
        System.out.println(s.roll);
    }
}
