import java.util.Scanner;

public class FindElementMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Height;
        int Width;
        int max = 0;
        int totalColum = 0;
        int colum;
        System.out.println("Enter height :");
        Height = sc.nextInt();
        System.out.println("Enter width :");
        Width = sc.nextInt();
        int[][] array = new int[Height][Width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element int row :" + (i + 1));
                array[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Element max int array :"+max);
    }
}

