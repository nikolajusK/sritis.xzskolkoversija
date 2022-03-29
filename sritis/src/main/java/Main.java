import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.awt.font.GlyphMetrics;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {

        Zaidimas game = new Zaidimas("Left 4 Dead", "Valve", "2008", 10, "Survival Horror" );
        Zaidimas game1 = new Zaidimas("CS:GO", "Valve", "2012", 10, "FPS" );
        System.out.println(game);
        System.out.println(" ");
        System.out.println(game1);




        Rating rate = new Rating(1,"Reitingas", "HLTV", "2022", 10, "Survival Horror" );
        //Rating rate1 = new Rating(150,"CS:GO", "Valve", "2012", 10, "FPS" );
        System.out.println(" ");
        System.out.println("RATING");
        System.out.println(rate);
        System.out.println(" ");
       // System.out.println(rate1);

        game.setRating(rate);



        Releaser Imone = new Releaser("VALVE", "1996", "Belview", "USA", 360, 100);
        Releaser Imone2 = new Releaser("UBISOFT", "1986", "Karantuar", "France", 18045, 150);
        System.out.println(" ");
        System.out.println("RELEASER");
        System.out.println(Imone);
        System.out.println(" ");
        System.out.println(Imone2);
        Imone.getZaidimai().add(game);

        Gamer zaidejas = new Gamer("Nikolajus", "Kulesovas", "CS:GO", "FPS", 20);
        Gamer zaidejas2 = new Gamer("Timur", "Kalabin", "Minecraft", "Survival", 21);
        System.out.println(" ");
        System.out.println("GAMER");
        System.out.println(zaidejas);
        System.out.println(" ");
        System.out.println(zaidejas2);

        Community hub = new Community("Zaidejai", "2022", "CS:GO", "Survival", "Nikolajus", 150);
        Community hub2 = new Community("Laneriai", "2021", "PUBG", "FPS", "Timur", 100);
        System.out.println(" ");
        System.out.println("BENDROVE");
        System.out.println(hub);
        System.out.println(" ");
        System.out.println(hub2);


        hub.getZaidejai().add(zaidejas);

       Marshalizer marshalizer = new Marshalizer();
       marshalizer.Marshalizing(zaidejas, "Zaidejas.xml");

        Unmarshalize unmarshalize = new Unmarshalize();
        unmarshalize.Unmarshalizing(new File("Zaidejas.xml"));





    }












    }





