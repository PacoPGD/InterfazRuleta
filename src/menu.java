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

public class menu  extends JFrame implements ActionListener {
	private Image imagenPerfil;
	
    private JMenu menu1 = new JMenu("Perfil");
    private JMenu menu2 = new JMenu("Ayuda");
    private JMenu menuSobre = new JMenu("Sobre");  
	
    private JMenuBar barra = new JMenuBar();
    
    private JMenuItem verPerfil;
    private JMenuItem anadeDinero;
    private JMenuItem retiraDinero;
    private JMenuItem cerrarSesion;
    private JMenuItem verAyuda;
    private JMenuItem sobreIntro;
	
    static ReproduceAudio audio;
    private DrawImage fondo;
	
    private JButton boton1;
    private JButton boton2;
    private JButton botonmas;
    private JButton botonmenos;
    
    private menuAmigos amigos;

    
     void createAndShowGUI() {

    	
    	setLayout(null);
    	
		audio = new ReproduceAudio("3.wav");
 		fondo=new DrawImage("menuPrincipal.jpg");
  		setContentPane(fondo);
  		

        setMinimumSize(new Dimension(800, 800));
        setResizable(false);
		setLocationRelativeTo(null);
    	setLayout(null);
        setTitle("PAGA Y GANA");
        setJMenuBar(barra);


        barra.add(menu1);
        barra.add(menu2);
        barra.add(menuSobre);
        
        verPerfil = new JMenuItem("Ver perfil");
        menu1.add(verPerfil);
        verPerfil.addActionListener(this);
        
        anadeDinero = new JMenuItem("Añadir dinero");
        menu1.add(anadeDinero);
        anadeDinero.addActionListener(this);
      
        retiraDinero = new JMenuItem("Retirar dinero");
        menu1.add(retiraDinero);
        retiraDinero.addActionListener(this);
        
        cerrarSesion = new JMenuItem("Cerrar sesión");
        menu1.add(cerrarSesion);
        cerrarSesion.addActionListener(this);
		
		verAyuda = new JMenuItem("Reglas Ruleta");
        menu2.add(verAyuda);
        verAyuda.addActionListener(this);
		
		
        sobreIntro = new JMenuItem("?");
        menuSobre.add(sobreIntro);
        sobreIntro.addActionListener(this);
        
        boton1=new JButton("DINERO FICTICIO");
        boton1.setBounds(50,100,190,190);
        boton1.setIcon(new javax.swing.ImageIcon("imaginario.png"));
        fondo.add(boton1);
        boton1.addActionListener(this);
        
        boton2=new JButton("DINERO REAL");
        boton2.setBounds(350,100,190,190);
        boton2.setIcon(new javax.swing.ImageIcon("real.png"));
        add(boton2);
        boton2.addActionListener(this);
        
        botonmas=new JButton("+");
        botonmas.setBounds(635,55,50,50);
        add(botonmas);
        botonmas.addActionListener(this);
        
        botonmenos=new JButton("-");
        botonmenos.setBounds(715,55,50,50);
        add(botonmenos);
        botonmenos.addActionListener(this);
        
        amigos = new menuAmigos();
        add(amigos);
        amigos.setBounds(610, 130, 180, 600);
		amigos.setVisible(false);
        

		
        
        //Mostrar la ventana
        pack();
        setVisible(true);

        
		setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1 || e.getSource()==boton2)
		{
			audio.para();
	        juego juego1 = new juego();
	        juego1.setSize(800,800);	    
		}
        if (e.getSource()==verPerfil) {
        	perfil miPerfil = new perfil();

        	miPerfil.mostrar();
        }
        if (e.getSource()==sobreIntro) {
        	About sobre = new About();
        	sobre.mostrar();
        }
		 
		if (e.getSource()==verAyuda) {
			NewPageWeb info = new NewPageWeb();
        	info.AbrirURL("http://www.ruleta.info/reglas_de_la_ruleta.html");
        }
		if (e.getSource()==cerrarSesion) {
        	Login formulario1=new Login();
            formulario1.setBounds(50,50,900,500);
            formulario1.setVisible(true);
            this.dispose();
            audio.para();
			
        }
		if (e.getSource()==botonmas) {
			amigos.setVisible(true);
        }
		
		if (e.getSource()==botonmenos) {
			amigos.setVisible(false);
        }
		
		if (e.getSource()==anadeDinero)
		{
        	pagar paga = new pagar();
        	paga.mostrar(true);
		}
		
		if (e.getSource() == retiraDinero)
		{
        	pagar paga = new pagar();
        	paga.mostrar(false);
		}
	}  
     

}
