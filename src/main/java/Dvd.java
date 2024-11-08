class Dvd implements Item {
    private String titre;

    public Dvd(String titre) {
        this.titre = titre;
    }

    @Override
    public void voirAvis() {
        System.out.println("Consultant les avis sur le DVD");
    }

    @Override
    public void lireExtrait() {
        System.out.println("Lisant un extrait du DVD");
    }
}
