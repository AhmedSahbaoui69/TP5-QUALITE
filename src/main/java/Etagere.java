import java.util.ArrayList;
import java.util.List;

class Etagere {
    List<Item> items;

    public Etagere() {
        items = new ArrayList<>();
    }

    void ajouterItem(Item item) {
        items.add(item);
    }

    void personnaliserEtagere() {
        System.out.println("Tu peux personnaliser votre étagère");
    }
}
