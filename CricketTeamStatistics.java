import java.util.*;

// Player class represents each cricket player
class Player {

    // Instance variables (Attributes / Properties)
    String name;
    int matches;
    int runs;

    // Constructor
    // Used to initialize object values
    Player(String name, int matches, int runs) {

        this.name = name;
        this.matches = matches;
        this.runs = runs;
    }

    // Method to update runs
    public void updateRuns(int newRuns) {

        /*
         * ERROR IN ORIGINAL CODE:
         * 
         * runs += runs;
         * 
         * Problem:
         * - Both "runs" referred to the parameter variable.
         * - Instance variable was hidden by parameter variable.
         * - So object's runs never changed.
         * 
         * CONCEPT LEARNT:
         * -> Variable Shadowing
         * -> "this" keyword
         * 
         * FIX:
         * this.runs refers to object variable.
         */

        this.runs += newRuns;
    }

    // Method to calculate batting average
    public double calculateAverage() {

        /*
         * CONCEPT LEARNT:
         * -> Type Casting
         * 
         * If we do:
         * runs / matches
         * 
         * Java performs integer division.
         * 
         * Example:
         * 5 / 2 = 2
         * 
         * So we convert one value into double.
         */

        return (double) runs / matches;
    }
}

public class CricketTeamStatistics {

    public static void main(String[] args) {

        /*
         * CONCEPT LEARNT:
         * -> ArrayList
         * -> Generic Collections
         * 
         * List<Player>
         * means list can store Player objects only.
         */

        List<Player> players = new ArrayList<>();

        // Adding objects into list
        players.add(new Player("Bhoomika", 90, 5000));
        players.add(new Player("Anshu Saini", 98, 6000));
        players.add(new Player("Palak Dogra", 92, 3000));
        players.add(new Player("Sangeeta", 87, 2000));

        // Updating Bhoomika's runs
        players.get(0).updateRuns(120);

        /*
         * ERROR IN ORIGINAL CODE:
         * 
         * highest variable was used directly:
         * 
         * if(p.runs > highest.runs)
         * 
         * But highest was never declared.
         * 
         * CONCEPT LEARNT:
         * -> Variables must be initialized before use.
         */

        Player highest = players.get(0);

        /*
         * CONCEPT LEARNT:
         * -> Enhanced For Loop
         * -> Object Traversal
         */

        for (Player p : players) {

            // Finding player with highest runs
            if (p.runs > highest.runs) {

                highest = p;
            }
        }

        System.out.println("Highest Score:");
        System.out.println(highest.name + " -> " + highest.runs);

        System.out.println("\nPlayer Averages");

        /*
         * ERROR IN ORIGINAL CODE:
         * 
         * for(player p : players)
         * 
         * Problem:
         * Java is case-sensitive.
         * 
         * Correct class name:
         * Player
         */

        for (Player p : players) {

            System.out.println(p.name + " -> " + p.calculateAverage());
        }

        /*
         * CONCEPT LEARNT:
         * -> Lambda Expression
         * -> Custom Sorting
         * 
         * b.runs - a.runs
         * sorts in descending order.
         */

        players.sort((a, b) -> b.runs - a.runs);

        System.out.println("\nPlayers sorted by Performance");

        for (Player p : players) {

            System.out.println(p.name + " -> " + p.runs);
        }
    }
}