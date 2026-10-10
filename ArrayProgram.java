import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {

        int[] array = new int[10];
        int size = 0;

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 11) {

            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();


            // 1. Add value
            if (choice == 1) {

                if (size < array.length) {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    array[size] = value;
                    size++;

                    System.out.println("Value added successfully.");

                } else {
                    System.out.println("Array is full.");
                }
            }


            // 2. Insert at index
            else if (choice == 2) {

                if (size < array.length) {

                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    if (index >= 0 && index <= size) {

                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        // Shift elements to the right
                        for (int i = size; i > index; i--) {
                            array[i] = array[i - 1];
                        }

                        array[index] = value;
                        size++;

                        System.out.println("Value inserted successfully.");

                    } else {
                        System.out.println("Invalid index.");
                    }

                } else {
                    System.out.println("Array is full.");
                }
            }


            // 3. Fill array
            else if (choice == 3) {

                if (size < array.length) {

                    char answer = 'y';

                    while (size < array.length && answer == 'y') {

                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        array[size] = value;
                        size++;

                        if (size < array.length) {
                            System.out.print("Do you want to add another value? (y/n): ");
                            answer = input.next().charAt(0);
                        }
                    }

                    System.out.println("Fill operation completed.");

                } else {
                    System.out.println("Array is full.");
                }
            }


            // 4. Delete last element
            else if (choice == 4) {

                if (size > 0) {

                    size--;
                    array[size] = 0;

                    System.out.println("Last element deleted.");

                } else {
                    System.out.println("Array is empty.");
                }
            }


            // 5. Delete by index
            else if (choice == 5) {

                if (size > 0) {

                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    if (index >= 0 && index < size) {

                        // Shift elements to the left
                        for (int i = index; i < size - 1; i++) {
                            array[i] = array[i + 1];
                        }

                        size--;
                        array[size] = 0;

                        System.out.println("Element deleted successfully.");

                    } else {
                        System.out.println("Invalid index.");
                    }

                } else {
                    System.out.println("Array is empty.");
                }
            }


            // 6. Display
            else if (choice == 6) {

                if (size > 0) {

                    System.out.println("Current elements:");

                    for (int i = 0; i < size; i++) {
                        System.out.println("Index " + i + ": " + array[i]);
                    }

                } else {
                    System.out.println("Array is empty.");
                }
            }


            // 7. Search value
            else if (choice == 7) {

                System.out.print("Enter value to search: ");
                int value = input.nextInt();

                int foundIndex = -1;

                for (int i = 0; i < size; i++) {

                    if (array[i] == value) {
                        foundIndex = i;
                        break;
                    }
                }

                if (foundIndex != -1) {
                    System.out.println("Value found at index: " + foundIndex);
                } else {
                    System.out.println("Value not found.");
                }
            }


            // 8. Get value at index
            else if (choice == 8) {

                System.out.print("Enter index: ");
                int index = input.nextInt();

                if (index >= 0 && index < size) {
                    System.out.println("Value: " + array[index]);
                } else {
                    System.out.println("Invalid index.");
                }
            }


            // 9. Replace / Update
            else if (choice == 9) {

                System.out.print("Enter index: ");
                int index = input.nextInt();

                if (index >= 0 && index < size) {

                    System.out.print("Enter new value: ");
                    int newValue = input.nextInt();

                    array[index] = newValue;

                    System.out.println("Value updated successfully.");

                } else {
                    System.out.println("Invalid index.");
                }
            }


            // 10. Size
            else if (choice == 10) {

                System.out.println("Current number of elements: " + size);
            }


            // 11. Exit
            else if (choice == 11) {

                System.out.println("Program ended.");
            }


            else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}