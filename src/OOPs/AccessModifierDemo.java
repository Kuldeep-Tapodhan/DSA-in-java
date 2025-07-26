// File: AccessModifierDemo.java
package OOPs;

// A class demonstrating all access modifiers
class Student {

    // Public: accessible from anywhere
    public String publicName = "Jayesh";
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private: accessible only within this class
    private int privateId = 42;
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Method to show private access inside the class
    public void showPrivateAccess() {
        System.out.println("Accessing private ID: " + privateId);
        privateMethod();
    }

    // Protected: accessible in th  e same package or via subclass
    protected String protectedGrade = "A+";
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default/package-private: accessible within the same package only
    String defaultEmail = "jayesh@example.com";
    void defaultMethod() {
        System.out.println("This is a default/package-private method.");
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {
        Student s = new Student();

        // Public access
        System.out.println("Public Name: " + s.publicName);
        s.publicMethod();

        // Private access (only accessible within the class)
        // s.privateMethod();
        // System.out.println(s.privateId);
        s.showPrivateAccess();

        // Protected access (same package or via inheritance)
        System.out.println("Protected Grade: " + s.protectedGrade);
        s.protectedMethod();

        // Default/package-private access (same package only)
        System.out.println("Default Email: " + s.defaultEmail);
        s.defaultMethod();
    }
}
