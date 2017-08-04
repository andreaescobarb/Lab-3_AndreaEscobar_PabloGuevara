
package lab.pkg3_andreaescobar;

import java.awt.Color;

public class Aguilas extends Bestias {
    Color colorplumaje;

    public Aguilas() {
        super();
    }

    public Aguilas(Color colorplumaje) {
        this.colorplumaje = colorplumaje;
    }

    public Color getColorplumaje() {
        return colorplumaje;
    }

    public void setColorplumaje(Color colorplumaje) {
        this.colorplumaje = colorplumaje;
    }

    @Override
    public String toString() {
        return "Aguilas{" + "colorplumaje=" + colorplumaje + '}';
    }
    
    
    
}
