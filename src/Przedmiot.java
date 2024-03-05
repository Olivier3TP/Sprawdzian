import java.util.Objects;

public class Przedmiot {
    public String nazwaPrzedmiotu;
    private int PunktyECTS;

    public Przedmiot(String nazwaPrzedmiotu, int punktyECTS) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        PunktyECTS = punktyECTS;
    }
    public Przedmiot(){

    }
    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }
    public int getPunktyECTS() {
        return PunktyECTS;
    }
    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }
    public void setPunktyECTS(int punktyECTS) {
        PunktyECTS = punktyECTS;
    }
    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwaPrzedmiotu='" + nazwaPrzedmiotu + '\'' +
                ", PunktyECTS=" + PunktyECTS +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return PunktyECTS == przedmiot.PunktyECTS && Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, PunktyECTS);
    }
}
