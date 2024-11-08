public class LibrairieApp {
    public static void main(String[] args) {
        Etagere favoris = new Etagere();

        Livre livre1 = new Livre("hamid");
        Livre livre2 = new Livre("hamid 2");
        Dvd dvd1 = new Dvd("shrek");

        favoris.ajouterItem(livre1);
        favoris.ajouterItem(livre2);
        favoris.ajouterItem(dvd1);
    }
}
