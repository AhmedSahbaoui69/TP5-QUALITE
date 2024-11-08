public class LibrairieApp {
    public static void main(String[] args) {
        Etagere favoris = new Etagere();

        Livre bok = new Livre("Clean Code");
        Livre bok2 = new Livre("Refactoring");

        favoris.ajouterLivre(bok);
        favoris.ajouterLivre(bok2);
    }
}
