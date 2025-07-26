package OOPs;


/**

 **/
public class Studentclass2 {




    public static void main(String[] args) {

        // we can also have class in the main method but is should not be static and public

        class student{
            String name;
            double roll;
            String Class;
            double contact;
            String email;
        }

        // object are the instance of class or letral of the class
        student s=new student();
        s.Class="X";
        s.contact=88888888;
        s.email="aefha@gmail.com";
        s.name="Jayesh";
        s.roll=42;
        System.out.println(s.roll);
    }
}
