
package lab.pkg3_andreaescobar;

public class Araña {
    private boolean sexo;

    public Araña() {
        super();
    }

    public Araña(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ara\u00f1a{" + "sexo=" + sexo + '}';
    }
    
    
}
