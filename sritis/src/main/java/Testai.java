import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Testai {



   /* @Test
    void MarshalizingTest() throws JAXBException, IOException {
        Gamer zaidejas = new Gamer("Nikolajus", "Kulesovas", "CS:GO", "FPS", 20);
        Marshalizer marshal = new Marshalizer();
        marshal.Marshalizing(zaidejas);
        String newXMLToString = Files.readString(Path.of("test.xml")).replaceAll("\n", "").replaceAll("\r", "");
        String goodXmlToString = Files.readString(Path.of("testResult.xml")).replaceAll("\n", "").replaceAll("\r", "");
        Assertions.assertEquals(newXMLToString, goodXmlToString);
    }*/
    @Test
    void MarshalTest() throws JAXBException, IOException {

        Gamer zaidejas = new Gamer("Nikolajus", "Kulesovas", "CS:GO", "FPS", 20);
        Marshalizer m = new Marshalizer();
        m.Marshalizing(zaidejas, "test");


        String newXmlToString = Files.readString(Path.of("test.xml")).replaceAll("\n", "").replaceAll("\r", "");;
        String goodXmlToString = Files.readString(Path.of("testResult.xml")).replaceAll("\n", "").replaceAll("\r", "");;

        Assertions.assertEquals(newXmlToString, goodXmlToString);
    }

}
