class Livre {
    private String titre;

    public Livre(String titre) {
        this.titre = titre;
    }

    void voirAvis() {
        System.out.println("Consultant les avis sur le livre");
    }

    void lireExtrait() {
        System.out.println("Lisant un extrait du livre");
    }
}
