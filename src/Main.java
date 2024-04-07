import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main()  {
        
        
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("!!!! Hello and welcome to Sprints Ordering App in Java !!!!");
        //mainCourse.getDishName();
        System.out.print("choose the menu: ");
        Scanner sMenu= new Scanner(System.in);
        int categoryNum=sMenu.nextInt();
        while(categoryNum>3||categoryNum<1){
            System.out.print("choose the menu from (1-3): ");
            categoryNum=sMenu.nextInt();
        }
        Menu userMenu = new Menu(categoryNum);
        userMenu.getDishName();

        System.out.print("choose the item from (1-7): ");
        int dishNum=sMenu.nextInt();

        while(dishNum>7||dishNum<1){
            System.out.print("choose the item from (1-7): ");
            dishNum=sMenu.nextInt();
        }
        userMenu.getDishName();
    }
}