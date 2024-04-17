import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Page divider
        char character = '*';
        int repeatCount = 73;
        String pageDivider = String.valueOf(character).repeat(repeatCount);
        //Making an object of Order:
        Order userOrder = new Order();
        boolean infLoop = true;
        //Intro to the program:
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("!!!! Hello and welcome to Sprints Ordering App in Java !!!!");

        //menu loop:
        while (infLoop) {
            System.out.println(pageDivider);
            System.out.println("""
                \t\t\t\t\t\t\tMain Menu\s
                =========================================================================""");
            //Choosing the dish:
            //System.out.print("choose the menu: ");
            System.out.println("""
                    Choose one of the following menus:\s
                    (1) Appetizers
                    (2) Main Course Dishes
                    (3) Desserts""");
            Scanner sMenu = new Scanner(System.in);
            int categoryNum = sMenu.nextInt();    //keeping track of which menu to use

            while (categoryNum > 3 || categoryNum < 1) {    //a loop to make sure the user choose a valid menu number
                System.out.print("Invalid Input detected! Please enter one of the numbers between parentheses: ");
                categoryNum = sMenu.nextInt();
            }
            //to divide the console into multiple pages
            System.out.println(pageDivider);
            Menu userMenu = new Menu(categoryNum);
            switch(categoryNum){
                case 1 -> System.out.println("\t\t\t\t\t\t\tAppetizers Menu");
                case 2 -> System.out.println("\t\t\t\t\t\t\tMain Course Menu");
                case 3 -> System.out.println("\t\t\t\t\t\t\tDesserts Menu");
                //the default is useless anyway
                default -> System.out.println("\t\t\t\t\t\t\tDishes Menu");
            }

            userMenu.getDishMenu(); //a method to show all the dishes in the menu
            System.out.print("Please dish number: ");
            int dishNum = sMenu.nextInt();    //keeping track of dish number

            while (dishNum > 8 || dishNum < 1) {    //a loop to make sure the user choose a valid dish number
                System.out.print("Invalid Input detected! Please enter a valid dish number: ");
                dishNum = sMenu.nextInt();
            }


            //show the dish info
            userMenu.getDishInfo(dishNum);
            System.out.print("do you like to add the dish to the cart? (y/n): ");
            Scanner addChoice = new Scanner(System.in);
            char choice = addChoice.next().toLowerCase().charAt(0);
            switch (choice) {
                case 'y':
                    Dish userDish = userMenu.menu.get(dishNum);
                    if(0 == userDish.getNumInStock()){
                        System.out.println("The dish selected cannot be added to the cart!");
                    } else{
                        userOrder.addCart(userDish);
                    }
                    System.out.print("Do you want to keep browsing? (y/n): ");
                    char cartChoice = addChoice.next().toLowerCase().charAt(0);
                    if ('n' == cartChoice) {
                        infLoop = false;
                    }
                    break;
                case 'n':
                    break;
                default: {
                    System.out.print("Invalid input detected! Please try again..");
                    break;
                }
            }
        }
        //to divide the console into multiple pages
        System.out.println(pageDivider);
        System.out.println("""
                \t\t\t\t\t\t\tCheckout Menu\s
                =========================================================================""");
        //checkout loop:
        while (!infLoop) {
            userOrder.showCart();
            userOrder.finalCart();
            System.out.print("Do you want to make any changes to cart (y/n): ");
            Scanner addChoice = new Scanner(System.in);
            char choice = addChoice.next().toLowerCase().charAt(0);
            switch (choice) {
                case 'y':
                case 'Y': {
                    boolean checkoutFlag = true;
                    //edit the cart loop:
                    while (checkoutFlag) {
                        System.out.print("""
                            1.to Show the items in the cart
                            2.to Increase items quantities
                            3.to Remove item
                            4.to Apply discounts or promotions
                            5.to Checkout
                            """);
                        Scanner cartChoice = new Scanner(System.in);
                        int cChoice = cartChoice.nextInt();
                        switch (cChoice) {
                            case 1: {
                                userOrder.showCart();
                                break;
                            }
                            case 2: {
                                userOrder.increaseCart();
                                break;
                            }
                            case 3: {
                                userOrder.removeCart();
                                break;
                            }
                            case 4: {
                                userOrder.discount();
                                break;
                            }
                            case 5: {
                                checkoutFlag = false;
                                break;
                            }
                            default: {
                                System.out.print("Enter a valid number (1-5):");
                            }
                        }

                    }
                }
                case 'n':
                case 'N': {
                    userOrder.finalCart();
                    infLoop = true;
                }
                default: {
                    System.out.print("unexpected error");
                }


            }

        }


    }
}
