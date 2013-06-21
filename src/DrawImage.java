import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Toolkit;
 
//...
 
public class DrawImage extends JPanel {
 
    private Image imagen;
 
     public DrawImage(String nombreImagen) {
             imagen =(Toolkit.getDefaultToolkit()).getImage(nombreImagen);
			 repaint();
    }
 
    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
 
        setOpaque(false);
        super.paint(g);
    }
 
   public void setImagen(String nombreImagen) {

            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
			
			repaint();
}
}