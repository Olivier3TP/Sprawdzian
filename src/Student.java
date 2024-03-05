import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private int nrIndeksu;
    private int rokStudiow;
    ArrayList<Przedmiot> listaPrzedmiotow = new ArrayList<>();

    public Student(String imie, String nazwisko, int nrIndeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getNrIndeksu() {
        return nrIndeksu;
    }
    public int getRokStudiow() {
        return rokStudiow;
    }
    public ArrayList<Przedmiot> getListaPrzedmiotow() {
        return listaPrzedmiotow;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d", imie, nazwisko, nrIndeksu, rokStudiow);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nrIndeksu == student.nrIndeksu && rokStudiow == student.rokStudiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(listaPrzedmiotow, student.listaPrzedmiotow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, nrIndeksu, rokStudiow, listaPrzedmiotow);
    }
    public void dodajPrzedmiot(Przedmiot przedmiot){
        listaPrzedmiotow.add(przedmiot);
    }
}
