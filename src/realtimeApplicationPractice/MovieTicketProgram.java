package realtimeApplicationPractice;

public class MovieTicketProgram {

    public static class MovieTicket {
        private int movieId;
        private int noOfSeats;
        private double costPerTicket;

        // Constructor
        public MovieTicket(int movieId, int noOfSeats) {
            this.movieId = movieId;
            this.noOfSeats = noOfSeats;
            setDefaultCostPerTicket();
        }

        private void setDefaultCostPerTicket() {
            switch (this.movieId) {
                case 111:
                    this.costPerTicket = 7;
                    break;
                case 112:
                    this.costPerTicket = 8;
                    break;
                case 113:
                    this.costPerTicket = 8.5;
                    break;
                default:
                    this.costPerTicket = 0;
            }
        }

        public void setCostPerTicket(double costPerTicket) {
            this.costPerTicket = costPerTicket;
        }

        public double calculateTotalAmount() {
            double totalAmount = noOfSeats * costPerTicket;
            totalAmount += totalAmount * 0.02; // 2% tax
            return Math.round(totalAmount);
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
            setDefaultCostPerTicket(); // Update cost when movie changes
        }

        public void setNoOfSeats(int noOfSeats) {
            this.noOfSeats = noOfSeats;
        }

        // Getters
        public int getMovieId() {
            return movieId;
        }

        public int getNoOfSeats() {
            return noOfSeats;
        }

        public double getCostPerTicket() {
            return costPerTicket;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        MovieTicket ticket1 = new MovieTicket(111, 3);
        System.out.println("Test Case 1:");
        System.out.println("Movie ID: " + ticket1.getMovieId());
        System.out.println("Seats: " + ticket1.getNoOfSeats());
        System.out.println("Cost per ticket: $" + ticket1.getCostPerTicket());
        System.out.println("Total amount: $" + ticket1.calculateTotalAmount());

        // Test case 2 - changing movie
        ticket1.setMovieId(113);
        System.out.println("\nAfter changing to movie 113:");
        System.out.println("New cost per ticket: $" + ticket1.getCostPerTicket());
        System.out.println("New total amount: $" + ticket1.calculateTotalAmount());

        // Test case 3 - custom price
        MovieTicket ticket2 = new MovieTicket(112, 2);
        ticket2.setCostPerTicket(10.0);
        System.out.println("\nTest Case 3 (Custom Price):");
        System.out.println("Total amount: $" + ticket2.calculateTotalAmount());
    }
}