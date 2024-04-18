import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    ArrayList<Dish> appetizersMenu = new ArrayList<>();
    ArrayList<Dish> mainCourseMenu = new ArrayList<>();
    ArrayList<Dish> dessertsMenu = new ArrayList<>();
    ArrayList<Dish> searchResultsMenu = new ArrayList<>();
    //methods to fill the 3 menus:
    private void mainCourseDishesMenu(ArrayList<Dish> menu){
        String[] dishNames = {
                "Grilled Salmon",
                "Chicken Parmesan",
                "Beef Stroganoff",
                "Vegetable Curry",
                "Spaghetti Bolognese",
                "Mushroom Risotto",
                "Herb Roasted Chicken",
                "Eggplant Parmesan"
        };

        // Dish descriptions
        String[] dishDescriptions = {
                "Freshly grilled salmon fillet served with a side of vegetables",
                "Breaded chicken cutlets topped with marinara sauce and melted cheese",
                "Tender beef strips cooked in a creamy sauce with mushrooms and onions",
                "Assorted vegetables cooked in a flavorful curry sauce",
                "Classic Italian pasta dish with a rich meat sauce",
                "Creamy risotto cooked with mushrooms and Parmesan cheese",
                "Juicy roasted chicken seasoned with lemon and herbs",
                "Breaded and fried eggplant slices topped with marinara sauce and melted cheese"
        };

        // Dish prices
        double[] dishPrices = {
                12.99,
                10.99,
                13.49,
                11.99,
                11.99,
                9.99,
                12.49,
                10.49
        };

        int[] dishStock = {
                47,
                85,
                13,
                22,
                76,
                59,
                34,
                91
        };
        int numberOfDishes = 8;

        for (int i = 0; i < numberOfDishes; i++){
            Dish dish = new Dish(dishNames[i], dishDescriptions[i], dishPrices[i], dishStock[i]);
            menu.add(dish);
        }
    }

    private void appetizersMenu(ArrayList<Dish> menu){
        String[] dishNames = {
                "Brochette",
                "Caresse Salad",
                "Spinach Artichoke Dip",
                "Chicken Wings",
                "Mozzarella Sticks",
                "Stuffed Mushrooms",
                "Shrimp Cocktail",
                "Nachos"
        };

        // Dish descriptions
        String[] dishDescriptions = {
                "Toasted bread topped with tomatoes, garlic, and basil",
                "Fresh mozzarella, tomatoes, and basil drizzled with balsamic glaze",
                "Creamy dip with spinach, artichokes, and melted cheese",
                "Crispy chicken wings with a choice of sauce",
                "Breaded mozzarella cheese served with marinara sauce",
                "Mushroom caps stuffed with a savory filling",
                "Chilled shrimp served with cocktail sauce",
                "Tortilla chips topped with melted cheese, salsa, and guacamole"
        };

        // Dish prices
        double[] dishPrices = {
                8.99,
                9.99,
                7.99,
                10.99,
                6.99,
                8.49,
                12.99,
                9.49
        };
        int[] dishStock = {
                20,
                5,
                10,
                60,
                2,
                0,
                1,
                12
        };
        int numberOfDishes = 8;

        for (int i = 0; i < numberOfDishes; i++){
                Dish dish = new Dish(dishNames[i], dishDescriptions[i], dishPrices[i], dishStock[i]);
                menu.add(dish);
        }
    }

    private void dessertsMenu(ArrayList<Dish> menu){
        String[] dishNames = {
                "Chocolate Cake",
                "Apple Pie",
                "Cheesecake",
                "Ice Cream Sundae",
                "Creme Brulee",
                "Fruit Tart",
                "Brownie Sundae",
                "Tiramisu"
        };
        // Dish descriptions
        String[] dishDescriptions = {
                "Rich and moist chocolate cake with layers of chocolate ganache",
                "Classic apple pie with a flaky crust and warm cinnamon-spiced apple filling",
                "Creamy and smooth cheesecake with a buttery graham cracker crust",
                "Scoop of vanilla ice cream with a variety of toppings and sauces",
                "Silky custard with a caramelized sugar crust",
                "Butter pastry filled with fresh seasonal fruits and a sweet glaze",
                "Warm brownie topped with a scoop of ice cream, whipped cream, and chocolate sauce",
                "Layered dessert with espresso-soaked ladyfingers, mascarpone cheese, and cocoa"
        };
        // Dish prices
        double[] dishPrices = {
                6.99,
                5.99,
                7.49,
                8.99,
                7.99,
                6.49,
                9.49,
                8.49
        };
        int[] dishStock = {
                20,
                5,
                10,
                60,
                2,
                0,
                1,
                12
        };
        int numberOfDishes = 8;

        for (int i = 0; i < numberOfDishes; i++){
            Dish dish = new Dish(dishNames[i], dishDescriptions[i], dishPrices[i], dishStock[i]);
            menu.add(dish);
        }
    }

    //get all dish name:
    public void getDishInfo(int menuSelected, int dishIndex){
            ArrayList<Dish> menu = appetizersMenu;
            switch(menuSelected){
                case 1 -> menu = appetizersMenu;
                case 2 -> menu = mainCourseMenu;
                case 3 -> menu = dessertsMenu;
                case 4 -> menu = searchResultsMenu;
            }
            Dish dish = menu.get(dishIndex-1);
            String name = dish.getName();
            String description = dish.getDescription();
            double price = dish.getPrice();
            String availability;
            if(0 == dish.getNumInStock()){
                availability = "\u001B[31mnot available\u001B[0m";
            } else{
                availability = "\u001B[32mavailable\u001B[0m";
            }
            System.out.println("------Selected Dish------");
            System.out.printf("Name: %s\t|\tDish is " + availability + "%nPrice: \u001B[93m%.2f\u001B[0m EGP%nDish Contents: %s\n", name, price, description);
    }
    public Dish getDishFromMenu(int menuSelected, int dishIndex){
        ArrayList<Dish> menu = appetizersMenu;
        switch(menuSelected){
            case 1 -> menu = appetizersMenu;
            case 2 -> menu = mainCourseMenu;
            case 3 -> menu = dessertsMenu;
            case 4 -> menu = searchResultsMenu;
        }
        return menu.get(dishIndex);
    }
    /*
    * Outputs the list of dishes
    * */
    public void getDishMenu(int menuSelected){
        ArrayList<Dish> menu = new ArrayList<>();
        switch(menuSelected){
            case 1 -> menu = appetizersMenu;
            case 2 -> menu = mainCourseMenu;
            case 3 -> menu = dessertsMenu;
            case 4 -> menu = searchResultsMenu;
        }
        System.out.println("""
                =========================================================================\s
                \t\t|  No.\t|\t\t  Dish Name\t\t    |\t  Price\t\t|\tStock\t|
                \t\t+-------+---------------------------+---------------------------+""");
        for (int i = 0; i < menu.size(); i++) {
            Dish dish = menu.get(i);
            String name = dish.getName();
            double price = dish.getPrice();
            int stock = dish.getNumInStock();
            System.out.printf("\t\t|\t%-2d\t|\t%-24s|\t%-3.2f EGP\t|\t  %-2d\t|%n", i+1, name, price, stock);
        }
        System.out.println("\t\t+-------+---------------------------+---------------------------+");
     }

    //constructor to make 3 types of a menu:
    Menu(){
        appetizersMenu(appetizersMenu);
        mainCourseDishesMenu(mainCourseMenu);
        dessertsMenu(dessertsMenu);
    }

    public boolean searchForDishes(String key){
        boolean matchFound = false;
        //search for elements in the appetizers menu
        Pattern pattern = Pattern.compile(".*"+key+".*", Pattern.CASE_INSENSITIVE);
        for(Dish item: appetizersMenu){
            Matcher matcher = pattern.matcher(item.getName());
            if(matcher.find()){
                searchResultsMenu.add(item);
            }
        }
        //search for element in the main course menu
        for(Dish item: mainCourseMenu){
            Matcher matcher = pattern.matcher(item.getName());
            if(matcher.find()){
                searchResultsMenu.add(item);
            }
        }
        //search for element in the dessert menu
        for(Dish item: dessertsMenu){
            Matcher matcher = pattern.matcher(item.getName());
            if(matcher.find()){
                searchResultsMenu.add(item);
            }
        }
        System.out.println("\t\t\t\t\t\t\tSearch Results");
        if(searchResultsMenu.isEmpty()){
            System.out.println("=========================================================================");
            System.out.println("Oops!! The dish your are looking for is not there yet. :O");
        } else {
            getDishMenu(4);
            matchFound = true;
        }
        return matchFound;
    }
}
