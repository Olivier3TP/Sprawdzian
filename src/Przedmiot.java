import java.util.Objects;

public class Przedmiot {
    public String nazwaPrzedmiotu;
    private int punktyECTS;

    public Przedmiot(String nazwaPrzedmiotu, int punktyECTS) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        punktyECTS = punktyECTS;
    }
    public Przedmiot(){

    }
    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }
    public int getPunktyECTS() {
        return punktyECTS;
    }
    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }
    public void setPunktyECTS(int punktyECTS) {
        punktyECTS = punktyECTS;
    }
    @Override
    public String toString() {
        return String.format("%s - %d", nazwaPrzedmiotu, punktyECTS);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return punktyECTS == przedmiot.punktyECTS && Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, punktyECTS);
    }
}
