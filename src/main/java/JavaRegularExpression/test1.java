package JavaRegularExpression;
import java.io.*;
/**
 * 从文件读取readLine(),然后利用简单的正则表达式按空格分割
 * @author XB
 *
 */


public class test1 {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
				new FileReader(new File("D:\\eclipse\\workSpace\\JTest\\src\\Pro2\\infor.txt")));
		String line=in.readLine();
		if(line!=null){
			System.out.println(line);
		}
		
		String[] infor=line.split("\\s");
		for(String s:infor)
			System.out.println(Integer.parseInt(s));
		
		/*
		char[] kkk=line.toCharArray();
		for(char i:kkk){
			System.out.println(i);
		}
		*/
		in.close();
	}
}
