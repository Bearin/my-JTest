package test;

public class test10 {
	
	private Object instance = null;
	
	private static final int _1Mb = 1024*1024;
	
	private byte[] bigSize =new byte[2*_1Mb];
	
	public static void testGC(){
		test10 a = new test10();
		test10 b =new test10();
		a.instance = b;
		b.instance = a;
		
		a = null;
		b = null;
		
		System.gc();
	}
	
	public static void main(String[] args){
		testGC();
	}
}
