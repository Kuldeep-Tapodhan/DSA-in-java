package BasicJava;
enum CoffeeSize {
    SMALL(100),   // size in ml
    MEDIUM(200),
    LARGE(300);

    private int volume; // ml

    // Constructor for enum
    CoffeeSize(int volume) {
        this.volume = volume;
    }

    // Method inside enum
    public int getVolume() {
        return volume;
    }
}
public class enunclass {
    public static void main(String[] args) {
        // Accessing enum constants
        CoffeeSize size = CoffeeSize.MEDIUM;

        // Printing enum name
        System.out.println("Selected Size: " + size);

        // Getting enum property
        System.out.println("Volume: " + size.getVolume() + " ml");

        // Looping through all enum values
        System.out.println("\nAvailable sizes:");
        for (CoffeeSize s : CoffeeSize.values()) {
            System.out.println(s + " -> " + s.getVolume() + " ml");
        }
    }
}
