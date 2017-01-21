package url;

import java.io.*; 
import java.net.HttpURLConnection;
import java.net.URL; 
import java.net.URLConnection; 

/**
 * Description��
 * url��Ļ���ʹ�÷���
 * @author ����
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
         * ��ȡURLָ������Դ�� 
         * 
         * url.getContent():
         * getContent()������ȡ��
         *URL ָ������ݣ����Խ���ת����ĳ�ֶ������URL ָ��ĳ���ı�������ASCII
         *��HTML�ļ������صĶ���ͨ������ĳ��InputStream�����URLָ��һ��ͼƬ��GIF
         *��JPEG�ļ���getContent()ͨ������һ��java.awt.ImageProducer����ȷ�еؽ���
         *��ʵ��ImageProducer �ӿڵ����ʵ����getContent()ͨ���鿴�ӷ���������ȡ���ݵ�MIME �ײ��е�Content-type ��
         *�ν��в��������������û��ʹ��MIME �ײ���������һ������Ϥ��Contenttype��
         *getContent()�᷵��ĳ��InputStream��ͨ�������Զ�ȡ���ݡ�����޷�
         *��ȡ�ö��󣬾ͻ��׳�һ��IOException �쳣��
         * @throws IOException 
         */ 
        public static void test4(String u) throws IOException { 
                //URL url = new URL("http://lavasoft.blog.51cto.com/attachment/200811/200811271227767778082.jpg"); 
        		URL url=new URL(u);
                //��ô� URL �����ݡ� 
                Object obj = url.getContent(); 
                System.out.println(obj.getClass().getName()); 
        } 

        /** 
         * ��ȡURLָ������Դ 
         * 
         * @throws IOException 
         */ 
        public static void test3(String u) throws IOException { 
              URL url = new URL("http://hrtsea.com/?p=143"); 
        		//URL url=new URL(u);
                //����һ�� URLConnection ��������ʾ�� URL �����õ�Զ�̶�������ӡ� 
                URLConnection uc = url.openConnection(); 
                //�򿪵����Ӷ�ȡ���������� 
                InputStream in = uc.getInputStream(); 
                int c; 
                while ((c = in.read()) != -1) 
                        System.out.print(c); 
                in.close(); 
        } 

        /** 
         * ��ȡURLָ������ҳ���� 
         * 
         * @throws IOException 
         */ 
        public static void test2(String u) throws IOException { 
             //   URL url = new URL("http://www.hrtsea.com/down/soft/45.htm"); 
                URL url=new URL(u);
                //�򿪵��� URL �����Ӳ�����һ�����ڴӸ����Ӷ���� InputStream�� 
                Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream())); 
                int c; 
                while ((c = reader.read()) != -1) { 
                        System.out.print((char) c); 
                } 
                reader.close(); 
        } 

        /** 
         * ��ȡURL��������������� 
         * 
         * @throws IOException 
         */ 
        public static void test(String u) throws IOException { 
                //URL url = new URL("http://lavasoft.blog.51cto.com/62575/120430"); 
                URL url=new URL(u);
                //�򿪵��� URL �����Ӳ�����һ�����ڴӸ����Ӷ���� InputStream�� 
                InputStream in = url.openStream(); 
                int c; 
                while ((c = in.read()) != -1) 
                        System.out.print(c); 
                in.close(); 
        } 
}

