import java.util.Scanner;
import java.util.Vector;
class VectorRemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> vector = new Vector<>();

        //vector.add("Banana");
        vector.add("Orange");
        vector.add("Mango");
        vector.add("Orange");
        vector.add("Cherry");
        vector.add("Leo");
        System.out.println("Original Vector: " + vector);
        System.out.print("Enter the element to remove: ");
        String elementToRemove = scanner.nextLine();
        boolean removed = vector.remove(elementToRemove);
        if (removed) {
            System.out.println("Updated Vector after removing '" + elementToRemove + "': " + vector);
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the Vector.");
        }
        scanner.close();
    }
}


public class as {

}

