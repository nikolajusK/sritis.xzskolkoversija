import java.util.ArrayList;
import java.util.List;

public class Rating {


        protected int vieta;
        protected String Name;
        protected String Releaser;
        protected String Data;
        protected int rate;
        protected String Genre;
        protected String GameName;

        private List<Zaidimas> Zaidimai = new ArrayList<Zaidimas>();

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public List<Zaidimas> getZaidimai() {
        return Zaidimai;
    }

    public void setZaidimai(List<Zaidimas> zaidimai) {
        Zaidimai = zaidimai;
    }

    public void setVieta(int vieta) {
        this.vieta = vieta;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setReleaser(String releaser) {
        Releaser = releaser;
    }

    public void setData(String data) {
        Data = data;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getVieta() {
        return vieta;
    }

    public String getName() {
        return Name;
    }

    public String getReleaser() {
        return Releaser;
    }

    public String getData() {
        return Data;
    }

    public int getRate() {
        return rate;
    }

    public String getGenre() {
        return Genre;
    }

    /**
     *
     * @return Isveda zaidimo ivertinimo duomenys: Vieta, pavadinimas, leideja, isleidimo data, iverti ir zanra
     */

    public String toString() {
        return
                String.format("Vieta: \n\t %s \n Pavadinimas: \n\t %s \n Leidejas: \n\t %s \n Isleidimo Data: \n\t %s \n Ivertis: \n\t %d \n Zanras: \n\t %s ",
                        this.vieta,this.Name, this.Releaser, this.Data, this.rate, this.Genre);

    }

    /**
     * Konstruktorius sukuria ivertinima(rating) zaidimui ir jo parametrus
     * @param Vieta Zaidimo vieta
     * @param Name Zaidimo pavadinimas
     * @param release Zaidejo leidejas
     * @param Data Zaidimo ivertinimo sukurimo data
     * @param ivertis Zaidimo ivertis
     * @param zanras Zaidimo zanras
     */
    public Rating(int Vieta, String Name, String release, String Data, int ivertis, String zanras) {
        this.vieta = Vieta;
        this.Name = Name;
        this.Releaser = release;
        this.Data = Data;
        this.rate = ivertis;
        this.Genre = zanras;
    }


    }