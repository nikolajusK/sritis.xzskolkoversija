import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Unmarshalize {

    public Unmarshalize()
    {

    }

    /**
     * Perkelia duomenys is XML i konsole
     * @param file XML failo pavadinimas
     * @throws JAXBException Ismeta klaida
     */
    public void Unmarshalizing(File file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Gamer.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Gamer gamer = (Gamer)jaxbUnmarshaller.unmarshal(file);
        System.out.println(gamer);
    }
}
