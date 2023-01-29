import java.util.Scanner;
public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Determine number of rounds
        System.out.println("POKEMON BATTLE");
        System.out.print("Enter an odd number of rounds: ");
        int rounds = input.nextInt();

        while(rounds % 2 == 0) {
            System.out.print("Please enter in an odd number of rounds: ");
            rounds = input.nextInt();
        }

        //Declare all the variables for the pokemon battle
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

        while(round <= rounds) {
            //Player 1 will input their stats
            System.out.println("Player 1: Select a Pokemon and enter its stats");
            System.out.print("Enter name: ");
            name1 = input.nextLine();

            System.out.print("Enter HP: ");
            hp1 = input.nextInt();

            System.out.print("Enter move: ");
            move1 = input.nextLine();

            System.out.print("Enter move's power: ");
            power1 = input.nextInt();

            System.out.print("Enter attack speed: ");
            speed1 = input.nextInt();

            //Player 2 will input their stats
            System.out.println("Player 1: Select a Pokemon and enter its stats");
            System.out.print("Enter name: ");
            name2 = input.nextLine();

            System.out.print("Enter HP: ");
            hp2 = input.nextInt();

            System.out.print("Enter move: ");
            move2 = input.nextLine();

            System.out.print("Enter move's power: ");
            power2 = input.nextInt();

            System.out.print("Enter attack speed: ");
            speed2 = input.nextInt();

            //Next compare speeds
            if(speed1 > speed2) {
                    hp2 -= power1;
                    if(hp2 < 1) {
                        win1 += 1;
                        System.out.println("Player 1's " + name1 + " wins this round!");
                    }
                    else {
                        hp1 -= power2;
                        if(hp1 < 1) {
                            win2 += 1;
                            System.out.println("Player 2's " + name2 + " wins this round!");
                        }
                    }
            }
            else {
                hp1 -= power2;
                if(hp1 < 1) {
                    win2 += 1;
                    round++;
                    System.out.println("Player 2's " + name2 + " wins this round!");
                }
                else {
                    hp2 -= power1;
                    if(hp2 < 1) {
                        win1 += 1;
                        round++;
                        System.out.println("Player 1's " + name1 + " wins this round!");
                    }
                }
            }
        }
    }
}