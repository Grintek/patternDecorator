package a.lower;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        double sum = 10;
        double b = 50;
        double percent = b / 100 * sum;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("D:\\Programirovanye\\patternDecorator\\src\\a\\lower\\test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            System.out.println();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(percent);
    }
}
