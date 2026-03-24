import java.util.Scanner;

public class Zomatto {
    public static void main(String[] args) {
        System.out.println("Welcome to Zomatto!");
        System.out.println("Enjoy delicious food delivered to your doorstep.");
        System.out.println("Enter the Hotel name to order your favorite meal.");
        System.out.println("Dindugul Thalappakattu Biriyani\n Anjappar Chettinad Restaurant\n Hotel Saravana Bhavan\n Sangeetha Veg Restaurant\n A2B - Adyar Ananda Bhavan");
        Scanner sc = new Scanner(System.in);
        String hotelName = sc.nextLine();
        switch (hotelName) {
            case "Dindugul Thalappakattu Biriyani" -> {
                System.out.println("You have selected Dindugul Thalappakattu Biriyani.");
                System.out.println("Menu:\n1. Chicken Biriyani\n2. Mutton Biriyani\n3. Veg Biriyani");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("You have selected Chicken Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Chicken Biriyani(s).");
                        int price = 450;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 2 -> {
                        System.out.println("You have selected Mutton Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Mutton Biriyani(s). Enjoy your meal!");
                        int price = 350;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 3 -> {
                        System.out.println("You have selected Veg Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Veg Biriyani(s). Enjoy your meal!");
                        int price = 250;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            case "Anjappar Chettinad Restaurant" -> {
                System.out.println("You have selected Anjappar Chettinad Restaurant. Enjoy your meal!");
                System.out.println("Menu:\n1. Chicken Biriyani\n2. Mutton Biriyani\n3. Veg Biriyani");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("You have selected Chicken Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Chicken Biriyani(s).");
                        int price = 450;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 2 -> {
                        System.out.println("You have selected Mutton Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Mutton Biriyani(s). Enjoy your meal!");
                        int price = 350;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 3 -> {
                        System.out.println("You have selected Veg Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Veg Biriyani(s). Enjoy your meal!");
                        int price = 250;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            case "Hotel Saravana Bhavan" -> {
                System.out.println("You have selected Hotel Saravana Bhavan. Enjoy your meal!");
                System.out.println("Menu:\n1. Chicken Biriyani\n2. Mutton Biriyani\n3. Veg Biriyani");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("You have selected Chicken Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Chicken Biriyani(s).");
                        int price = 450;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 2 -> {
                        System.out.println("You have selected Mutton Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Mutton Biriyani(s). Enjoy your meal!");
                        int price = 350;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 3 -> {
                        System.out.println("You have selected Veg Biriyani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Veg Biriyani(s). Enjoy your meal!");
                        int price = 250;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            case "Sangeetha Veg Restaurant" -> {
                System.out.println("You have selected Sangeetha Veg Restaurant. Enjoy your meal!");
                System.out.println("Menu:\n1. Dal Fry\n2. Paneer Tikka\n3. Veg Biryani");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("You have selected Dal Fry.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Dal Fry(s).");
                        int price = 150;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 2 -> {
                        System.out.println("You have selected Paneer Tikka.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Paneer Tikka(s).");
                        int price = 200;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 3 -> {
                        System.out.println("You have selected Veg Biryani.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Veg Biryani(s). Enjoy your meal!");
                        int price = 180;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            case "A2B - Adyar Ananda Bhavan" -> {
                System.out.println("You have selected A2B - Adyar Ananda Bhavan. Enjoy your meal!");
                System.out.println("Menu:\n1. Masala Dosa\n2. Idli\n3. Vada");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("You have selected Masala Dosa.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Masala Dosa(s).");
                        int price = 80;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 2 -> {
                        System.out.println("You have selected Idli.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Idli(s).");
                        int price = 50;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    case 3 -> {
                        System.out.println("You have selected Vada.");
                        System.out.println("Enter the quantity: ");
                        int quantity = sc.nextInt();
                        System.out.println("You have ordered " + quantity + " Vada(s).");
                        int price = 40;
                        int amount = price * quantity;
                        System.out.println("Total amount: " + amount + " INR. Enjoy your meal!");
                        PaymentHandler.processPayment(sc, amount);
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
            default -> System.out.println("Sorry, we do not have that hotel in our menu.");
        }
    }
}