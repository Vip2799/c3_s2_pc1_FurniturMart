import java.util.Scanner;
public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem item1 = new FurnitureItem();
        System.out.println("Enter the furniture code");
        item1.furnitureCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the furniture type");
        item1.furnitureType = sc.nextLine();
        System.out.println("Enter Grade of Furniture");
        item1.gradeOfFurniture = sc.nextLine();
        System.out.println("Enter the color ");
        item1.color = sc.next();
        System.out.println("Usage of furniture ");
        item1.furnitureUsage = sc.next();
        System.out.println("Enter price of furniture ");
        item1.price = sc.nextDouble();

        item1.discountedPrice();
        item1.display();
    }
}
