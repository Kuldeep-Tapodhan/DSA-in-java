package BasicJava.Reinforcement;
/**
 * Generates a simple progression. By default: 0, 1, 2, ...
 */
public class Progression {

    // Instance variable
    protected long current;

    /** Constructs a progression starting at zero. */
    public Progression() {
        this(0);
    }

    /** Constructs a progression with a given start value. */
    public Progression(long start) {
        current = start;
    }

    /** Returns the next value of the progression. */
    public long nextValue() {
        long answer = current;
        advance(); // This protected call is responsible for advancing the current value
        return answer;
    }

    /** Advances the current value to the next value of the progression. */
    protected void advance() {
        current++;
    }

    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n) {
        System.out.print(nextValue()); // Print first value without leading space
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue()); // Print leading space before others
        }
        System.out.println(); // End the line
    }

    // Main method for testing
    public static void main(String[] args) {
        Progression prog = new Progression();
        prog.printProgression(10); // Print first 10 values of the default progression

        Progression customProg = new Progression(5);
        customProg.printProgression(10); // Print first 10 values of a progression starting at 5
    }
}

