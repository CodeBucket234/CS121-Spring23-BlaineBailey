package WeekThree.Activity4;
//Importing Scanner class
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user to enter in a planet
        System.out.print("Enter in a planet from our solar system: ");
        String planet = input.nextLine();
        planet = planet.toLowerCase();

        while(planet != "mercury" || planet != "venus" || planet != "earth" || planet != "mars" || planet != "jupiter" || planet != "saturn" || planet != "uranus" || planet != "neptune") {
            System.out.print("Please enter in a planet from our solar system: ");
            planet = input.nextLine();
            planet = planet.toLowerCase();
        }

        switch(planet) {
            case "mercury":
                System.out.println("The diameter of Mercury is 4,879 km.");
                System.out.println("The mass of Mercury is: 3.29 × 10^23 kg");
                System.out.println("Mercury has no moons.");
                System.out.println("The orbit distance of Mercury is: 57,909,227 km (0.39 AU)");
                System.out.println("A year on Mercury lasts 88 Earth days.");
                System.out.println("The temperature range of Mercury goes from -173°C to 427°C (-279.4°F to 800.6°F)");
        }

        System.out.println("These facts came from the following websites:");
        System.out.println("https://space-facts.com/mercury/");
    }
}
