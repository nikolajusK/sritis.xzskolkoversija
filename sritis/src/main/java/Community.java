import java.util.ArrayList;
import java.util.List;

public class Community {
    protected String Name;
    protected String CreationDate;
    protected String FavGame;
    protected String FavGenre;
    protected String MostActivePlayer;
    protected int PeopleNumber;

    /**
     * Sukuria bendroves objekta bei priskiria reiksmes
     * @param name Bendroves vardas
     * @param creationDate Bnedroves sukurimo data
     * @param favGame Bendroves megstamiausias zaidimas
     * @param favGenre Bendroves megstamiausias zanras
     * @param mostActivePlayer Bendroves aktiviausias zaidejas
     * @param peopleNumber Bendroves zaideju skaicius
     */
    public Community(String name, String creationDate, String favGame, String favGenre, String mostActivePlayer, int peopleNumber) {
        Name = name;
        CreationDate = creationDate;
        FavGame = favGame;
        FavGenre = favGenre;
        MostActivePlayer = mostActivePlayer;
        PeopleNumber = peopleNumber;
    }

   private List<Gamer> Zaidejai = new ArrayList<Gamer>();

    public List<Gamer> getZaidejai() {
        return Zaidejai;
    }

    public void setZaidejai(List<Gamer> zaidejai) {
        Zaidejai = zaidejai;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public String getFavGame() {
        return FavGame;
    }

    public void setFavGame(String favGame) {
        FavGame = favGame;
    }

    public String getFavGenre() {
        return FavGenre;
    }

    public void setFavGenre(String favGenre) {
        FavGenre = favGenre;
    }

    public String getMostActivePlayer() {
        return MostActivePlayer;
    }

    public void setMostActivePlayer(String mostActivePlayer) {
        MostActivePlayer = mostActivePlayer;
    }

    public int getPeopleNumber() {
        return PeopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        PeopleNumber = peopleNumber;
    }

    /**
     *
     * @return isveda visus parametrus: Bendroves pavadinimas, bendroves ikurimo data, bendroves megstamias zaidimas, bendroves megstamiausias zanras, bendruomenes aktyviausias zaidejas, bendruomenes zmoniu kiekis
     */
    public String toString() {
        return
                String.format("Pavadinimas: \n\t %s \n Ikurimo data: \n\t %s \n Megstamas zaidimas: \n\t %s \n Megstamas zanras: \n\t %s \n Aktyviausias zaidejas: \n\t %s \n Zmoniu kiekis: \n\t %d ",
                        this.Name,this.CreationDate, this.FavGame, this.FavGenre, this.MostActivePlayer, this.PeopleNumber);

    }
}
