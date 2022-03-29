import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlType(propOrder = {"name", "surname", "favGame","favGenre", "age", "zaidimai" })
@XmlRootElement(name = "Gamer")
public class Gamer {

    protected String Name;
    protected String Surname;
    protected String FavGame;
    protected String FavGenre;
    protected int Age;

 List<Zaidimas> Zaidimai = new ArrayList<Zaidimas>();

    public Gamer() {
    }

    /**
     * Konstruktorius sukuria zaideja, iraso jo parametrus
     * @param name Zaidejo vardas
     * @param surname Zaidejo pavarde
     * @param favGame Zaidejo megstamiausias zaidimas
     * @param favGenre Zaidejo megstamiausias zanras
     * @param age Zaidejo amzius
     */
    public Gamer(String name, String surname, String favGame, String favGenre, int age) {
        Name = name;
        Surname = surname;
        FavGame = favGame;
        FavGenre = favGenre;
        Age = age;
    }
      public List<Zaidimas> getZaidimai() {
        return Zaidimai;
    }

    public void setZaidimai(List<Zaidimas> zaidimai) {
        Zaidimai = zaidimai;
    }



    public String getName() {
        return Name;
    }
    @XmlElement(name ="Name")
    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }
    @XmlElement(name ="Surname")
    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFavGame() {
        return FavGame;
    }
    @XmlElement(name ="FavGame")
    public void setFavGame(String favGame) {
        FavGame = favGame;
    }

    public String getFavGenre() {
        return FavGenre;
    }
    @XmlElement(name ="FavGenre")
    public void setFavGenre(String favGenre) {
        FavGenre = favGenre;
    }

    public int getAge() {
        return Age;
    }
    @XmlElement(name ="Age")
    public void setAge(int age) {
        Age = age;
    }


    /**
     *
     * @return Iveda zaidejo parametrus: varda, pavarde, megstama zaidima, megstama zanra, amziu
     */
    public String toString() {
        return
                String.format("Vardas: \n\t %s \n Pavarde: \n\t %s \n Megstamas zaidimas: \n\t %s \n Megstamas zanras: \n\t %s \n Amzius: \n\t %d ",
                        this.Name,this.Surname, this.FavGame, this.FavGenre, this.Age);

    }
}
