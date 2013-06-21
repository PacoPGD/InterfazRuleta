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
import javax.swing.JTextArea;


import java.awt.Font;

import javax.swing.*;

import java.awt.Graphics2D;
import java.awt.event.*;
import java.io.*;

import java.util.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;

import java.awt.Point;



public class juego  extends JFrame implements ActionListener {
	private Image imagenPerfil;
	
    private JMenu menu1 = new JMenu("Perfil");
    private JMenu menu2 = new JMenu("Ayuda");
    private JMenu menuSobre = new JMenu("Sobre"); 
	private DrawImage fondo;
	private int fichaRaton;
	private int  showRivals;
	private JButton Rivals = new JButton();
/*	
    private JMenuBar barra = new JMenuBar();
    
    private JMenuItem verPerfil;
    private JMenuItem anadeDinero;
    private JMenuItem retiraDinero;
    private JMenuItem cerrarSesion;
    private JMenuItem verAyuda;
    private JMenuItem sobreIntro;
	
    private ReproduceAudio audio;
 
*/	
    private JButton fich1 = new JButton();
	private JButton fich5 = new JButton();
	private JButton fich25 = new JButton();
	private JButton fich50 = new JButton();
	private JButton fich100 = new JButton();
	private JButton figRuleta = new JButton();
	private JButton[][] tapiz = new JButton[3][13];
	private JButton[] tapiz0 = new JButton[2];
	private JButton[] tapiz2 = new JButton[3];
	private JButton[] tapiz3 = new JButton[6];
	
	private JTextArea numResultante = new JTextArea();
 
/* 
	private JButton boton2;
    private JButton botonmas;
    private JButton botonmenos;
  */ 
    private menuAmigos amigos;

