package downLoad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

/**
 * Description： 获取网页源代码
 * 
 * @author 网友
 * 
 */
public class webPageSource {

	public static String getPageSource1(String pageUrl, String encoding) {
		StringBuffer sb = new StringBuffer();
		try {
			// 构建一URL对象
			URL url = new URL(pageUrl);
			// 使用openStream得到一输入流并由此构造一个BufferedReader对象
			// openStream=openConnection().getInputStream()
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream(), encoding));
			String line;
			// 读取www资源
			while ((line = in.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			in.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return sb.toString();
	}

	/**
	 * 为了避免出现乱码问题，可以采用字节读入
	 * 
	 * @throws IOException
	 */
	public static void getPageSourceCode2() throws IOException {
		URL theURL = new URL("http://blog.csdn.net/sunyujia/");
		URLConnection urlConnection = theURL.openConnection();
		urlConnection.connect();
		InputStream in = urlConnection.getInputStream();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int bufferSize = 1024 * 1024;
		byte[] buffer = new byte[bufferSize];// 缓冲区
		for (int bytesRead = 0; (bytesRead = in.read(buffer)) != -1;) {
			bos.write(buffer, 0, bytesRead);
			Arrays.fill(buffer, (byte) 0);
		}
		System.out.println(new String(bos.toByteArray(), "UTF-8"));
		in.close();
	}

	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(new FileWriter(new File(
				"D:\\Test\\java\\sina.txt")));
		// out.write(getPageSource1("http://www.luoo.net/music/590","utf-8"));
		out.write(getPageSource1("http://www.sina.com.cn/", "gb2312"));
		out.flush();
		out.close();
	}
}
