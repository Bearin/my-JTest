package DesignMode;

/**
 * 单例模式
 * 
 * @author XB
 *
 */
public class Singleton {
	
	//用静态变量记录唯一实例
	private static Singleton instance;
	
	//私有构造器，只有在该类内部才能调用
	private Singleton(){
		System.out.println("私有化构造器");
	}
	
	//返回该类唯一的实例
	public static Singleton getInstance(){
		if(instance==null)
			instance = new Singleton();
		return instance;
	}
	
}
