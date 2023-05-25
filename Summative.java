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

        Prt("In this game you will  have to help your snake around a maze.");

        
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        printStars(50);
        




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
}