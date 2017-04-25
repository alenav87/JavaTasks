package Data;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;




    public class TestDataSource{
        public ArrayList<AirplaneDto>  GetAll () {
            ArrayList<AirplaneDto> airplaneDtos = new ArrayList<AirplaneDto>();
            try {

                File inputFile = new File ( "AirplanesDescription.xml" );
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance ( );
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder ( );
                Document doc = dBuilder.parse ( inputFile );
                doc.getDocumentElement().normalize();
                //System.out.println ( "Root element: " + doc.getDocumentElement ( ).getNodeName ( ) );
                NodeList nList = doc.getElementsByTagName ( "model" );

                System.out.println ("  " );

                for (int temp = 0; temp < nList.getLength(); temp ++){
                    Node nNode = nList.item(temp);
                    //System.out.println ("\nCurrent Element: " + nNode.getNodeName () );
                    if (nNode.getNodeType () == Node.ELEMENT_NODE){
                        Element eElement = (Element) nNode;
                        AirplaneDto airplaneDto =  new AirplaneDto();
                        airplaneDto.Description = eElement.getElementsByTagName ("description").item(0).getTextContent();
                        airplaneDto.ModelName = eElement.getElementsByTagName ( "modelname" ).item(0).getTextContent();
                        airplaneDtos.add(airplaneDto);
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return airplaneDtos;
        }

    }

