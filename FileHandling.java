import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        /**
         * Reading a file
         * File myFile = new File("test.txt");
         * Scanner scanner = new Scanner(myFile);
         */

        File myFile = new File("test.txt");
        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] word = new String[10000];
                word = line.split("\\t");
                for (int i = 0; i < 10; i++) {
                    System.out.println(word[i]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Wrrite a file
         * FileWriter fileWriter = new FileWriter("test.txt");
         * fileWriter.write("");
         */

        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("File .txt nằm ngoài thư mục src!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
