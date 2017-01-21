package test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class test7 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException{
//		Date st = new Date();
//		Date et = new Date();
//		st.setYear(2012);
//		st.setMonth(2);
//		et.setYear(2013);
//		et.setMonth(1);
////		System.out.println(st.toString());
//		Calendar c = Calendar.getInstance();
//        c.setTime(new Date());   //设置当前日期
//        c.add(Calendar.DATE, 1); //日期加1
//        Date date = c.getTime(); //结果
//        System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( format.parse("2012-1-0"));
	}
}
