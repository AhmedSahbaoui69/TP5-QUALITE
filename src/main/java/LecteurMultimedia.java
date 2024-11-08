public class LecteurMultimedia {
    public void afficherPDF(Pdf d) {
        d.afficher();
    }

    public void afficherMp3(Mp3 a) {
        a.ecouter();
    }

    public void afficherDvd(Dvd v) {
        v.visualiser();
    }

    public void afficherJpg(Jpg j) {
        j.afficher();
    }


    public static void main(String[] args) {
        Pdf doc = new Pdf();
        Mp3 music = new Mp3();

        doc.afficher();
        music.ecouter();
    }
}
