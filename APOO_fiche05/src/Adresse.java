public class Adresse {
    private String rue, numero, codePostal, ville;

    public Adresse(String rue, String numero, String codePostal, String ville){
        this.rue = rue;
        this.numero = numero;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public String getNumero() {
        return numero;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        if (rue == null && numero == null && codePostal == null && ville == null){
            String texte = "Adresse inconnue";
            return texte;
        }
        return getNumero() + " " + getRue() + ", " +getCodePostal() + " " + getVille();
    }
}
