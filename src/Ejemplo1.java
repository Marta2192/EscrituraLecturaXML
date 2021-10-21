import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Ejemplo1 {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factoria.newDocumentBuilder();
		Document documento = db.newDocument();
		
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource domSource = new DOMSource(documento);
		StreamResult sr = new StreamResult();
		transformer.transform(domSource, sr);
		

	}

}
