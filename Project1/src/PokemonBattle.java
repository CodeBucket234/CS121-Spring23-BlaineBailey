//Used Scanner class for user input
//Used random class for random number generation
import java.util.Scanner;
import java.util.Random;
//**********************************************************************************************************************
// Project 1: Pokemon Battle
// Name: Blaine Bailey
// Date of Submission: 2/6/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow. Then enter an odd number of rounds to play. Player 1 will go first and enter the Pokemon
// stats (name and health) and the stats of the move (move name, power, and speed). Player 2 will go next. If any player
// wins the round (by dealing more damage than the health of the other Pokemon), then their wins will increment by one
// and the next round will go on. There will be a win message for the winning player at the end of all the rounds.
//**********************************************************************************************************************
// This project uses the Scanner class for input and the Random class for random number generation.
//**********************************************************************************************************************
public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Determine number of rounds
        System.out.println("POKEMON BATTLE");
        System.out.print("Enter an odd number of rounds: ");
        // used Integer.parseInt(input.nextLine());
        int rounds = Integer.parseInt(input.nextLine());

        //Making sure that the number of rounds entered is an odd number
        while (rounds % 2 == 0) {
            System.out.print("Please enter in an odd number of rounds: ");
            // used Integer.parseInt(input.nextLine());
            rounds = Integer.parseInt(input.nextLine());
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

            // ******** TAKEN OUT *************
            //input.nextLine();

            System.out.print("Enter HP: ");
            hp1 = Integer.parseInt(input.nextLine());
            //added Integer.parseInt(input.nextLine())
            // Original : input.nextLine();

            System.out.print("Enter move: ");
            move1 = input.nextLine();
            // ******** TAKEN OUT *************
            //input.nextLine();

            System.out.print("Enter move's power: ");
            power1 = Integer.parseInt(input.nextLine());

            System.out.print("Enter attack speed: ");
            speed1 = Integer.parseInt(input.nextLine());
            //adds a new line to make the console output more readable
            System.out.println();

            //Player 2 will input their stats
            System.out.println("\nPlayer 2: Select a Pokemon and enter its stats");
            System.out.print("Enter name: ");
            name2 = input.nextLine();
            // ******** TAKEN OUT *************
            //input.nextLine();

            System.out.print("Enter HP: ");
            hp2 = Integer.parseInt(input.nextLine());

            System.out.print("Enter move: ");
            move2 = input.nextLine();
            // ******** TAKEN OUT *************
            //input.nextLine();

            System.out.print("Enter move's power: ");
            power2 = Integer.parseInt(input.nextLine());

            System.out.print("Enter attack speed: ");
            speed2 = Integer.parseInt(input.nextLine());

            //Round continues until a pokemon wins
            while(!(hp1 < 1) || !(hp2 < 1)) {
                //Compare speeds

                //If Player 1's speed is faster
                if(speed1 > speed2) {
                    hp2 -= power1;
                    //If player 2's pokemon dies
                    if(hp2 < 1) {
                        win1++;
                        System.out.printf("Player 1's %s has won this round!\n", name1);
                        round++;
                        break;
                    }
                    else {
                        //Let Player 2's pokemon attack if not dead
                        hp1 -= power1;
                        //If player 1's pokemon dies
                        if(hp1 < 1) {
                            win2++;
                            System.out.printf("Player 2's %s has won this round!\n", name2);
                            round++;
                            break;
                        }
                    }
                }
                //If Player 2's speed is faster
                else if(speed1 < speed2) {
                    hp1 -= power2;
                    //If player 1's pokemon dies
                    if(hp1 < 1) {
                        win2++;
                        System.out.printf("Player 2's %s has won this round!\n", name2);
                        round++;
                        break;
                    }
                    else {
                        //Let player 1's pokemon attack if not dead
                        hp2 -= power1;
                        //If player 2's pokemon dies
                        if(hp2 < 1) {
                            win1++;
                            System.out.printf("Player 1's %s has won this round!\n", name1);
                            round++;
                            break;
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
                        //If player 2's pokemon dies
                        if(hp2 < 1) {
                            win1++;
                            System.out.printf("Player 1's %s has won this round!\n", name1);
                            round++;
                            break;
                        }
                        else {
                            //Let player 2's pokemon attack if not dead
                            hp1 -= power1;
                            //If player 1's pokemon dies
                            if(hp1 < 1) {
                                win2++;
                                System.out.printf("Player 2's %s has won this round!\n", name2);
                                round++;
                                break;
                            }
                        }
                    }
                    //Player 2 first
                    else {
                        hp1 -= power2;
                        //If player 1's pokemon dies
                        if(hp1 < 1) {
                            win2++;
                            System.out.printf("Player 2's %s has won this round!\n", name2);
                            round++;
                            break;
                        }
                        else {
                            //Let player 1's pokemon attack if not dead
                            hp2 -= power1;
                            //If player 2's pokemon dies
                            if(hp2 < 1) {
                                win1++;
                                System.out.printf("Player 1's %s has won this round!\n", name1);
                                round++;
                                break;
                            }
                        }
                    }
                }
            }

            //Show win counter after each round
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