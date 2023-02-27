//**********************************************************************************************************************
// Activity 16: For Each and Multidimensional Arrays
// Name: Blaine Bailey
// Date of Submission: 2/26/2023
//**********************************************************************************************************************
// ArrayDemo3 makes a 3d array of products within 3 aisles, rows, and columns in a hardware store, and then displays
// where each product is within each aisle, row, and column. Click the green arrow, and then you will see products with
// their IDs, and where their location is within a hardware store.
//**********************************************************************************************************************
public class ArrayDemo3 {
    public static void main(String[] args) {
        //Creating 3d string array of products
        String[][][] products = new String[3][3][3];

        //Initializing the array with all the products
        products[0][0][0] = "Spoon [ID: #SI227A]";
        products[0][0][1] = "Fork [ID: #SI227B]";
        products[0][0][2] = "Knife [ID: #SI227C]";

        products[0][1][0] = "Widget [ID: #TL227A]";
        products[0][1][1] = "Gadget [ID: #TL227B]";
        products[0][1][2] = "Gizmo [ID: #TL227C]";

        products[0][2][0] = "Chair [ID: #FR227A]";
        products[0][2][1] = "Sofa [ID: #FR227B]";
        products[0][2][2] = "Desk [ID: #FR227C]";

        products[1][0][0] = "Picasso Painting [ID: #DC597A]";
        products[1][0][1] = "Vase [ID: #DC597B]";
        products[1][0][2] = "Angel Desk Statue [ID: #DC597C]";

        products[1][1][0] = "Xbox Series S [ID: #EE597A]";
        products[1][1][1] = "PlayStation 5 [ID: #EE597B]";
        products[1][1][2] = "RTX Gaming PC [ID: #EE597C]";

        products[1][2][0] = "Samsung Smart Fridge [ID: #SA597A]";
        products[1][2][1] = "Samsung Smart Dishwasher [ID: #SA597B]";
        products[1][2][2] = "Samsung Smart Washing Machine [ID: #SA597C]";

        products[2][0][0] = "Wooden Plank 3x5 [ID: #HW897A]";
        products[2][0][1] = "Wooden Arch 13x31 [ID: #HW897B]";
        products[2][0][2] = "Wooden Angle 5x4 [ID: #HW897C]";

        products[2][1][0] = "HP Intel Core i5 Laptop [ID: #LP897A]";
        products[2][1][1] = "Dell Intel Core i7 Laptop [ID: #LP897B]";
        products[2][1][2] = "Alien Gaming PC [ID: #LP897C]";

        products[2][2][0] = "Sony Headphones [ID: #PE897A]";
        products[2][2][1] = "Garmin Smartwatch [ID: #PE897B]";
        products[2][2][2] = "Apple iPods [ID: #PE897C]";

        //Using for loop to display all the products and their locations in the warehouse
        for(int i = 0; i < 3; i++) {
            System.out.printf("=-=-= Aisle %d =-=-=\n", (i+1));
            for(int j = 0; j < 3; j++) {
                System.out.printf("- Row %d -\n", (j+1));
                for(int k = 0; k < 3; k++) {
                    if(k == 2) {
                        System.out.printf("The product at aisle %d row %d column %d in the Everything Hardware Depot is: %s\n\n", (i+1), (j+1), (k+1), products[i][j][k]);
                    }
                    else {
                        System.out.printf("The product at aisle %d row %d column %d in the Everything Hardware Depot is: %s\n", (i+1), (j+1), (k+1), products[i][j][k]);
                    }
                }
            }
        }
    }
}
