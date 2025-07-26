package OOPs;

public class Passingclasstofunction {


    public static class  Student{
        String name;
        double roll;
        String Class;
        long  contact;
        String email;
    }




    // Class are passed by reference.... means if the class is passed in any method (function) and value are  update than it will directly reflected to that object which has been pass..


    public static void update(Student s){
        s.Class="6TD1";
    }

    public  static  void print(Student x){
        System.out.println(x.name);
        System.out.println(x.roll);
        System.out.println(x.Class);
        System.out.println(x.contact);
        System.out.println(x.email);
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.Class="X";
        s.contact=88888888;
        s.email="aefha@gmail.com";
        s.name="Jayesh";
        s.roll=42;
        print(s);
        update(s);
        System.out.println(s.Class);
    }
}
