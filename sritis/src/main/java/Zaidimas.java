import java.util.ArrayList;
import java.util.List;

public class Zaidimas {
    protected String Name;
    protected String Releaser;
    protected String Data;
    protected int rate;
    protected String Genre;

    private Rating rating;
    List<Releaser> Leidejas = new ArrayList<Releaser>();

    public List<Releaser> getLeidejas() {
        return Leidejas;
    }

    public void setLeidejas(List<Releaser> leidejas) {
        Leidejas = leidejas;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
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
     * @return Isveda zaidimo duomenys: pavadinima, leideja, isleidimo data, iverti, zanra
     */
           public String toString() {
            return
                    String.format("Pavadinimas: \n\t %s \n Leidejas: \n\t %s \n Isleidimo Data: \n\t %s \n Ivertis: \n\t %d \n Zanras: \n\t %s ",
                            this.Name, this.Releaser, this.Data, this.rate, this.Genre);

        }

    /**
     * Konstruktorius sukuria zaidima ir jo parametrus
     * @param Name Zaidimo vardas
     * @param release Zaidimo leidejas
     * @param Data Zaidimo sukurimo data
     * @param ivertis Zaidimo ivertis
     * @param zanras Zaidimo zanras
     */
    public Zaidimas(String Name, String release, String Data, int ivertis, String zanras) {

            this.Name = Name;
            this.Releaser = release;
            this.Data = Data;
            this.rate = ivertis;
            this.Genre = zanras;

    }



}
