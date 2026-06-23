import java.util.Scanner;

public class Ecommerce_platform {

    public static int searchProduct(String[] products, String target) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String[] products = {
            "Laptop",
            "Mobile",
            "Headphones",
            "Keyboard",
            "Mouse"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String target = sc.nextLine();

        int index = searchProduct(products, target);

        if (index != -1) {
            System.out.println("Product found at index: " + index);
        } else {
            System.out.println("Product not found");
        }

        sc.close();
    }
}