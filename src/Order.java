import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    ArrayList<Dish> cart = new ArrayList<>(); //list of dishes to act as a cart.
    double total=0; // a variable the total will be calculated in.
    double taxPercent = 0.12; //taxes is 12%
    double totalAfterTax;
    double coupon=0;

    public void addCart(Dish cDish){
        cart.add(cDish);
        total+= cDish.getPrice();
    }
    public void removeCart(){
        ArrayList<Dish> userDish=this.cart;
        for (int i = 0; i < userDish.size(); i++){
            System.out.println(STR."\{i + 1}.\{cart.get(i).getName()}:");
        }
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();

        cart.remove(userDish.get(itemNum-1));
        this.total-=userDish.get(itemNum-1).getPrice();
    }
    public void showCart(){
        for (int i = 0; i < cart.size(); i++){
            System.out.println(STR."\{i + 1}.\{cart.get(i).getName()}: \{cart.get(i).getPrice()}");
        }
        System.out.printf("The total: %.2f \n" ,total);
    }
    public void finalCart(){
        for (int i = 0; i < cart.size(); i++){
            System.out.println(STR."\{i + 1}.\{cart.get(i).getName()}: \{cart.get(i).getPrice()}");
        }
        System.out.printf("The order: %.2f \n" ,total);
        System.out.printf("Tax: %.2f \n",total*taxPercent);
        totalAfterTax=(total*taxPercent)+total;
        System.out.printf("Discount: %.2f \n",total*coupon);
        double totalAfterCoupon=totalAfterTax-(total*coupon);
        System.out.printf("The total: %.2f \n" ,totalAfterCoupon);

    }
    public void increaseCart(){
        ArrayList<Dish> userDish=this.cart;
        for (int i = 0; i < userDish.size(); i++){
            System.out.println(STR."\{i + 1}.\{cart.get(i).getName()}:");
        }
        System.out.print("Enter the item's number: ");
        Scanner dishNum= new Scanner(System.in);
        int itemNum =dishNum.nextInt();
        System.out.print("How many times do you want to increase the quantity of the dish : ");
        int dishQuantity= dishNum.nextInt();
        //loop to add the dish as many times as the user wants:
        for (int i = 0; i < dishQuantity; i++) {
            userDish.add(userDish.get(itemNum-1));
        }
    }
    public void discount(){
        System.out.print("Enter discount coupon: ");
        String[] coupons =new String[]{"WE10","NBE10","CIB10","NBK10","QNB10"};
        Scanner userCoupon=new Scanner(System.in);
        String enteredCoupon =userCoupon.next();
        for (int i = 0; i < coupons.length; i++) {
            if(enteredCoupon==coupons[i]){
                System.out.println("coupon is valid");
                coupon =0.1;
                break;
            }
            if(i==coupons.length-1){
                System.out.println("coupon is invalid");
                break;
            }
        }


    }
}
