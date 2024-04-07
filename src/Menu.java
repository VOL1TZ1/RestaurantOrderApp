import java.util.ArrayList;

public class Menu {
    ArrayList<Object> menu= new ArrayList<>();
    Item testDish = new Item("testDish","Not a real Dish", 10);

    void addItems(Item newDish){menu.add(newDish);}
    void removeItem(Item dish){menu.remove(dish);}

    //constructor to make 3 types of a menu:
    Menu(int i){
        switch (i){
            case 1:{addItems(testDish);break;}
            case 2:{addItems(testDish);break;}
            case 3:{addItems(testDish);break;}
            default:{
                System.out.println("No menu here yet ;)");
            }



        }
    }
}
