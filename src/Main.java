import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main() {
        //Making an object of Order:
        Order userOrder = new Order();
        boolean infLoop = true;
        //Intro to the program:
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("!!!! Hello and welcome to Sprints Ordering App in Java !!!!");

        //menu loop:
        while (infLoop) {
            //Choosing the dish:
            System.out.print("choose the menu: ");
            Scanner sMenu = new Scanner(System.in);
            int categoryNum = sMenu.nextInt();    //keeping track of which menu to use

            while (categoryNum > 3 || categoryNum < 1) {    //a loop to make sure the user choose a valid menu number
                System.out.print("choose the menu from (1-3): ");
                categoryNum = sMenu.nextInt();
            }
            Menu userMenu = new Menu(categoryNum);
            userMenu.getDishMenu(); //a method to show all the dishes in the menu

            System.out.print("choose the item from (1-7): ");
            int dishNum = sMenu.nextInt();    //keeping track of dish number

            while (dishNum > 7 || dishNum < 1) {    //a loop to make sure the user choose a valid dish number
                System.out.print("choose the item from (1-7): ");
                dishNum = sMenu.nextInt();
            }



            //show the dish info
            userMenu.getDishInfo(dishNum);
            System.out.print("do you like to add the dish to the cart? (Y/N): ");
            Scanner addChoice = new Scanner(System.in);
            char choice = addChoice.next().charAt(0);
            switch (choice) {
                case 'y':
                case 'Y': {
                    Dish userDish = userMenu.menu.get(dishNum);
                    userOrder.addCart(userDish);
                    userOrder.showCart();
                    System.out.print("want to keep browsing or checkout ?:");
                    String cartChoice = addChoice.next();
                    if (Objects.equals(cartChoice, "checkout")) { //using Objects.equals to make it null safe
                        infLoop = false;
                    }
                    break;
                }
                case 'n':
                case 'N': {
                    continue;
                }
                default: {
                    System.out.print("unexpected error");
                }


            }
        }

       //checkout loop:
        while (!infLoop) {

            userOrder.finalCart();
            System.out.print("want to make any changes (Y/N): ");
            Scanner addChoice = new Scanner(System.in);
            char choice = addChoice.next().charAt(0);
            switch (choice) {
                case 'y':
                case 'Y': {
                    boolean checkoutFlag=true;
                    //edit the cart loop:
                    while (checkoutFlag){
                    System.out.print("""
                            1.to Show the items in the cart
                            2.to Increase items quantities
                            3.to Remove item
                            4.to Apply discounts or promotions
                            5.to Checkout
                            """);
                            Scanner cartChoice = new Scanner(System.in);
                            int cChoice = cartChoice.nextInt();
                            switch (cChoice){
                                case 1:{userOrder.showCart();break;}
                                case 2:{userOrder.increaseCart();break;}
                                case 3:{userOrder.removeCart();break;}
                                case 4:{userOrder.discount();break;}
                                case 5:{checkoutFlag=false;break;}
                                default:{
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