import java.util.ArrayList;

public class Order {
    ArrayList<Dish> cart = new ArrayList<>(); //list of dishes to act as a cart.
    double total=0; // a variable the total will be calculated in.

    public void addCart(Dish cDish){
        cart.add(cDish);
        total+= cDish.getPrice();
    }
    public void removeCart(Dish eDish){
        cart.remove(eDish);
        total-=eDish.getPrice();
    }
    public void showCart(){
        for (int i = 0; i < cart.size(); i++){
            System.out.println(STR."\{i + 1}.\{cart.get(i).getName()}: \{cart.get(i).getPrice()}");
        }
        System.out.println(STR."The total: \{total}");
    }
}
