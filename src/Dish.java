public class Dish {
    //The Class Variables:
    private String name, description;
    private double price;
    private int numInStock;
    private int numDishesOrdered;

    //Default constructor:
    public Dish() {
        this.name="Dish";
        this.description="A dish";
        this.price=0;
        this.numInStock = 0;
    }

    //Constructor for entering all dish's data:
    public Dish(String dName , String dDescription, double dPrice, int dStock){
        this.name=dName;
        this.description=dDescription;
        this.price=dPrice;
        this.numInStock = dStock;
    }

    //The "Set" methods:
    //void setName(String name){this.name=name;}
    //void setDescription(String description){this.description=description;}
    //void setPrice(double price){this.price=price;}
    //void setNumInStock(int stock){this.numInStock = stock;}
    void decreaseStock(int num){numInStock -= num;}
    void increaseStock(int num){numInStock += num;}
    void incrementNumberOfDishesOrdered(){numDishesOrdered++;}
    void decrementNumberOfDishesOrdered(){numDishesOrdered--;}

    //The "Get" methods:
    String getName(){return this.name;}
    String getDescription(){return this.description;}
    double getPrice(){return this.price;}
    int getNumDishesOrdered(){return this.numDishesOrdered;}
    int getNumInStock(){return this.numInStock;}
}
