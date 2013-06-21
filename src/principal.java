
import javax.swing.*;  


import java.awt.Dimension;
import java.util.*;

public class principal {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { 
            	Login formulario1=new Login();
                formulario1.setBounds(50,50,900,500);
                formulario1.setVisible(true);
				formulario1.setLocationRelativeTo(null);
            }
        });
    }

    
  

	


}