package downLoad;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Description��
 * ʵ�ִ���վ���ļ�����
 *
 * @author ����
 */
public class downLoad {

    //  ����ļ�����
    public static long getFileSize(String sURL) {
        int nFileLength = -1;
        try {
            URL url = new URL(sURL);
            HttpURLConnection httpConnection = (HttpURLConnection) url
                    .openConnection();
            httpConnection.setRequestProperty("User-Agent", "Internet Explorer");

            int responseCode = httpConnection.getResponseCode();
            if (responseCode >= 400) {
                System.err.println("Error Code : " + responseCode);
                return -2; // -2 represent access is error
            }
            String sHeader;
            for (int i = 1; ; i++) {
                sHeader = httpConnection.getHeaderFieldKey(i);
                if (sHeader != null) {
                    if (sHeader.equals("Content-Length")) {
                        nFileLength = Integer.parseInt(httpConnection
                                .getHeaderField(sHeader));
                        break;
                    }
                } else
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nFileLength);
        return nFileLength;
    }

    public void download(String sURL, String sName) {

        int nStartPos = 0;
        int nRead = 0;
        String sPath = "d:\\test";
        try {
            URL url = new URL(sURL);
            //������
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            //����ļ�����
            long nEndPos = getFileSize(sURL);
            RandomAccessFile oSavedFile = new RandomAccessFile(sPath + "\\" + sName, "rw");
            httpConnection.setRequestProperty("User-Agent", "Internet Explorer");
            String sProperty = "bytes=" + nStartPos + "-";
            //���߷�����book.rar����ļ���nStartPos�ֽڿ�ʼ��
            httpConnection.setRequestProperty("RANGE", sProperty);
            System.out.println(sProperty);
            InputStream input = httpConnection.getInputStream();
            byte[] b = new byte[1024];
            //��ȡ�����ļ�,д��ָ�����ļ���
            while ((nRead = input.read(b, 0, 1024)) > 0
                    && nStartPos < nEndPos) {
                oSavedFile.write(b, 0, nRead);
                nStartPos += nRead;
            }
            httpConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
