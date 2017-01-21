package downLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Replace {
    public static void main(String args[]) {
        Reader reader = null;
        try {
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(new File("D:\\Test\\java\\1.txt")));
            char tempchar = (char) reader.read();
            while (tempchar == 'x')
                System.out.print((char) tempchar);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
