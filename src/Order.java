import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    ArrayList<Dish> cart = new ArrayList<>(); //list of dishes to act as a cart.
    static double total; // a variable the total will be calculated in.
    double taxPercent = 0.14; //taxes is 14%
    double discount = 0;
    String paymentOption;
    private String specialRequirements;
    public void setSpecialRequirements(String req){specialRequirements = req;}
    public void addToCart(Dish cDish){
        boolean duplicateItem = false;
        //check if the same dish is ordered multiple times
        for(Dish item:cart){
            if(Objects.equals(item.getName(), cDish.getName())){
                item.incrementNumberOfDishesOrdered();
                item.decreaseStock(1);
                duplicateItem = true;
                break;
            }
        }
        if(!duplicateItem){
            cDish.incrementNumberOfDishesOrdered();
            cDish.decreaseStock(1);
            cart.add(cDish);
        }
        total+= cDish.getPrice();
    }
    public void removeFromCart(){
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();
        total -= (cart.get(itemNum-1).getPrice() * cart.get(itemNum - 1).getNumDishesOrdered());
        cart.get(itemNum - 1).decreaseStock(cart.get(itemNum - 1).getNumDishesOrdered());
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
        total = 0;
        for(Dish d: cart){
            total += (d.getPrice() * d.getNumDishesOrdered());
        }
        System.out.printf("""
                Subtotal: %.2f EGP\s
                Tax: %.2f EGP
                Discount: %.2f EGP
                Total before discount: \u001B[31m%.2f EGP\u001B[0m
                Total after discount: \u001B[32m%.2f EGP\u001B[0m
                """, total, total*taxPercent, total*discount, (total*taxPercent)+total, ((total*taxPercent)+total) - (total*discount));
        System.out.println("Special Requirements:\n" + specialRequirements);
    }
    public void increaseItemQuantities(){
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();
        System.out.print("Enter modification value (+) to increase/(-) to decrease. For example, +2 will increase the number of dishes by 2.: ");
        String userInput = dishNum.next();
        if('+' == userInput.charAt(0)){
            for(int i = 0; i < Integer.parseInt(userInput.substring(1)); i++){
                cart.get(itemNum-1).incrementNumberOfDishesOrdered();
            }
            cart.get(itemNum - 1).decreaseStock(Integer.parseInt(userInput.substring(1)));
        } else if('-' == userInput.charAt(0)){
            for(int i = 0; i < Integer.parseInt(userInput.substring(1)); i++){
                cart.get(itemNum-1).decrementNumberOfDishesOrdered();
            }
            cart.get(itemNum - 1).increaseStock(Integer.parseInt(userInput.substring(1)));
        }
        showCart();
    }
    public void applyCoupon(){
        String[] coupons = new String[]{"WE10","NBE10","CIB10","NBK10","QNB10"};
        boolean isCouponValid = false;
        boolean isCouponSessionRunning = true;
        while(isCouponSessionRunning){
            System.out.print("Enter promo code: ");
            Scanner userCoupon = new Scanner(System.in);
            String enteredCoupon = userCoupon.next();
            for (String coupon: coupons) {
                if(Objects.equals(enteredCoupon, coupon)){
                    discount = 0.1;
                    isCouponValid = true;
                    break;
                }
            }
            if(isCouponValid){
                System.out.println("Hurray!! Promo code is valid");
                finalCart();
                isCouponSessionRunning = false;
            } else{
                System.out.println("Oops! Promo code is invalid");
                System.out.println("Do you want to try again? (y/n)");
                char choice = userCoupon.next().toLowerCase().charAt(0);
                if('n' == choice){
                    isCouponSessionRunning = false;
                }
            }
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
