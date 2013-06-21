import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JTextArea;

import java.awt.Font;

import java.awt.BorderLayout;

import java.awt.Image;
import javax.swing.ImageIcon;


public class perfil extends JFrame implements ActionListener {
	JMenuItem verPerfil;
	JButton img = new JButton();
	JTextArea info;
	
	private DrawImage fondo;

	
     void mostrar() {
        setTitle("Mis datos");

		
		fondo=new DrawImage("fondoPerfil.png");
		setContentPane(fondo);


        setMinimumSize(new Dimension(500, 500));
        setResizable(false);
 		setLocationRelativeTo(null);
     	setLayout(null);

		
		img.setIcon(new javax.swing.ImageIcon("printer.jpg"));
		img.setBounds(190,50,100,100);
        fondo.add(img);
        img.addActionListener(this);
		
		
		 info = new JTextArea(300, 300);
		 info.setBounds(100,250,270,150);
		 Font font = new Font("Verdana", Font.PLAIN, 20);
		 info.setFont(font);
		 info.setText("Usuario: :=Printer=: \nNombre: Printer Printer \nDinero Real: 0 $ \nDinero Ficticio: 0 $");
		 info.setOpaque(false);
		 add(info);
		 
        //Mostrar la ventana
        pack();
        setVisible(true);

    }

	public void actionPerformed(ActionEvent e) {
 		if (e.getSource()==img)
		{
			JDialog biblio = new JDialog();
			
	        biblio.setMinimumSize(new Dimension(300, 300));
	        biblio.setResizable(false);
	 		biblio.setLocationRelativeTo(null);
	     	biblio.setLayout(null);
			
			JTextArea texto = new JTextArea(300, 300);
			biblio.setModal(true);
			texto.setText("Instruyo duras torturas\na los malvados ignorantes\nde mis enemigos ratón y teclado\nayudo cuando más se necesita\nno soy vuestro héroe, soy vuestro DIOS");
			texto.setBounds(0,0,270,150);
			texto.setOpaque(false);
			texto.setEditable(false);
			biblio.add(texto);
			biblio.setTitle("Mi biografía");
			biblio.setVisible(true);
			biblio.setLocationRelativeTo(info);

		}
	}  
     

}
