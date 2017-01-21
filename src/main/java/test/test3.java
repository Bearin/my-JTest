package test;
/**
 * ��ʼ����ά����
 * @author XB
 *
 */
public class test3 {
	static int[][] m;

	public static void main(String[] args) {
		new test3().initM(10);
	}

	public void initM(int v) {
		m=new int[v][v];
		for (int i = 0; i < v; i++)
			for (int j = i; j < v; j++)
				m[i][j] = 0;
		for(int[] i:m){
			System.out.println();
			for(int j:i)
				System.out.print(j+" ");
		}
	}
}
