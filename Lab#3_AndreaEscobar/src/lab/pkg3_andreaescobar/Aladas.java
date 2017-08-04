
package lab.pkg3_andreaescobar;


public class Aladas extends Bestias {
    private int velocidad;

    public Aladas() {
        super();
    }

    public Aladas(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Aladas{" + "velocidad=" + velocidad + '}';
    }
    
    
}
