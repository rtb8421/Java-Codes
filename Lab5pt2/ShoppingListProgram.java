package Lab5pt2;
import java.util.Scanner;
import java.util.Vector;

    public class ShoppingListProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Vector<String> shoppingList = new Vector<>();

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add an item at a specific location");
                System.out.println("2. Delete an item at a specific location");
                System.out.println("3. Print the content of the vector");
                System.out.println("4. Delete all elements");
                System.out.println("5. Add an item at the end of the vector");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the item to add: ");
                        String newItem = scanner.next();
                        System.out.print("Enter the index to add at: ");
                        int addIndex = scanner.nextInt();
                        shoppingList.add(addIndex, newItem);
                        System.out.println("Item added.");
                        break;

                    case 2:
                        System.out.print("Enter the index to delete: ");
                        int deleteIndex = scanner.nextInt();
                        if (deleteIndex >= 0 && deleteIndex < shoppingList.size()) {
                            shoppingList.remove(deleteIndex);
                            System.out.println("Item deleted.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                        break;

                    case 3:
                        System.out.println("Shopping List:");
                        for (String item : shoppingList) {
                            System.out.println(item);
                        }
                        break;

                    case 4:
                        shoppingList.clear();
                        System.out.println("All items deleted.");
                        break;

                    case 5:
                        System.out.print("Enter the item to add at the end: ");
                        String endItem = scanner.next();
                        shoppingList.add(endItem);
                        System.out.println("Item added at the end.");
                        break;

                    case 6:
                        System.out.println("Exiting program.");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }
    }
