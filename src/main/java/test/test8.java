package test;
import java.sql.Timestamp;
import java.util.Random;

/**
 * Timestamp
 * 时间戳
 * @author XB
 *
 */
public class test8 {
	public static void main(String[] args){
		Timestamp ts = new Timestamp(System.currentTimeMillis());  
        String tsStr = "2011-05-09 11:49:45";  
        try {  
            ts = Timestamp.valueOf(tsStr);  
            System.out.println(ts);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        System.out.println(System.currentTimeMillis());

    	Random random = new Random(System.currentTimeMillis());
		
		 System.out.println( random.nextInt(10));
	}
}
