import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    ArrayList<Dish> cart = new ArrayList<>(); //list of dishes to act as a cart.
    static double total; // a variable the total will be calculated in.
    double taxPercent = 0.12; //taxes is 12%
    double discount = 0;
    String paymentOption;
    public void addCart(Dish cDish){
        boolean duplicateItem = false;
        //check if the same dish is ordered multiple times
        for(Dish item:cart){
            if(Objects.equals(item.getName(), cDish.getName())){
                item.incrementNumberOfDishesOrdered();
                duplicateItem = true;
                break;
            }
        }
        if(!duplicateItem){
            cDish.incrementNumberOfDishesOrdered();
            cart.add(cDish);
        }
        total+= cDish.getPrice();
    }
    public void removeCart(){
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();
        total -= cart.get(itemNum-1).getPrice();
        cart.remove(itemNum-1);
        showCart();
    }
    public void showCart(){
        System.out.println("\t\t\t\t\t\t\tCart Items");
        System.out.println("""
                -----------------------------------------------------------------\s
                |  No.\t|\t\t  Dish Name\t\t    |\t  Price\t\t| Quantity  |
                +-------+---------------------------+---------------------------+""");
        for (int i = 0; i < cart.size(); i++) {
            System.out.printf("|\t%-2d\t|\t%-24s|\t%-3.2f EGP\t|\t  %-2d\t|%n",
                    i+1, cart.get(i).getName(), cart.get(i).getPrice(), cart.get(i).getNumDishesOrdered());
        }
        System.out.println("+-------+---------------------------+---------------------------+");
    }
    public void finalCart(){
        System.out.printf("""
                Subtotal: %.2f\s
                Tax: %.2f
                Discount: %.2f
                \u001B[1mTotal:\u001B[0m %.2f
                """, total, total*taxPercent, total*discount, ((total*taxPercent)+total) - (total*discount));
    }
    public void increaseCart(){
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();
        System.out.print("Enter modification value (+) to increase/(-) to decrease. For example, +2 will increase the number of dishes by 2.: ");
//        System.out.print("How many times do you want to increase the quantity of the dish : ");
        String userInput = dishNum.next();
        if('+' == userInput.charAt(0)){
            for(int i = 0; i < Integer.parseInt(userInput.substring(1)); i++){
                cart.get(itemNum-1).incrementNumberOfDishesOrdered();
            }
        } else if('-' == userInput.charAt(0)){
            for(int i = 0; i < Integer.parseInt(userInput.substring(1)); i++){
                cart.get(itemNum-1).decrementNumberOfDishesOrdered();
            }
        }
    }
    public void applyCoupon(){
        String[] coupons = new String[]{"WE10","NBE10","CIB10","NBK10","QNB10"};
        System.out.print("Enter promo code: ");
        Scanner userCoupon = new Scanner(System.in);
        String enteredCoupon = userCoupon.next();
        boolean isCouponValid = false;
        for (String coupon: coupons) {
            if(Objects.equals(enteredCoupon, coupon)){
                discount = 0.1;
                isCouponValid = true;
                break;
            }
        }
        if(isCouponValid){
            System.out.println("Promo code is valid");
            finalCart();
        } else{
            System.out.println("Promo code is invalid");
        }
    }

    public void confirmPayment(){
        System.out.print("""
                Please choose payment option: \s
                (1) Cash on delivery
                (2) Credit Card
                """);
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if('1' == input){
            paymentOption = "Cash on delivery";
        } else{
            paymentOption = "Credit Card";
        }
        System.out.println("Payment method selected: " + paymentOption);
    }
}
