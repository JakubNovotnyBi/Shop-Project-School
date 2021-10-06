import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String[] products = {"(0)Cut Watermelon 3$", "(1)Freshness Guaranteed Italian Bread Loaf 1$", "(2)Heinz Tomato Ketchup Value Size 14$", "(3)Gala Apples 1$", "(4)I Can't Believe It's Not Butter Original Vegetable Oil Spread 3$",
                "(5)HUBBA BUBBA Original Bubble Gum Tape 1$", "(6)Clorox Splash-Less Liquid Bleach 4$", "(7)Hiland Whole Vitamin D Milk 5$", "(8)onn. 27\" Curved QHD (2560x1440) 165hz 1ms Adaptive-Sync Gaming Monitor 209$",
                "(9)Doritos Nacho Cheese Flavored Tortilla Chips 4$"};
        int[] productsCount = new int[products.length];
        int total = 0;

        System.out.print("Welcome to WALMART please enter product code: ");

        String s = sc.nextLine().trim();

        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        int[] choose;
        choose = intArray;

        for (int j = 0; j < choose.length; j++) {
            int k = choose[j];

            switch (k) {
                case 0:
                    total += 3;
                    productsCount[0]++;
                    break;

                case 1:
                    total += 1;
                    productsCount[1]++;
                    break;

                case 2:
                    total += 14;
                    productsCount[2]++;
                    break;

                case 3:
                    total += 1;
                    productsCount[3]++;
                    break;

                case 4:
                    total += 3;
                    productsCount[4]++;
                    break;

                case 5:
                    total += 1;
                    productsCount[5]++;
                    break;

                case 6:
                    total += 4;
                    productsCount[6]++;
                    break;
                case 7:
                    total += 5;
                    productsCount[7]++;
                    break;
                case 8:
                    total += 209;
                    productsCount[8]++;
                    break;
                case 9:
                    total += 4;
                    productsCount[9]++;
                    break;


                default:
                    System.out.println("404 product not found, try to ask shop assistant ");
                    break;
            }
        }

        for (int i = 0; i < products.length; i++) {
            System.out.println(productsCount[i] + "x" + " " + products[i]);
        }
        System.out.println("Total price: " + total + " $");
        System.out.print("Save Money. Live Better");

    }
}

