package url;

/**
 * Description：
 * 直接调用本地浏览器打开网页
 * @author 网友
 *
 */

public class openBrowser {
	
	public static void main(String[] args){
		String url = "http://blog.csdn.net/sunyujia/";
	    String[] driver = new String[] { "C", "D", "E", "F", "G", "H", "I",
	            "J", "K", "L", "M", "X", "Y", "Z" };
	    for (int i = 0; i < driver.length; i++) {
	        try {
	            Runtime
	                    .getRuntime()
	                    .exec(
	                            driver[i]
	                                    + ":\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe "
	                                    + url);
	            System.exit(0);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
}
