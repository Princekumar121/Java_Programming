import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element at index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchElement) {
                    System.out.println("Element found at index [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
        System.out.println("Array elements:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

