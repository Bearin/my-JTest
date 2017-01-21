package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpUrlConnectionTest {

	public static void main(String[] args) {
		// testUrlConnection("http://119.6.254.137/serviceforapp.ashx/queryCompany?AuthCode=AuthCode&keywords=四川");
		// testUrlConnection("http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html");
		// testUrlConnection("http://www.baidu.com");
		testHttpClient("http://www.baidu.com");
	}

	/**
	 * send a get request
	 */
	static void testUrlConnection(String urlStr, String params) {
		try {
			URL url = new URL(urlStr);
			URLConnection connection = url.openConnection();

			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1");

			// build connection
			connection.connect();

			// // if post
			// // start
			// connection.setDoOutput(true);
			// connection.setDoInput(true);
			//
			// PrintWriter out = new PrintWriter(connection.getOutputStream());
			// // send request params
			// out.print(params);
			// out.flush();
			// //post end

			// a Map of header fields
			Map<String, List<String>> headMap = connection.getHeaderFields();
			for (String key : headMap.keySet()) {
				System.out.println(key + "---->" + headMap.get(key));
			}

			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			StringBuilder result = new StringBuilder();
			String str;
			while ((str = in.readLine()) != null) {
				result.append(str);
			}
			System.out.println(result.toString());

			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * user org.apache.httpcomponents 4.3.5 
	 * @param urlStr
	 */
	static void testHttpClient(String urlStr) {
		// HttpClient client = new HttpClient(new
		// MultiThreadedHttpConnectionManager());
		CloseableHttpClient httpClientis = HttpClients.createDefault();
		HttpGet get = new HttpGet(urlStr);
		try(CloseableHttpResponse response = httpClientis.execute(get)) {
			System.out.println(response.getStatusLine());
			HttpEntity entity1 = response.getEntity();
			EntityUtils.consume(entity1);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
