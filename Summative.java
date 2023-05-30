import java.util.Scanner;


public class Summative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

Prt("\033[H\033[2J");
//clear screen^^
        Prt("\u001B[31m");
        //above this makes it red
       
            Prt("Welcome To The Game!");
       Prt("\u001B[0m");
       //above this one makes it go back to white

        Prt("In this game you will have to fill up all the squares.");

        Prt("");
        Prt("");
        Prt("");
       

        
        String[] tiles = {" ", "*", "0"};
        int[][] map = loadMap();
        String playerSprite = "@";
        int playerRow = 3;
        int playerCol = 4;
        boolean done = false;
        while (!done) {
            
            display(map, tiles, playerSprite, playerRow, playerCol);
            // Get input.
            String input = in.nextLine();
            int rowMove = 0;
            int colMove = 0;
            if (input.equals("w")) {
                rowMove--;
            }
            else if (input.equals("s")) {
                rowMove++;
            }
            else if (input.equals("a")) {
                colMove--;
            }
            else if (input.equals("d")) {
                colMove++;
            }
            // Update player position, if valid move.
            if (canMove(map, playerRow + rowMove, playerCol + colMove)) {
                playerRow += rowMove;
                playerCol += colMove;
            }
           
        }


    }
    public static void printRectangle(int a, int b) {
    }
    public static void Prt(String string) {
        System.out.println(string);
    }
    public static void Prn(String string) {
        System.out.print(string);
    }
    public static void printStars(int times) {
		// DONE
		System.out.println("");
		for (int printStars = 0; printStars < times; printStars++) {
			System.out.print("*");
		}
		
    }
    public static boolean canMove(int[][] map, int row, int col) {
        // Check whether within bounds.
        if (row < 0 || row >= map.length)
            return false;
        if (col < 0 || col >= map[row].length)
            return false;
        
        return map[row][col] == 0;
    }
    public static void display(int[][] map, String[] tiles, String playerSprite, int playerRow, int playerCol) {
        

        // TODO: Display borders around map.

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == playerRow && j == playerCol) { // Player
                    System.out.print(playerSprite);
                }
                else {  // Display correct tile according to tile code in game map.
                    int tileCode = map[i][j];
                    System.out.print(tiles[tileCode]);
                }
            }
            System.out.println();
        }
    }
    public static int[][] loadMap() {
        // TODO: Load from a file.
        int[][] map = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            //this is a square map
            
            
        };
        return map;
    }
}