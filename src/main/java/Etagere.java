import java.util.ArrayList;
import java.util.List;

class Etagere {
    List<Livre> livres;

    public Etagere() {
        livres = new ArrayList<>();
    }

    void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    void personnaliserEtagere() {
        System.out.println("Tu peux personnaliser votre étagère");
    }
}
