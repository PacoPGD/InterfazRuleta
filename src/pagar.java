import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.*;

import java.awt.Graphics2D;
import java.awt.event.*;
import java.io.*;

public class pagar  extends JFrame implements ActionListener {
    private DrawImage fondo;
    
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    
     void mostrar(boolean estado) {

    	
    	setLayout(null);

 		fondo=new DrawImage("background1.jpg");
  		setContentPane(fondo);
  		

        setMinimumSize(new Dimension(220, 250));
        setResizable(false);
		setLocationRelativeTo(null);
    	setLayout(null);
    	
    	if (estado==true)
          setTitle("PAGA YA");
    	if (estado==false)
    	  setTitle("COBRANDO");

        boton1=new JButton("PAYPAL");
		boton1.setIcon(new javax.swing.ImageIcon("paypal.png"));
        boton1.setBounds(10,10,90,90);
        fondo.add(boton1);
        boton1.addActionListener(this);
        
        boton2=new JButton("TRANSFERENCIA");
		boton2.setIcon(new javax.swing.ImageIcon("transferencia.png"));
        boton2.setBounds(10,120,90,90);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3=new JButton("PAYSAFECARD");
		boton3.setIcon(new javax.swing.ImageIcon("safe.jpg"));
        boton3.setBounds(110,10,90,90);
        add(boton3);
        boton3.addActionListener(this);
        
        boton4=new JButton("MOVIL");
		boton4.setIcon(new javax.swing.ImageIcon("movil.jpg"));
        boton4.setBounds(110,120,90,90);
        add(boton4);

        
        //Mostrar la ventana
        pack();
        setVisible(true);

    }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			NewPageWeb info = new NewPageWeb();
        	info.AbrirURL("https://www.paypal.com");
        }
		if (e.getSource()==boton2) {
			NewPageWeb info = new NewPageWeb();
        	info.AbrirURL("http://www.ingdirect.es/");
        }
		if (e.getSource()==boton3) {
			NewPageWeb info = new NewPageWeb();
        	info.AbrirURL("https://www.paysafecard.com/");
        }

	}  
     

}
