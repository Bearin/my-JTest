package JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 判断是否为电子邮件格式
 *
 */
public class test2 {
	public static void isEmail(){
		String str="ceponline@yahoo.com.cn";
		Pattern pattern = Pattern.compile("[//w//.//-]+@([//w//-]+//.)+[//w//-]+",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
	}
	
	public static void getAddress(){
		//截取url
		Pattern pattern = Pattern.compile("(http://|https://){1}[//w//.//-/:]+");
		Matcher matcher = pattern.matcher("dsdsds<http://dsds//gfgffdfd>fdf");
		StringBuffer buffer = new StringBuffer();
		while(matcher.find()){              
		    buffer.append(matcher.group());        
		    buffer.append("/r/n");              
		    System.out.println(buffer.toString());
		}
	}
	
	public static void mian(String[] args){
		isEmail();
	}
}
