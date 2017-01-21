/*
 * FileName: Test.java
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
 * date     : 2014年10月9日 上午12:25:22
 * last modify author :
 * version : 1.0
 */
/**
 * <p>Title: Test.java
 * <p>Description: 
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月9日
 * @version 1.0
 */
package HtmlParse;

/**
 * <p>Title: Test.java
 * <p>Description: 
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月9日
 * @version 1.0
 */
public class Test {

//    /**
//     * <p>Title: main
//     * <p>Description: 
//     * @param args
//     */
//    public static void main(String[] args) {
//        String htmlcode = "<HTML><HEAD><TITLE>AAA</TITLE></HEAD><BODY>" +  "</BODY></HTML>";
//        Parser parser = Parser.CreateParser(htmlcode, "GBK");
//        HtmlPage page = new HtmlPage(parser);
//        try
//        { parser.VisitAllNodesWith(page);}
//        catch (Exception e1)
//        { e1 = null;}
//        NodeList nodelist = page.Body;
//        NodeFilter filter = new TagNameFilter("A");
//        nodelist = nodelist.ExtractAllNodesThatMatch(filter, true);
//        for (int i = 0; i < nodelist.Size(); i++)
//        {
//        LinkTag link=(LinkTag) nodelist.ElementAt(i);
//        System.Console.Write(link.GetAttribute("href") + "\n");
//        }
//
//    }
    
    public static void main(String[] args){
        String str = "xxx";
        str.substring(0,20);
    }
}
