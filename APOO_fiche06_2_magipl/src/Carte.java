
import java.util.Objects;

public class Carte {
    private int cout;

    public Carte(int cout){
        this.cout = cout;
    }
    public String fournirDetail(){
        return " - cout : " + getCout() + " ";
    }

    public int getCout() {
        return cout;
    }
}
