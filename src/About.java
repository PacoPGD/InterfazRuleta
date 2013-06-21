import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.awt.event.*;

public class About extends JDialog implements ActionListener {
    JButton boton1;
	JLabel label1, label2, label3, label4, label5;
	JButton bot1;
     void mostrar() {
    	setModal(true);
    	 
         setLayout(null);
         

        setMinimumSize(new Dimension(300, 400));
        setResizable(false);
 		setLocationRelativeTo(null);
     	setLayout(null);
     	
 		setTitle("Sobre la aplicacion");
 		label1= new JLabel("Aplicacion de interfaz grafica");
 		label1.setBounds(50,0,300,200);
 		label2= new JLabel("Asignatura de Sistemas interactivos(SI)");
 		label2.setBounds(25,25,300,200);
 		label3= new JLabel("Autores:");
 		label3.setBounds(115,80,300,200);
 		label4= new JLabel("Francisco Garcia Diaz");
 		label4.setBounds(80,100,300,200);
 		label5= new JLabel("Francisco Javier Rodriguez Lozano.");
 		label5.setBounds(40,125,300,200);
 		bot1= new JButton( "Cerrar" ) ;
 		bot1.setBounds(90,250,100,30);


 		add(label1);
 		add(label2);
 		add(label3);
 		add(label4);
 		add(label5);
 		add(bot1);
 		bot1.addActionListener(this);
 		

		setLocationRelativeTo(null);
 

		setVisible(true);


    }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bot1) 
			this.dispose();
	}  
     

}