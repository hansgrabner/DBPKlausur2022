package at.campus02;

public class Main {
    public static void main(String[] args){
        System.out.println("DBP Klausur 2022");

        DBPKlausurHelper dbHelper = new DBPKlausurHelper();
        dbHelper.createTableKlausurProjekte();

        KlausurProjekte projektRechnungsverwaltung =new KlausurProjekte(-1,"Rechnungsverwaltung","Software",1200000,8);

        System.out.println("Projektinfo " + projektRechnungsverwaltung);

    }
}
