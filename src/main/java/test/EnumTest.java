package test;

import java.util.HashMap;
import java.util.Map;

/**
 * 关于enum的测试
 * 
 * @author XB
 *
 */
public class EnumTest {
	public static void main(String[] args){
//		System.out.println(Color.getName(1));
////		System.out.println(new Color("蓝色", 0).getName());
//		System.out.println(Color.RED.toString());
//		System.out.println(Color.RED);
		
//		System.out.println(AnotherColor.RED);
//		
//		System.out.println(AgainColor.RED);
//		
//		System.out.println("*****************");
//		AgainColor[] c = AgainColor.values();
//		for(AgainColor color: c)
//			System.out.println(color);
//		System.out.println(c[0].toString());
//		System.out.println((c[0]));
//		System.out.println("*****************");

//		AgainColor[] Ac = AgainColor.RED.values();
//		for(AgainColor color: Ac)
//			System.out.println(color);
//		System.out.println(AgainColor.RED.values());
//		System.out.println(AgainColor.RED.values());
//		System.out.println(AgainColor.RED.values());
//		System.out.println(AgainColor.RED.values());
		testEnumInMap();
	}
	
	static void testEnumInMap(){
		Map<Integer, String> map = new HashMap();
		map.put(1, AgainColor.RED.name());
		System.out.println(AgainColor.RED.toString());
	}
}
