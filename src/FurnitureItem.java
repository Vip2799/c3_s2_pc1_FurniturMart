public class FurnitureItem {

    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;
    //    double priceOfChair = 780;
//    double priceOfTable = 1430;
//    double priceOfStool = 664;
//    double priceOfCupboard = 2450;
    double priceAfterDiscount;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0.0;
        priceAfterDiscount = 0.0;

    }

    public void discountedPrice(){
        if (furnitureUsage.equalsIgnoreCase("OutDoor")) {
            priceAfterDiscount = price * 0.95;
        }
    }

    public void display() {
        System.out.println("Furniture code     = " + furnitureCode);
        System.out.println("Furniture type     = " + furnitureType);
        System.out.println("Grade of furniture = " + gradeOfFurniture);
        System.out.println("Color              = " + color);
        System.out.println("Usage of furniture = " + furnitureUsage);
        System.out.println("Price of furniture = Rs " + price);
        if (furnitureUsage.equalsIgnoreCase("OutDoor")) {
            System.out.println("Price of furniture after discount of 5 % = " + priceAfterDiscount);
        }

    }


}
