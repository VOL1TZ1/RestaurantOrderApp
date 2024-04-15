import java.util.Scanner;

public class Main {
    public static void main()  {
        //Making an object of Order:
        Order userOrder =new Order();
        boolean infLoop =true;
        //Intro to the program:
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("!!!! Hello and welcome to Sprints Ordering App in Java !!!!");

        while (infLoop){
        //Choosing the dish:
        System.out.print("choose the menu: ");
        Scanner sMenu= new Scanner(System.in);
        int categoryNum=sMenu.nextInt();    //keeping track of which menu to use

        while(categoryNum>3||categoryNum<1){    //a loop to make sure the user choose a valid menu number
            System.out.print("choose the menu from (1-3): ");
            categoryNum=sMenu.nextInt();
        }
        Menu userMenu = new Menu(categoryNum);
        userMenu.getDishMenu(); //a method to show all the dishes in the menu

        System.out.print("choose the item from (1-7): ");
        int dishNum=sMenu.nextInt();    //keeping track of dish number

        while(dishNum>7||dishNum<1){    //a loop to make sure the user choose a valid dish number
            System.out.print("choose the item from (1-7): ");
            dishNum=sMenu.nextInt();
        }

//        //making a dish object to store the user's choice and adding it to the cart:
//        Dish userDish = userMenu.menu.get(dishNum);
//        userOrder.addCart(userDish);

        //show the dish info
        userMenu.getDishInfo(dishNum);
        System.out.printf("do you like to add the dish to the cart? (Y/N): ");
        Scanner addChoice =new Scanner(System.in);
        char choice =addChoice.next().charAt(0);
        switch (choice){
            case 'y':
            case 'Y':
            {
                Dish userDish = userMenu.menu.get(dishNum);
                userOrder.addCart(userDish);
                userOrder.showCart();
                System.out.printf("want to keep browsing or checkout ?:");
                String cartChoice =addChoice.next();
                if (cartChoice != "browsing" && cartChoice != "continue") {
                    infLoop = false;
                }
                break;
            }
            case 'n':
            case 'N':{continue;}
            default:{
                System.out.printf("unexpected error");
            }


        }

        }


    }


}