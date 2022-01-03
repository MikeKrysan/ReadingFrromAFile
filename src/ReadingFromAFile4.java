import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromAFile4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file4 = new File("test5");
        Scanner scanner4 = new Scanner(file4);
        String line4 = scanner4.nextLine();
        String[] numberString = line4.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numberString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner4.close();
    }
}
