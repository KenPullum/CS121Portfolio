import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args) {

        String [] movieNames = {"Barbie","Oppenheimer","Dune","Jurassic Park"};
        String [] movieTypes= {"2D","3D","2D","3D"};
        double [] moviePrice = {16.40,18.90,17.45,15.60};
        //Constants
        final int ROWS = 5;
        final int COLUMNS = 10;
        //Convert to a2D array [][]
        int [][] movieAvailability = new int [ROWS][COLUMNS];
        //METHOD CALLS
        displayMovieDetails(movieNames,movieTypes,moviePrice);
        setSeatAvailability(movieAvailability);        // sets the available seats to 0
        displaySeatAvailability(movieAvailability);    // display the available seats
        randomizeAvailability(movieAvailability);      // sets seats to be either available or not available using random
        displaySeatAvailability(movieAvailability);    // display the available seats
    }
    static void randomizeAvailability(int [][] movieAvailability){
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }
    static void displaySeatAvailability(int [][] movieAvailability){
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                System.out.print(movieAvailability[i][j] + " " );
            }
            System.out.println();
        }
    }
    static void setSeatAvailability(int [][] movieAvailability){
        System.out.println("\n------------ INITIAL SEATS -----------\n");
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                movieAvailability[i][j] = 0;
            }
        }
    }
    //access modifier return type method name and parameter
    static void displayMovieDetails(String [] mNames,String [] mTypes, double [] mPrice)
    {
        //%s --> String
        //%d --> integers
        //%f --> doubles floating point
        //%c --> characters
        // -  |--> Flag
        // %-10s --> Left aligned  10 spaces
        // %10s  --> Right aligned 10 spaces
        String header = String.format("\n --------------------------- Movie Details --------------------------\n" +
                "%-20s %-20s%-20s\n","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        for(int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n",(i+1),mNames[i],mTypes[i],mPrice[i]);
        }
    }
}

