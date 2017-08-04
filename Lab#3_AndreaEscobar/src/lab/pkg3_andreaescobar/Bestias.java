package lab.pkg3_andreaescobar;

public class Bestias extends Integrantes {

    int garras;
    boolean veneno;
    int vida;

    public Bestias() {
        super();
    }

    public Bestias(int garras, boolean veneno, int vida) {
        this.garras = garras;
        this.veneno = veneno;
        this.vida = vida;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        if (garras <= 6) {
            this.garras = garras;
        } else {
            this.garras = 6;
        }
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
