package XML;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 
 * @author XB
 *
 */
public class XMLTools {
	
//	public static String parseByJDOM(String xmlStr){
//		SAXBuilder builder = new SAXBuilder();
//		StringReader strReader = new StringReader(xmlStr);
//		
//		try {
//			Document doc = builder.build(new InputSource(strReader));
//			Element rootEl = doc.getRootElement();
//			List<Element> elChildren = rootEl.getChildren();
//			for(Element el : elChildren){
//				System.out.println(el.getName());
//				System.out.println(el.getText());
//			}
//		} catch (JDOMException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "";
//	}
	
	public static String parseByDOM4J(String xmlStr){
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(xmlStr);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element rootEl = doc.getRootElement();
		Iterator iter = rootEl.elementIterator("response");
		while(iter.hasNext()){
			Element el = (Element) iter.next();
			System.out.println(el.getName());
		}
		return "";
	}
	
	public static void main(String[] args){
//		parseByDOM4J();
	}
}
