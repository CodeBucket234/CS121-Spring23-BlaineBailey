import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Determine number of rounds
        System.out.println("POKEMON BATTLE");
        System.out.print("Enter an odd number of rounds: ");
        int rounds = input.nextInt();

        while (rounds % 2 == 0) {
            System.out.print("Please enter in an odd number of rounds: ");
            rounds = input.nextInt();
        }

        System.out.println();

        //Declare all the variables for the Pokemon battle
        String name1;
        int hp1;
        String move1;
        int power1;
        int speed1;
        int win1 = 0;

        String name2;
        int hp2;
        String move2;
        int power2;
        int speed2;
        int win2 = 0;

        int round = 1;

        while (round <= rounds) {
            System.out.printf("Round %d\n", round);
            System.out.println("----------");
            //Player 1 will input their stats
            System.out.println("Player 1: Select a Pokemon and enter its stats");
            System.out.print("Enter name: ");
            name1 = input.nextLine();
            input.nextLine();

            System.out.print("Enter HP: ");
            hp1 = input.nextInt();

            System.out.print("Enter move: ");
            move1 = input.nextLine();
            input.nextLine();

            System.out.print("Enter move's power: ");
            power1 = input.nextInt();

            System.out.print("Enter attack speed: ");
            speed1 = input.nextInt();

            //Player 2 will input their stats
            System.out.println("\nPlayer 2: Select a Pokemon and enter its stats");
            System.out.print("Enter name: ");
            name2 = input.nextLine();
            input.nextLine();

            System.out.print("Enter HP: ");
            hp2 = input.nextInt();

            System.out.print("Enter move: ");
            move2 = input.nextLine();
            input.nextLine();

            System.out.print("Enter move's power: ");
            power2 = input.nextInt();

            System.out.print("Enter attack speed: ");
            speed2 = input.nextInt();

            //Next compare speeds

            //If Player 1's speed is faster
            if(speed1 > speed2) {
                hp2 -= power1;
                if(hp2 < 1) {
                    win1++;
                    System.out.printf("Player 1's %s has won this round!\n", name1);
                    round++;
                }
                else {
                    hp1 -= power1;
                    if(hp1 < 1) {
                        win2++;
                        System.out.printf("Player 2's %s has won this round!\n", name2);
                        round++;
                    }
                }
            }
            //If Player 2's speed is faster
            else if(speed1 < speed2) {
                hp1 -= power2;
                if(hp1 < 1) {
                    win2++;
                    System.out.printf("Player 2's %s has won this round!\n", name2);
                    round++;
                }
                else {
                    hp2 -= power1;
                    if(hp2 < 1) {
                        win1++;
                        System.out.printf("Player 1's %s has won this round!\n", name1);
                        round++;
                    }
                }
            }
            //If Player 1 and Player 2 have the same speed
            else {
                //Create a random variable to pick which one goes first
                Random rand = new Random();
                int goFirst = rand.nextInt(1)+1;

                //Testing to see who goes first

                //Player 1 first
                if(goFirst == 1) {
                    hp2 -= power1;
                    if(hp2 < 1) {
                        win1++;
                        System.out.printf("Player 1's %s has won this round!\n", name1);
                        round++;
                    }
                    else {
                        hp1 -= power1;
                        if(hp1 < 1) {
                            win2++;
                            System.out.printf("Player 2's %s has won this round!\n", name2);
                            round++;
                        }
                    }
                }
                //Player 2 first
                else {
                    hp1 -= power2;
                    if(hp1 < 1) {
                        win2++;
                        System.out.printf("Player 2's %s has won this round!\n", name2);
                        round++;
                    }
                    else {
                        hp2 -= power1;
                        if(hp2 < 1) {
                            win1++;
                            System.out.printf("Player 1's %s has won this round!\n", name1);
                            round++;
                        }
                    }
                }
            }

            //Show win counter after each fight
            System.out.println("\nWins");
            System.out.println("----------");
            System.out.printf("Player 1: %d\n", win1);
            System.out.printf("Player 2: %d\n\n", win2);
        }
        //Displays win counts
        System.out.println("Final Scores");
        System.out.println("----------");
        System.out.printf("Player 1: %d\n", win1);
        System.out.printf("Player 2: %d\n", win2);

        //Compares final score to see who wins
        if(win1 > win2) {
            System.out.println("\nPlayer 1 wins the game!");
        }
        else {
            System.out.println("\nPlayer 2 wins the game!");
        }
    }
}