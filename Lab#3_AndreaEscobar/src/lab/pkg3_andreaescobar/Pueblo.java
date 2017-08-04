
package lab.pkg3_andreaescobar;
import java.util.Scanner;

public class Pueblo {
    
    private String pueblo;

    public Pueblo() {
    }

    public Pueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    @Override
    public String toString() {
        return "Pueblo{" + "pueblo=" + pueblo + '}';
    }
    
    
}
