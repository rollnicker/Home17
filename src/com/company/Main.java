
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Для прекращения записи введите: 'stop'");
            FileWriter fw = new FileWriter("TestFileWriter");
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ваш текст: ");
            String str;
            while (true) {
                str = scan.nextLine();
                if (str.equals("Stop")) {
                    break;
                } else {
                    fw.write(str + "\n");
                }
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}