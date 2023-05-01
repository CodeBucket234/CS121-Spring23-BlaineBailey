//Importing required modules
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
//**********************************************************************************************************************
// Activity 38: XML Activity
// Name: Blaine Bailey
// Date of Submission: 4/30/2023
//**********************************************************************************************************************
// This is the StudentXML class. This program creates a File object for student_record.xml, and parses it through the
// DocumentBuilder object to create a readable Document object. Then the program prints out the root element, and uses a
// for loop to print out all of the data for each student and their ID attribute.
//**********************************************************************************************************************
public class StudentXML {
    public static void main(String[] args) {
        try {
            //Create File object to parse student_record.xml file through to readable Document object
            File input = new File("C:\\Users\\craft\\OneDrive\\Desktop\\CS121\\CS121-Spring23-BlaineBailey\\XMLActivity\\src\\student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = factory.newDocumentBuilder();
            Document doc = build.parse(input);

            //Print out root element
            System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());

            //Use for loop to print out all the data for each student
            NodeList studentRecord = doc.getElementsByTagName("student");
            for(int i = 0; i < studentRecord.getLength(); i++) {
                Node node = studentRecord.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element)node;
                    //Print out ID attribute
                    System.out.println("ID: " + element.getAttribute("id"));

                    //Print out first name
                    System.out.println("First Name: " + element.getElementsByTagName("firstname").item(0).getTextContent());

                    //Print out last name
                    System.out.println("Last Name: " + element.getElementsByTagName("lastname").item(0).getTextContent());

                    //Print out major
                    System.out.println("Major: " + element.getElementsByTagName("major").item(0).getTextContent());

                    //Print out major
                    System.out.println("GPA: " + element.getElementsByTagName("gpa").item(0).getTextContent());

                    //Empty line for formatting purposes
                    System.out.println();
                }
            }
        }
        //If any exception occurs, print stack trace to see where issue is
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}