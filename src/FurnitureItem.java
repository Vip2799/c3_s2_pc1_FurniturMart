public class FurnitureItem {

    int furnitureCode;
    String furnitureType;
    char gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem(){
        furnitureCode = 401;
        furnitureType = "Chair";
        gradeOfFurniture = 'B';
        color = "Blue";
        furnitureUsage = "OutDoor";
        price = 780 ;

    }

    public void discountedPrice(){
        if(furnitureUsage.equals("OutDoor")) {
            price = price * 0.95;
        }

    }

    public void display(){
        System.out.println("Furniture code     = "+ furnitureCode);
        System.out.println("Furniture type     = "+ furnitureType);
        System.out.println("Grade of furniture = "+ gradeOfFurniture);
        System.out.println("Color              = "+ color);
        System.out.println("Usage of furniture = "+ furnitureUsage);
        System.out.println("Price of furniture = Rs "+ price);

    }


}
