
package lab.pkg3_andreaescobar;
import java.util.ArrayList;
import java.util.Scanner;

public class Pueblo {
    
    private String pueblo;
    private ArrayList<Integrantes> integ = new ArrayList();

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

    public ArrayList<Integrantes> getInteg() {
        return integ;
    }

    public void setInteg(ArrayList<Integrantes> integ) {
        this.integ = integ;
    }

    @Override
    public String toString() {
        return "Pueblo{" + "pueblo=" + pueblo + ", integ=" + integ + '}';
    }
    
    
    
    
}
