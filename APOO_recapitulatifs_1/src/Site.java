import java.util.ArrayList;

public class Site {
    private String url;
    private ArrayList<ContenuVideo> contenuVideos;

    public Site(String url) {
        this.url = url;
        contenuVideos = new ArrayList<ContenuVideo>();

    }

    public boolean ajouter(ContenuVideo contenuVideo){
        if (contenuVideo == null) throw new IllegalArgumentException("le contenu vidéo est invalide");
        if (contenuVideos.contains(contenuVideo)) return false;
        if (contenuVideo.getCategorie() == null) return false;
        contenuVideos.add(contenuVideo);
        return true;
    }

    public boolean effacer(ContenuVideo contenuVideo){
        if (contenuVideo == null) throw new IllegalArgumentException("le contenu vidéo est invalide");
        contenuVideos.remove(contenuVideo);
        return true;
    }

    @Override
    public String toString() {
        String texte = "Site [url=" + url + "]" + "\nListe de contenus vidéos";
        if (contenuVideos == null){
            return texte + "\n Aucun contenu video";
        }
        for (ContenuVideo cV: contenuVideos) {
                texte += "\n\t" + cV.toString();
        }
        return texte;
    }
}
