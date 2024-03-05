public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kamil","Kowalski", 1,3);
        Student student2 = new Student("Michal","Kowal",2,2);
        Student student3 = new Student("Olivier","Szablowski",3,3);

        Przedmiot matematyka = new Przedmiot("Matematyka",40);
        Przedmiot informatyka = new Przedmiot("Informatyka", 60);
        Przedmiot geografia = new Przedmiot("Geografia",50);

        student1.listaPrzedmiotow.add(matematyka);
        student1.listaPrzedmiotow.add(geografia);

        student2.listaPrzedmiotow.add(geografia);
        student2.listaPrzedmiotow.add(matematyka);
        student2.listaPrzedmiotow.add(informatyka);

        student3.listaPrzedmiotow.add(informatyka);
        student3.listaPrzedmiotow.add(matematyka);

        // będzie 5 ?
    }
}