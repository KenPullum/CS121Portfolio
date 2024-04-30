import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    public static void main(String[] args) {

        String[] movieNames = {"Barbie", "Oppenheimer", "Dune", "Jurassic Park"};
        String[] movieTypes = {"2D", "3D", "2D", "3D"};
        double[] moviePrice = {16.40, 18.90, 17.45, 15.60};
        //Constants
        final int ROWS = 5;
        final int COLUMNS = 10;
        //Convert to a2D array [][]
        int[][] movieAvailability = new int[ROWS][COLUMNS];
        //METHOD CALLS
        displayMovieDetails(movieNames, movieTypes, moviePrice);  // Calls displayMovieDetails passing in the 3 arrays.
        int index = selectMovie(movieNames);                    // Calls the selectMovie method passing in movieNames array.
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrice[index]); //calls the displaySelectMovie passing the specific item picked by user in previous method call.
        randomizeAvailability(movieAvailability);      // sets seats to be either available or not available using random instance.
        displaySeatAvailability(movieAvailability);     // display the available seats
    }

    static void displaySelectedMovie(String movieNames, String movieTypes, double moviePrice) {
        System.out.printf("\n%s MOVIE SELECTIONS %s\n", "-".repeat(20), "-".repeat(20));
        //System.out.println("--------------------------------- MOVIE SELECTION ---------------------------");
        System.out.printf("%-20s %-20s%-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-25s%-20s$%.2f\n", movieNames, movieTypes, moviePrice);

    }
    static int selectMovie(String movieNames[]) {
        Scanner scn = new Scanner(System.in);
        String selectedMovie;
        while (true) {

            System.out.println("\nEnter the movie name you are purchasing tickets for:");

            selectedMovie = scn.nextLine();


            for (int i = 0; i < movieNames.length; i++) {
                if (selectedMovie.equalsIgnoreCase(movieNames[i])) {
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    static void displaySeatAvailability(int[][] movieAvailability) {
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        for (int c = 1; c <= movieAvailability[0].length; c++) {
            System.out.printf(" %d", c);
        }
        System.out.printf("\n  %s\n", "-".repeat(20));
        // for(initialize; condition; increment/decrement)
        for (int i = 0; i < movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.print(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void randomizeAvailability(int[][] movieAvailability) {
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        // for(initialize; condition; increment/decrement)
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }

    static void setSeatAvailability(int[][] movieAvailability) {
        System.out.println("\n------------ INITIAL SEATS -----------\n");
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

   static void displayMovieDetails(String[] mNames, String[] mTypes, double[] mPrice) {

        String header = String.format("\n ------------------------ Movie Details -----------------------\n" +
                "%-20s %-20s%-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.println(header);
        for (int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n", (i + 1), mNames[i], mTypes[i], mPrice[i]);
        }
    }
}

