import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class testai {

    public Gamer sukurtiZaideja()

    {
        Gamer zaidejas = new Gamer("Nikolajus", "Kulesovas", "CS:GO", "FPS", 20);

        return zaidejas;
    }

    @Test
    void MarshalizingTest() throws JAXBException, IOException {
        Gamer zaidejas = sukurtiZaideja();
        Marshalizer marshal = new Marshalizer();
        marshal.Marshalizing(zaidejas, "C:\\Users\\s040267\\IdeaProjects\\sritis\\src\\test\\java\\test.xml");
        String newXMLToString = Files.readString(Path.of("C:\\Users\\s040267\\IdeaProjects\\sritis\\src\\test\\java\\test.xml")).replaceAll("\n", "").replaceAll("\r", "");
        String goodXmlToString = Files.readString(Path.of("C:\\Users\\s040267\\IdeaProjects\\sritis\\src\\test\\java\\testResult.xml")).replaceAll("\n", "").replaceAll("\r", "");
        Assertions.assertEquals(newXMLToString, goodXmlToString);
    }


}
