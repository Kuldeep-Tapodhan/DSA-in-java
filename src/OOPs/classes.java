package OOPs;


class  Student{
    String name;
    double roll;
    double age;



    public Student(String name,long roll,long age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }

    public Student() {

    }
}


public class classes {
    public static void print(Student s){
        System.out.println(s.name);System.out.println(s.roll);System.out.println(s.age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Deep";
        s.age=21;
        s.roll=4033;
        print(s);

        Student s1= new Student("KUldeep",23,4034);
        print(s1);


    }
}
