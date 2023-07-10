package myProject;

import javax.swing.*;
import java.awt.*;

/**
 * Clase Header
 * @author Esteban Camilo: esteban.urbano@correounivalle.edu.co - 2224043
 * @author David Ordoñez: david.camilo.ordonez@correounivalle.edu.co - 2226057
 * @author Diana Sarmiento: diana.sarmiento@correounivalle.edu.co - 2222811
 * @author Jhon Frank Vasquez: jhon.frank.vasquez@correounivalle.edu.co - 2226510
 * @author Juan Felipe: juan.palechor@correounivalle.edu.co - 2270963
 */
public class Header extends JLabel {
    /**
     * Constructor de la clase Header
     * @param title Cadena que contiene el texto del encabezado
     * @param colorBackground Objeto de color que se asignará para el fondo del encabezado
     */
    public Header(String title, Color colorBackground){
        this.setText(title);
        this.setBackground(colorBackground);
        this.setForeground(new Color(0, 0, 0, 230));
        this.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }
}
