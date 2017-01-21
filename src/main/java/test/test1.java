package test;
public class test1 {
	
	//������
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		swap(x, y);
		System.out.println(x + "  " + y);
		//System.out.println("222" + "\t" + "xxx");
	}
}
