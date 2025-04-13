package BasicJava.Reinforcement;



class GameEntry {
    private int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "score=" + score +
                '}';
    }
}


public class Main {

    public static void main(String[] args) {
        // Create an array of GameEntry objects
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100);
        }

        // Clone the array
        GameEntry[] B = A.clone();

        // Set A[4]'s score to 550
        A[2].setScore(950);

        // Print scores from both arrays to verify
        System.out.println("Array A:");
        for (GameEntry entry : A) {
            System.out.println(entry);
        }

        System.out.println("\nArray B:");
        for (GameEntry entry : B) {
            System.out.println(entry);
        }
    }
}

