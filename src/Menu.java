import java.util.ArrayList;

public class Menu {
    ArrayList<Dish> menu= new ArrayList<>();



//methods to add and remove dishes(as of this moment not needed):
    // void addItems(Dish newDish){menu.add(newDish);}
    // void removeItem(Dish dish){menu.remove(dish);}


    //methods to fill the 3 menus (note menu 2 &3 still need filling the data is a placeholder) :
    private void addMenu1(ArrayList<Dish> menu1){
        Dish dish1 =new Dish("Grilled Salmon with Lemon Herb Butter",
                "Succulent salmon fillet grilled to perfection, topped with a zesty lemon herb butter sauce. Served with a side of roasted vegetables and garlic mashed potatoes.",
                18.99);menu1.add(dish1);
        Dish dish2 =new Dish("Beef Tenderloin Medallions",
                "Tender beef tenderloin medallions seasoned with a blend of herbs and spices, seared to a juicy perfection. Accompanied by a red wine reduction sauce, roasted Brussels sprouts, and creamy mashed sweet potatoes.",
                22.99);menu1.add(dish2);
        Dish dish3 =new Dish("Mushroom Risotto",
                "Creamy Arborio rice cooked to perfection with a medley of mushrooms, garlic, and Parmesan cheese. Garnished with fresh parsley and drizzled with truffle oil.",
                16.99);menu1.add(dish3);
        Dish dish4 =new Dish("Chicken Marsala",
                "Sautéed chicken breasts smothered in a rich Marsala wine sauce with mushrooms, onions, and garlic. Served with a side of roasted asparagus and garlic herb roasted potatoes.",
                17.99);menu1.add(dish4);
        Dish dish5 =new Dish("Vegetable Stir-Fry",
                "Fresh mixed vegetables stir-fried to perfection in a savory ginger soy sauce. Served over a bed of steamed jasmine rice and garnished with toasted sesame seeds",
                14.99);menu1.add(dish5);
        Dish dish6 =new Dish("Eggplant Parmesan",
                "Layers of crispy breaded eggplant slices, marinara sauce, and melted mozzarella cheese, baked to golden perfection. Served with a side of spaghetti marinara and garlic bread.",
                15.99);menu1.add(dish6);
        Dish dish7 =new Dish("Shrimp Scampi Pasta",
                "Succulent shrimp sautéed with garlic, white wine, and lemon butter sauce, tossed with linguine pasta and sprinkled with freshly grated Parmesan cheese.",
                19.99);menu1.add(dish7);
        Dish dish8 =new Dish("Vegetarian Pad Thai",
                "Stir-fried rice noodles with tofu, bean sprouts, bell peppers, and green onions in a tangy tamarind sauce, garnished with crushed peanuts and cilantro.",
                16.99);menu1.add(dish8);
    }
    private void addMenu2(ArrayList<Dish> menu2){
        Dish dish1 =new Dish("Grilled Salmon with Lemon Herb Butter",
                "Succulent salmon fillet grilled to perfection, topped with a zesty lemon herb butter sauce. Served with a side of roasted vegetables and garlic mashed potatoes.",
                18.99);menu2.add(dish1);
        Dish dish2 =new Dish("Beef Tenderloin Medallions",
                "Tender beef tenderloin medallions seasoned with a blend of herbs and spices, seared to a juicy perfection. Accompanied by a red wine reduction sauce, roasted Brussels sprouts, and creamy mashed sweet potatoes.",
                22.99);menu2.add(dish2);
        Dish dish3 =new Dish("Mushroom Risotto",
                "Creamy Arborio rice cooked to perfection with a medley of mushrooms, garlic, and Parmesan cheese. Garnished with fresh parsley and drizzled with truffle oil.",
                16.99);menu2.add(dish3);
        Dish dish4 =new Dish("Chicken Marsala",
                "Sautéed chicken breasts smothered in a rich Marsala wine sauce with mushrooms, onions, and garlic. Served with a side of roasted asparagus and garlic herb roasted potatoes.",
                17.99);menu2.add(dish4);
        Dish dish5 =new Dish("Vegetable Stir-Fry",
                "Fresh mixed vegetables stir-fried to perfection in a savory ginger soy sauce. Served over a bed of steamed jasmine rice and garnished with toasted sesame seeds",
                14.99);menu2.add(dish5);
        Dish dish6 =new Dish("Eggplant Parmesan",
                "Layers of crispy breaded eggplant slices, marinara sauce, and melted mozzarella cheese, baked to golden perfection. Served with a side of spaghetti marinara and garlic bread.",
                15.99);menu2.add(dish6);
        Dish dish7 =new Dish("Shrimp Scampi Pasta",
                "Succulent shrimp sautéed with garlic, white wine, and lemon butter sauce, tossed with linguine pasta and sprinkled with freshly grated Parmesan cheese.",
                19.99);menu2.add(dish7);
        Dish dish8 =new Dish("Vegetarian Pad Thai",
                "Stir-fried rice noodles with tofu, bean sprouts, bell peppers, and green onions in a tangy tamarind sauce, garnished with crushed peanuts and cilantro.",
                16.99);menu2.add(dish8);
    }
    private void addMenu3(ArrayList<Dish> menu3){
        Dish dish1 =new Dish("Grilled Salmon with Lemon Herb Butter",
                "Succulent salmon fillet grilled to perfection, topped with a zesty lemon herb butter sauce. Served with a side of roasted vegetables and garlic mashed potatoes.",
                18.99);menu3.add(dish1);
        Dish dish2 =new Dish("Beef Tenderloin Medallions",
                "Tender beef tenderloin medallions seasoned with a blend of herbs and spices, seared to a juicy perfection. Accompanied by a red wine reduction sauce, roasted Brussels sprouts, and creamy mashed sweet potatoes.",
                22.99);menu3.add(dish2);
        Dish dish3 =new Dish("Mushroom Risotto",
                "Creamy Arborio rice cooked to perfection with a medley of mushrooms, garlic, and Parmesan cheese. Garnished with fresh parsley and drizzled with truffle oil.",
                16.99);menu3.add(dish3);
        Dish dish4 =new Dish("Chicken Marsala",
                "Sautéed chicken breasts smothered in a rich Marsala wine sauce with mushrooms, onions, and garlic. Served with a side of roasted asparagus and garlic herb roasted potatoes.",
                17.99);menu3.add(dish4);
        Dish dish5 =new Dish("Vegetable Stir-Fry",
                "Fresh mixed vegetables stir-fried to perfection in a savory ginger soy sauce. Served over a bed of steamed jasmine rice and garnished with toasted sesame seeds",
                14.99);menu3.add(dish5);
        Dish dish6 =new Dish("Eggplant Parmesan",
                "Layers of crispy breaded eggplant slices, marinara sauce, and melted mozzarella cheese, baked to golden perfection. Served with a side of spaghetti marinara and garlic bread.",
                15.99);menu3.add(dish6);
        Dish dish7 =new Dish("Shrimp Scampi Pasta",
                "Succulent shrimp sautéed with garlic, white wine, and lemon butter sauce, tossed with linguine pasta and sprinkled with freshly grated Parmesan cheese.",
                19.99);menu3.add(dish7);
        Dish dish8 =new Dish("Vegetarian Pad Thai",
                "Stir-fried rice noodles with tofu, bean sprouts, bell peppers, and green onions in a tangy tamarind sauce, garnished with crushed peanuts and cilantro.",
                16.99);menu3.add(dish8);
    }

    //get all dish name:
    public void getDishInfo(int i){
        ArrayList<Dish> dishes = this.menu;

            Dish dish = dishes.get(i-1);
            String name = dish.getName();
            String description = dish.getDescription();
            double price = dish.getPrice();
            System.out.println(STR."\{name}: \{price} \n\{description}" );

    }
    public void getDishMenu(){
        ArrayList<Dish> dishes = this.menu;
        for (int i = 0; i < dishes.size(); i++) {
            Dish dish = dishes.get(i);
            String name = dish.getName();
            double price = dish.getPrice();
            System.out.printf(STR."\{i+1}.\{name}: \{price}%n");
        }
     }
    //constructor to make 3 types of a menu:
    Menu(int i){
        switch (i) {
            case 1 -> {
                addMenu1(menu);
            }
            case 2 -> {
                addMenu2(menu);
            }
            case 3 -> {
                addMenu3(menu);
            }
            default -> {
                System.out.println("No menu here yet ;)");
            }
        }
    }
}
