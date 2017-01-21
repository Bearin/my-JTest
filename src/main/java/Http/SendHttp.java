/*
 * FileName: SendHttp.java
 * Copyright (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * 
 * Licensed under the Plusub License, Version 1.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * author  : xbearin@gmail.com
 * date     : 2014年10月6日 下午4:32:16
 * last modify author :
 * version : 1.0
 */
/**
 * <p>Title: SendHttp.java
 * <p>Description: 
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月6日
 * @version 1.0
 */
package Http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * <p>Title: SendHttp.java
 * <p>Description: 发送http请求
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月6日
 * @version 1.0
 */
public class SendHttp {

    /**
     * <p>Title: main
     * <p>Description: 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(send("北京市海淀区上地信息路9号奎科科技大厦"));
        String jsonStr = send("北京市海淀区上地信息路9号奎科科技大厦");
//        JSONArray jsonArray = 
        JSONArray jsonArray = JSONObject.parseArray(jsonStr);
    }
    
    static String sendURL = "http://api.map.baidu.com/geocoder?output=json&src=yourCompanyName|yourAppName";
    
    public static String send(String address){
        String sendUrl = sendURL + "&address=" + address;
        String jsonStr = new String();
        try {
            URL url = new URL(sendUrl);
            HttpURLConnection  connection = (HttpURLConnection)url.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));  
            String str;
            while ((str = reader.readLine()) != null) {
                jsonStr += str;
            } 
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonStr;
    }
}
