//FONDO DE NUMERO DE CUENTA
package codigo;

//LIBRERIAS
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Manucho
 */
public class fondo2 extends JPanel {
     private Image imagenc = null;
    private MediaTracker tracker;
    
    public fondo2(Component componente){
        try {
            tracker = new MediaTracker(componente);
            Toolkit hr = Toolkit.getDefaultToolkit();
            imagenc = hr.getImage(getClass().getResource("/recursos/autentificacion.png"));
            tracker.addImage(imagenc, 1);
            tracker.waitForAll();
        } 
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(imagenc,0,0,this.getSize().width, this.getSize().height,null);
    }
    
    
}
