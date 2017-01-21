package foo;

public class ReturnTest {

	public static void main(String[] args) {
//		breakTest();
//		returnTest();
		continueTest();
	}
	
	static void breakTest(){
		for(int i=0;i<10;i++){
			if(i>1){
				break;
			}
			System.out.println(i);
		}
		System.out.println("break...");
	}
	
	static void returnTest(){
		for(int i=0;i<10;i++){
			if(i>4){
				return;
			}
		}
		System.out.println("return...");
	}

	static void continueTest(){
		for(int i=0;i<10;i++){
			if(i>4){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("continueTest");
	}

}
