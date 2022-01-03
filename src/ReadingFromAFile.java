import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "C:"+separator+"Users"+separator+"user"+separator+"IdeaProjects"+separator+"ReadingFromAFile"+separator+"test.txt";
        File file = new File("test2");

        Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;    // переменная указывает на текущий индекс

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number); //метод parseInt() принимает строку и преобразует в число
        }

        System.out.println(Arrays.toString(numbers)); //Используем метод toString(), потому что не можем вывести массив на экран
        scanner.close();
    }
}
