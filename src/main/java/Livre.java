class Livre implements Item {
    private String titre;

    public Livre(String titre) {
        this.titre = titre;
    }

    @Override
    public void voirAvis() {
        System.out.println("Consultant les avis sur le livre");
    }

    @Override
    public void lireExtrait() {
        System.out.println("Lisant un extrait du livre");
    }
}
