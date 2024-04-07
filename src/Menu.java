import java.util.ArrayList;

public class Menu {
    ArrayList<Dish> menu= new ArrayList<>();


    //methods to add and remove dishes:
    void addItems(Dish newDish){menu.add(newDish);}
    void removeItem(Dish dish){menu.remove(dish);}



    //methods to fill the 3 menus:
    private void addMenu1(ArrayList<Dish> menu1){
        Dish dish1 =new Dish("Grilled Salmon with Lemon Herb Butter",
                "Succulent salmon fillet grilled to perfection, topped with a zesty lemon herb butter sauce. Served with a side of roasted vegetables and garlic mashed potatoes.",
                18.99);
        menu1.add(dish1);
    }
    private void addMenu2(ArrayList<Dish> menu2){
        Dish dish1 =new Dish("Garlic Parmesan Roasted Potatoes",
                "Crispy roasted potatoes seasoned with garlic, Parmesan cheese, and fresh herbs.",
                4.99);

        menu2.add(dish1);
    }
    private void addMenu3(ArrayList<Dish> menu3){
        Dish dish1 =new Dish("Classic New York Cheesecake",
                "Rich and creamy cheesecake on a graham cracker crust, served plain or with a choice of strawberry or blueberry topping.",
                7.99);
        menu3.add(dish1);
    }

    //get dish name:
    public void getDishName(){
        for(int i=0; i< this.menu.size();i++) {
            System.out.printf(this.menu.get(i).getName());
        }
    }

    //constructor to make 3 types of a menu:
    Menu(int i){
        switch (i){
            case 1:{addMenu1(menu);break;}
            case 2:{addMenu2(menu);break;}
            case 3:{addMenu3(menu);break;}
            default:{
                System.out.println("No menu here yet ;)");
            }



        }
    }
}
