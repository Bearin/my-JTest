package Sec;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class Test {

	public static void main(String[] args) {
		// System.out.println(byteToStr(generateKey("ddasdfasdfasd","MD5")));
		// String property = System.getProperty("java.library.path");
		// StringTokenizer parser = new StringTokenizer(property, ";");
		// while (parser.hasMoreTokens()) {
		// System.err.println(parser.nextToken());
		// }
		// String content = "coopIdA005qa32809d39f8189b542drd3nj9y7b3d8";
		String content = "cardId30508cardNum1coopIdA005customer15680432943gameId10010section1701section2702sum20tbOrderNo1tbOrderSnap测试qa32809d39f8189b542drd3nj9y7b3d8";
		try {
			byte[] bytes = content.getBytes("UTF-8");
			content = new String(bytes, "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(byteToStr(generateKey(content, "MD5")));
		try {
			System.out.println(StringUtils.toString(DigestUtils.md5(content),
					null));

			// System.out.println(StringUtils.toEncodedString(DigestUtils.md5(content),
			// CharSet.getInstance("GBK")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testsets();
	}

	static void testsets() {
		String url = "www.baidu.com=";
		for (String u : url.split("=")) {
			System.out.println(u);
		}
		// System.out.println(url.indexOf("?"));
	}

	static void generateEntry() {

	}

//	public static String sendGet(String url) {
//		String res = null;
//		HttpClient client = new HttpClient(new MultiThreadedHttpConnectionManager());
//		client.getParams().setIntParameter("http.socket.timeout", 10000);
//		client.getParams().setIntParameter("http.connection.timeout", 5000);
//		HttpMethod httpmethod = null;
//		try {
//			// String sendUrl = url + "&keywords=" + URLEncoder.encode(keyStr,
//			// "utf-8");
//
//			httpmethod = new GetMethod(url);
//			int statusCode = client.executeMethod(httpmethod);
//			if (statusCode == HttpStatus.SC_OK) {
//				res = httpmethod.getResponseBodyAsString();
//
//			}
//		} catch (HttpException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			httpmethod.releaseConnection();
//		}
//		return res;
//	}

	public static boolean addParameter(StringBuffer url, String parameterName,
			String value, String enc) {
		try {
			if (url.indexOf("?") < 0) {
				url = url.append("?").append(parameterName).append("=")
						.append(URLEncoder.encode(value, enc));
			} else {
				url = url.append("&").append(parameterName).append("=")
						.append(URLEncoder.encode(value, enc));
			}
			return true;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * generate hash code
	 * 
	 * @param content
	 * @param type
	 *            MD5
	 */
	static byte[] generateKey(String content, String type) {
		try {
			MessageDigest m = MessageDigest.getInstance(type);
			m.update(content.getBytes());
			return m.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	static String byteToStr(byte[] e) {
		StringBuilder str = new StringBuilder();
		String temp = "";
		for (int i = 0; i < e.length; i++) {
			temp = Integer.toHexString(e[i] & 0XFF);
			if (temp.length() == 1) {
				str.append("0" + temp);
			} else {
				str.append(temp);
			}
		}
		return str.toString();
	}
}