    private JButton rival1 = new JButton("PRUEBA");
    private JButton rival2 = new JButton("PRUEBA");
   // private ReproduceAudio audio;
     juego() {
    	setLayout(null);
    	
    	menu.audio = new ReproduceAudio("2.wav");
 		fondo=new DrawImage("mesa.png");
  		setContentPane(fondo);
  		

        setMinimumSize(new Dimension(900, 700));
        setResizable(false);
		setLocationRelativeTo(null);
    	setLayout(null);
        setTitle("PARTIDA");

		
		Rivals.setBounds(15,27,100,70);
        Rivals.setIcon(new javax.swing.ImageIcon("rivals.png"));
        Rivals.addActionListener(this);
        add(Rivals);
        
		
		
		
        rival1.setBounds(15,110,50,50);
        rival1.setIcon(new javax.swing.ImageIcon("gato.png"));
        rival1.addActionListener(this);
		rival1.setVisible(false);
        add(rival1);
        
        rival2.setBounds(15,180,50,50);
        rival2.setIcon(new javax.swing.ImageIcon("raton.png"));
        rival2.addActionListener(this);
		rival2.setVisible(false);
        add(rival2);

		
		
		
		for(int cont=0;cont<3;++cont)
        {
			for(int cont2=0;cont2<13;++cont2)
			{
				tapiz[cont][cont2]= new JButton("");
				tapiz[cont][cont2].setBounds(246+33*cont2,247+60*cont,33,60);
				tapiz[cont][cont2].setOpaque(false);
				tapiz[cont][cont2].setContentAreaFilled(false);
				tapiz[cont][cont2].setBorderPainted(false);
				add(tapiz[cont][cont2]);
				tapiz[cont][cont2].addActionListener(this);
			}
		}
		
		
		for(int cont=0;cont<2;++cont)
        {
			tapiz0[cont]= new JButton("");
			tapiz0[cont].setBounds(180+33,273+63*cont,33,63);
			tapiz0[cont].setOpaque(false);
			tapiz0[cont].setContentAreaFilled(false);
			tapiz0[cont].setBorderPainted(false);
			add(tapiz0[cont]);
			tapiz0[cont].addActionListener(this);
		}
		
		
		for(int cont=0;cont<3;++cont)
        {
			tapiz2[cont]= new JButton("");
			tapiz2[cont].setBounds(247+33*4*cont,372+60,33*4,60);
			tapiz2[cont].setOpaque(false);
			tapiz2[cont].setContentAreaFilled(false);
			tapiz2[cont].setBorderPainted(false);			
			add(tapiz2[cont]);
			tapiz2[cont].addActionListener(this);
		}
		
		
		
		for(int cont=0;cont<6;++cont)
        {
			tapiz3[cont]= new JButton("");
			tapiz3[cont].setBounds(247+33*2*cont,432+60,33*2,60);
			tapiz3[cont].setOpaque(false);
			tapiz3[cont].setContentAreaFilled(false);
			tapiz3[cont].setBorderPainted(false);			
			add(tapiz3[cont]);
			tapiz3[cont].addActionListener(this);
		}	
		
		
		
		
		
		
		fich1.setBounds(170,630,96,96);
      //  fich1.setIcon(new javax.swing.ImageIcon("../fichas/f1.png"));
        fich1.addActionListener(this);
		fich1.setOpaque(false);
		fich1.setContentAreaFilled(false);
		fich1.setBorderPainted(false);
        add(fich1);
		
		
		fich5.setBounds(280,630,96,96);
        //fich5.setIcon(new javax.swing.ImageIcon("../fichas/f5.png"));
        fich5.addActionListener(this);
		fich5.setOpaque(false);
		fich5.setContentAreaFilled(false);
		fich5.setBorderPainted(false);
        add(fich5);
		
		
		fich25.setBounds(400,630,96,96);
        //fich25.setIcon(new javax.swing.ImageIcon("../fichas/f25.png"));
        fich25.addActionListener(this);
		fich25.setOpaque(false);
		fich25.setContentAreaFilled(false);
		fich25.setBorderPainted(false);
        add(fich25);
		
		
		
		fich50.setBounds(520,630,96,96);
        //fich50.setIcon(new javax.swing.ImageIcon("../fichas/f50.png"));
        fich50.addActionListener(this);
		fich50.setOpaque(false);
		fich50.setContentAreaFilled(false);
		fich50.setBorderPainted(false);
        add(fich50);
		
		
		
		fich100.setBounds(650,630,96,96);
        //fich100.setIcon(new javax.swing.ImageIcon("../fichas/f100.png"));
        fich100.addActionListener(this);
		fich100.setOpaque(false);
		fich100.setContentAreaFilled(false);
		fich100.setBorderPainted(false);
        add(fich100);
		

		figRuleta.setBounds(310,40,96,96);
        //fich100.setIcon(new javax.swing.ImageIcon("../fichas/f100.png"));
        figRuleta.addActionListener(this);
		figRuleta.setOpaque(false);
		figRuleta.setContentAreaFilled(false);
		figRuleta.setBorderPainted(false);
        add(figRuleta);
		
		
		numResultante.setBounds(500,43,96,96);
		numResultante.setEditable(false);
		add(numResultante);
        
	addMouseListener(new MouseAdapter(){
   public void mousePressed(MouseEvent ev){
      areaMousePressed(ev);
      }
	  
	  
	  
	  		private void areaMousePressed(MouseEvent ev){
  
   if(ev.getButton()==MouseEvent.BUTTON3)
      setCursor(null);
      }	   
});

		
		addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent we){
		    	   menu.audio.para();
		    	   menu.audio.empieza("3.wav");
		    }
		});
		
		
        //Mostrar la ventana
        pack();
        setVisible(true);

    }

     
     
     
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==Rivals)
			if(showRivals==0)
			{
				rival1.setVisible(true);
				rival2.setVisible(true);
				showRivals=1;
			}
			else
			{
				rival1.setVisible(false);
				rival2.setVisible(false);
				showRivals=0;
			}
	
	
		if (e.getSource()==rival1 || e.getSource()==rival2)
		{
	        Chat formulario1=new Chat();
	        formulario1.setBounds(0,0,400,300);
			formulario1.setLocationRelativeTo(null);
	        formulario1.setVisible(true);	
		}
		
		if (e.getSource()==fich1)
		{
			fichaRaton=1;
			Image im = Toolkit.getDefaultToolkit().createImage("fichas/f1.png");
			Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10,10),"WILL");
			setCursor(cur); 	
		}
		
		if (e.getSource()==fich5)
		{
			fichaRaton=5;
			Image im = Toolkit.getDefaultToolkit().createImage("fichas/f5.png");
			Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10,10),"WILL");
			setCursor(cur); 	
		}
		
		if (e.getSource()==fich25)
		{
			fichaRaton=25;
			Image im = Toolkit.getDefaultToolkit().createImage("fichas/f25.png");
			Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10,10),"WILL");
			setCursor(cur); 	
		}
		
		if (e.getSource()==fich50)
		{
			fichaRaton=50;
			Image im = Toolkit.getDefaultToolkit().createImage("fichas/f50.png");
			Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10,10),"WILL");
			setCursor(cur); 	
		}
		
		if (e.getSource()==fich100)
		{
			fichaRaton=100;
			Image im = Toolkit.getDefaultToolkit().createImage("fichas/f100.png");
			Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10,10),"WILL");
			setCursor(cur); 	
		}
	
		if (e.getSource()==figRuleta)
		{
			int ruleta []={2, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 2};
			int valorCasilla = (int) Math.floor(Math.random()*38);  // Valor entre 0 y 38, ambos incluidos.
			
			Font font = new Font("Verdana", Font.PLAIN, 50);
			numResultante.setFont(font);
			
		
			numResultante.setText(" "+Integer.toString(valorCasilla));
			
			if(valorCasilla<10)
				numResultante.setText("  "+Integer.toString(valorCasilla));//para centrar el texto un poco
			
			if(ruleta[valorCasilla]==1)
			{
				numResultante.setBackground(Color.RED);
				numResultante.setForeground(Color.black);
			}
			else if(ruleta[valorCasilla]==0)
			{
				numResultante.setBackground(Color.BLACK);
				numResultante.setForeground(Color.white);
			}
			else
			{
				if(valorCasilla==37)
					numResultante.setText(" 00");
					
				numResultante.setBackground(Color.GREEN);
				numResultante.setForeground(Color.white);
			}
			
			for(int cont=0;cont<3;++cont)
			{
				for(int cont2=0;cont2<13;++cont2)
				{
					tapiz[cont][cont2].setIcon(null);
					tapiz[cont][cont2].setOpaque(false);
					tapiz[cont][cont2].setContentAreaFilled(false);
					tapiz[cont][cont2].setBorderPainted(false);
				}
			}
			
			
			
			
			for(int cont=0;cont<2;++cont)
			{
				tapiz0[cont].setIcon(null);
				tapiz0[cont].setOpaque(false);
				tapiz0[cont].setContentAreaFilled(false);
				tapiz0[cont].setBorderPainted(false);
			}
		
		
			for(int cont=0;cont<3;++cont)
			{
				tapiz2[cont].setIcon(null);
				tapiz2[cont].setOpaque(false);
				tapiz2[cont].setContentAreaFilled(false);
				tapiz2[cont].setBorderPainted(false);			
			}
		
		
		
			for(int cont=0;cont<6;++cont)
			{
				tapiz3[cont].setIcon(null);
				tapiz3[cont].setOpaque(false);
				tapiz3[cont].setContentAreaFilled(false);
				tapiz3[cont].setBorderPainted(false);			
			}					
		}	
				if (e.getSource() instanceof JButton);
				{
					if(e.getSource() !=figRuleta && e.getSource()!=rival1 && e.getSource()!=rival2 &&  e.getSource()!=fich1 && e.getSource()!=fich5 && e.getSource()!=fich25 && e.getSource()!=fich50 && e.getSource()!=fich100 && e.getSource()!=Rivals)
					{
						if(fichaRaton==1)
							((JButton)e.getSource()).setIcon(new javax.swing.ImageIcon("fichas/f1mini.png"));


						if(fichaRaton==5)
							((JButton)e.getSource()).setIcon(new javax.swing.ImageIcon("fichas/f5mini.png"));

							
						if(fichaRaton==25)
							((JButton)e.getSource()).setIcon(new javax.swing.ImageIcon("fichas/f25mini.png"));
							

						if(fichaRaton==50)
							((JButton)e.getSource()).setIcon(new javax.swing.ImageIcon("fichas/f50mini.png"));

							
						if(fichaRaton==100)
							((JButton)e.getSource()).setIcon(new javax.swing.ImageIcon("fichas/f100mini.png"));
							
							

						((JButton)e.getSource()).setOpaque(true);
						((JButton)e.getSource()).setContentAreaFilled(true);
						((JButton)e.getSource()).setBorderPainted(true);
					}
				}
			
		
			
			
			
		
	
		
	}  
	
	



	
	
     

}
