import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromAFile_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("test3");
        Scanner scanner1 = new Scanner(file1);
        String line1 = scanner1.nextLine();
        String[] numberString1 = line1.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numberString1) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner1.close();
    }
}
