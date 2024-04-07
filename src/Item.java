public class Item {
    //The Class Variables:
    private String name, description;
    private double price;

    //Default constructor:
    public Item() {
        this.name="Dish";
        this.description="A dish";
        this.price=0;
    }

    //Constructor for entering all item's data:
    public Item(String dName , String dDescription, double dPrice){
        this.name=dName;
        this.description=dDescription;
        this.price=dPrice;
    }

    //The "Get" methods:
    void setName(String name){this.name=name;}
    void setDescription(String description){this.description=description;}
    void setPrice(double price){this.price=price;}

    //The "Set" methods:
    String getName(){return this.name;}
    String getDescription(){return this.description;}
    double getPrice(){return this.price;}


}
