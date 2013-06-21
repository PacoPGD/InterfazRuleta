import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class menuAmigos extends JPanel implements ActionListener{

    private JLabel etiqueta = new JLabel("LISTA DE AMIGOS");
    private JLabel conec = new JLabel("Conectados");

    private JButton amigo1 = new JButton("PRUEBA");
    private JButton amigo2 = new JButton("PRUEBA");
    
    private JLabel nombre1 = new JLabel("Keyboard");
    private JLabel nombre2 = new JLabel("Mouse");
    menuAmigos()
    {
    	setLayout(null);
    	
        etiqueta.setBounds(40,0,500,50);
        add(etiqueta);
      
        conec.setBounds(40,20,80,50);
        add(conec);
        
        amigo1.setBounds(15,60,50,50);
        amigo1.setIcon(new javax.swing.ImageIcon("gato.png"));
        amigo1.addActionListener(this);
        add(amigo1);
        
        amigo2.setBounds(15,120,50,50);
        amigo2.setIcon(new javax.swing.ImageIcon("raton.png"));
        amigo2.addActionListener(this);
        add(amigo2);

        nombre1.setBounds(70,60,80,50);
        add(nombre1);
        
        nombre2.setBounds(70,120,80,50);
        add(nombre2);
        
        
    }
    
	public void actionPerformed(ActionEvent e) {
	        Chat formulario1=new Chat();
			
	        formulario1.setBounds(0,0,400,300);
			formulario1.setLocationRelativeTo(null);
	        formulario1.setVisible(true);
        
	}

}
