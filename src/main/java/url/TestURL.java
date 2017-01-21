package url;

import java.io.*; 
import java.net.HttpURLConnection;
import java.net.URL; 
import java.net.URLConnection; 

/**
 * Description：
 * url类的基本使用方法
 * @author 网友
 *
 */
public class TestURL { 
        public static void main(String[] args) throws IOException { 
              //  test4("http://lavasoft.blog.51cto.com/attachment/200811/200811271227767778082.jpg"); 
               // test4("http://luoo.800edu.net/low/luoo/radio590/01.mp3");
               test3(""); 
               // test2(""); 
               // test(""); 
        } 

        /** 
         * 获取URL指定的资源。 
         * 
         * url.getContent():
         * getContent()方法获取由
         *URL 指向的数据，尝试将其转换化某种对象。如果URL 指向某种文本对象，如ASCII
         *或HTML文件，返回的对象通常会是某种InputStream。如果URL指向一个图片如GIF
         *或JPEG文件，getContent()通常返回一个java.awt.ImageProducer（更确切地讲，
         *是实现ImageProducer 接口的类的实例）getContent()通过查看从服务器所获取数据的MIME 首部中的Content-type 字
         *段进行操作。如果服务器没有使用MIME 首部，或发送了一个不熟悉的Contenttype，
         *getContent()会返回某种InputStream，通过它可以读取数据。如果无法
         *获取该对象，就会抛出一个IOException 异常。
         * @throws IOException 
         */ 
        public static void test4(String u) throws IOException { 
                //URL url = new URL("http://lavasoft.blog.51cto.com/attachment/200811/200811271227767778082.jpg"); 
        		URL url=new URL(u);
                //获得此 URL 的内容。 
                Object obj = url.getContent(); 
                System.out.println(obj.getClass().getName()); 
        } 

        /** 
         * 获取URL指定的资源 
         * 
         * @throws IOException 
         */ 
        public static void test3(String u) throws IOException { 
              URL url = new URL("http://hrtsea.com/?p=143"); 
        		//URL url=new URL(u);
                //返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。 
                URLConnection uc = url.openConnection(); 
                //打开的连接读取的输入流。 
                InputStream in = uc.getInputStream(); 
                int c; 
                while ((c = in.read()) != -1) 
                        System.out.print(c); 
                in.close(); 
        } 

        /** 
         * 读取URL指定的网页内容 
         * 
         * @throws IOException 
         */ 
        public static void test2(String u) throws IOException { 
             //   URL url = new URL("http://www.hrtsea.com/down/soft/45.htm"); 
                URL url=new URL(u);
                //打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。 
                Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream())); 
                int c; 
                while ((c = reader.read()) != -1) { 
                        System.out.print((char) c); 
                } 
                reader.close(); 
        } 

        /** 
         * 获取URL的输入流，并输出 
         * 
         * @throws IOException 
         */ 
        public static void test(String u) throws IOException { 
                //URL url = new URL("http://lavasoft.blog.51cto.com/62575/120430"); 
                URL url=new URL(u);
                //打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。 
                InputStream in = url.openStream(); 
                int c; 
                while ((c = in.read()) != -1) 
                        System.out.print(c); 
                in.close(); 
        } 
}

