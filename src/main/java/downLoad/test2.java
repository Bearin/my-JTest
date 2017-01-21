package downLoad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File(
				"D:\\Test\\java\\1.txt"), "rw");
			for(int i=0;i<raf.length();i++){
				raf.seek(i);
				char b=(char)raf.read();
				if(b=='\\'){
					raf.seek(i);
					raf.writeByte('\0');
				}
			}
		raf.close();
	}

}
