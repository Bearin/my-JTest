package downLoad;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Description:
 *<br/>ʹ��������ʽ�����ı����ҳ���Ҫ����Ϣ 
 *@author XB
 *
 */

public class test {
	public static void main(String args[]) throws IOException{
		//test1();
		find();
	}
	
	public static void find() throws IOException{
		BufferedReader reader=new BufferedReader(new FileReader(new File("D:\\Test\\java\\webSource.txt")));
		String line;
		while((line=reader.readLine())!=null){
			 if(line.contains(".mp3")){
				 System.out.println(true);
				 break;
			 }
		}
		
	}
	
	public static void test2(){
		Pattern pattern = Pattern.compile(".mp3$");
		Matcher matcher = pattern.matcher("http://luoo.800edu.net/low/luoo/radio590/01.mp3");
		StringBuffer buffer = new StringBuffer();
		while(matcher.find()){              
		    buffer.append(matcher.group());        
		    buffer.append("\r\n");              
		System.out.println(buffer.toString());
		}
	}
	
	public static void test1(){
		String c="http:/luoo.800edu.net/low/luoo/radio590/01.mp3";
		System.out.println(c.contains(".mp3"));
	}
}
