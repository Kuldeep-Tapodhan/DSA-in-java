package BasicJava;


    class Person {
        private String name;
        private int age;

        public Person setName(String name) {
            this.name = name;
            return this;  // returning current object
        }

        public Person setAge(int age) {
            this.age = age;
            return this;
        }

        public Person printInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
            return this;
        }
    }
public class MethodChaining {
        public static void main(String[] args) {
            Person person = new Person();

            // Method chaining
            person.setName("John")
                    .setAge(25)
                    .printInfo();
        }
    }
