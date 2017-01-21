package test;

public class test5 {
	public static void main(String[] args){
		String str="222,111,4444,";
		String[] StrArray = str.split(",");
		for(String a:StrArray){
			System.out.println(a);
		}
		int[] id = new int[StrArray.length];
		int i=0;
		for(String xxx:StrArray){
			id[i] = Integer.parseInt(xxx);
			System.out.println(id[i]);
			i++;
		}
	}
}	
