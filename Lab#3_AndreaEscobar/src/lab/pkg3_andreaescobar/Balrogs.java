
package lab.pkg3_andreaescobar;

public class Balrogs extends Bestias {
    private boolean latigo;

    public Balrogs() {
        super();
    }
    
    public Balrogs(boolean latigo) {
        this.latigo = latigo;
    }

    public boolean isLatigo() {
        return latigo;
    }

    public void setLatigo(boolean latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs{" + "latigo=" + latigo + '}';
    }
    

}
