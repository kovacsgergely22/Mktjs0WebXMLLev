package dommktjs0;

import java.io.File;
import java.io.PrintStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomReadMktjs0 {

	public static void main(String[] args) {
		      try {
		         File xmlFile = new File("KovacsGergely_orarend.xml");
		         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		         Document doc = dBuilder.parse(xmlFile);
		         doc.getDocumentElement().normalize();
		         System.out.println("Gy\u00f6k\u00e9relem: " + doc.getDocumentElement().getNodeName());
		         NodeList oraList = doc.getElementsByTagName("ora");

		         for(int i = 0; i < oraList.getLength(); ++i) {
		            Node oraNode = oraList.item(i);
		            if (oraNode.getNodeType() == 1) {
		               Element oraElement = (Element)oraNode;
		               System.out.println("------------");
		               String id = oraElement.getAttribute("id");
		               String tipus = oraElement.getAttribute("tipus");
		               System.out.println("\u00d3ra ID: " + id);
		               System.out.println("T\u00edpus: " + tipus);
		               PrintStream var10000 = System.out;
		               NodeList var10001 = oraElement.getElementsByTagName("kurzusnev");
		               var10000.println("Kurzusn\u00e9v: " + var10001.item(0).getTextContent());
		               Element idopontElement = (Element)oraElement.getElementsByTagName("idopont").item(0);
		               var10000 = System.out;
		               var10001 = idopontElement.getElementsByTagName("nap");
		               var10000.println("D\u00e1tum: " + var10001.item(0).getTextContent());
		               var10000 = System.out;
		               var10001 = idopontElement.getElementsByTagName("tol");
		               var10000.println("Id\u0151 kezdete: " + var10001.item(0).getTextContent());
		               var10000 = System.out;
		               var10001 = idopontElement.getElementsByTagName("ig");
		               var10000.println("Id\u0151 v\u00e9ge: " + var10001.item(0).getTextContent());
		               var10000 = System.out;
		               var10001 = oraElement.getElementsByTagName("helyszin");
		               var10000.println("Helysz\u00edn: " + var10001.item(0).getTextContent());
		               var10000 = System.out;
		               var10001 = oraElement.getElementsByTagName("oktato");
		               var10000.println("Oktat\u00f3: " + var10001.item(0).getTextContent());
		               var10000 = System.out;
		               var10001 = oraElement.getElementsByTagName("szak");
		               var10000.println("Szak: " + var10001.item(0).getTextContent());
		               System.out.println("------------");
		            }
		         }
		      } catch (Exception var12) {
		         var12.printStackTrace();
		      }

		   }


}
