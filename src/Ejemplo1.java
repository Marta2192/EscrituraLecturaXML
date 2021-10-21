import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Ejemplo1 {

	private static Document documento;

	public static void main(String[] args) /*throws ParserConfigurationException, TransformerException*/ {

		
		try {
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = factoria.newDocumentBuilder();
			documento = documentBuilder.newDocument();
			
			
			TransformerFactory transformFactory = TransformerFactory.newInstance();
			Transformer transformer = transformFactory.newTransformer();
			DOMSource dom = new DOMSource(documento);
			StreamResult sr = new StreamResult(new File(""));
			transformer.transform(dom, sr);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}





















//		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
//		DocumentBuilder db = factoria.newDocumentBuilder();
//		Document documento = db.newDocument();
//		
//		
//		TransformerFactory tf = TransformerFactory.newInstance();
//		Transformer transformer = tf.newTransformer();
//		DOMSource domSource = new DOMSource(documento);
//		StreamResult sr = new StreamResult(new File(""));
//		transformer.transform(domSource, sr);