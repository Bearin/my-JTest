package downLoad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: ���ļ��л�ȡ��Ҫ���ı�����
 * 
 * @author XB
 * 
 */
public class filter {
	
	
	public void change() throws IOException{
		RandomAccessFile raf = new RandomAccessFile(new File(
				"D:\\Test\\java\\webSource.txt"), "rw");
		for(int i=0;i<raf.length();i++){
				raf.seek(i);
				byte b=raf.readByte();
				if(b=='\\'){
					raf.seek(i);
					raf.writeByte('\0');
				}
			}
		raf.close();
		System.out.println("ȥ��\\�ɹ�");
	}
	
	
	public String getSourceCode() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File(
				"D:\\Test\\java\\webSource.txt"), "r");
		byte[] b = new byte[(int) raf.length()];
		for (int i = 0; i < raf.length(); i++) {
			b[i]=raf.readByte();
		}
		String str = new String(b);
		raf.close();
		System.out.println("���¶�ȡ�ɹ�");
		//System.out.println(str);
		return str;

	}

	public void findURI() throws IOException {
		System.out.println("��ʼ������Ҫ��http����");
		List<String> URIS = new ArrayList<String>();
		Pattern pattern = Pattern.compile("http:.*.mp3");
		Matcher matcher = pattern.matcher(getSourceCode());
		while (matcher.find()) {
			//System.out.println(matcher.start());
			//System.out.println(matcher.end());
			URIS.add(matcher.group());
		}
		for(String s:URIS)
			System.out.println(s);
	}

	public static void main(String[] args) {
		filter fff=new filter();
		try {
			fff.change();
			fff.findURI();
			//fff.getSourceCode();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
