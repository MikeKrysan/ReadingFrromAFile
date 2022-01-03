import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromAFile_3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file3 = new File("test4");
        Scanner scanner3 = new Scanner(file3);
        String line3 = scanner3.nextLine();
        String[] numberString3 = line3.split(" ");
        int[] numbers3 = new int[3];
        int counter3 = 0;
        for(String number : numberString3) {
            numbers3[counter3++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers3));
        scanner3.close();
    }
}
