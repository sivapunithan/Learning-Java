import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1{
    public static void main(String[] args) throws IOException{
        
        InputStream input = new FileInputStream("hello.text");
        int data = input.read();
        // System.out.println(data);
        // input.close();

        while ((data = input.read()) != -1) {
            System.out.println((char)data);
        }
    }
}