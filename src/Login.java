import javax.swing.*;

import java.awt.Graphics2D;
import java.awt.event.*;
import java.io.*;

public class Login extends JFrame implements ActionListener, KeyListener{
  
	private JTextField NombreUsuario;
	private JPasswordField PassUsuario;
    private JLabel label1, label2;
    private JButton boton1;
	ReproduceAudio audio;
	DrawImage fondo;
	

	public Login() {
		
		audio = new ReproduceAudio("1.wav");
		
		fondo=new DrawImage("imgLog.png");
		

		
		setContentPane(fondo);
		
		
		setSize(800, 600);
		setResizable(false);
		
		
		
        setLayout(null);
		setTitle("Iniciar Sesion");
        label1=new JLabel("Usuario:");
        label1.setBounds(50,210,100,30);
        add(label1);
		
		NombreUsuario=new JTextField();
        NombreUsuario.setBounds(120,215,150,20);
        NombreUsuario.addKeyListener(this);
        add(NombreUsuario);
		
		label2=new JLabel("Password:");
        label2.setBounds(50,250,100,30);
        add(label2);

		PassUsuario=new javax.swing.JPasswordField();
		PassUsuario.setBounds(120,255,150,20);
        PassUsuario.addKeyListener(this);
		add(PassUsuario);
		

        boton1=new JButton("Aceptar");
        boton1.setBounds(100,300,100,30);
        add(boton1);
        boton1.addActionListener(this);
		

        
        
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
	        menu menu1 = new menu();
	        menu1.setSize(800,800);
	        menu1.createAndShowGUI();
	        audio.para();
	        this.dispose();
        }
    }
    
    public void keyTyped(KeyEvent e) {

    }


	public void keyPressed(KeyEvent e) {
    	if(e.getKeyCode() == KeyEvent.VK_ENTER){
	        menu menu1 = new menu();
	        menu1.setSize(800,800);
	        menu1.createAndShowGUI();
	        audio.para();
	        this.dispose();
    	}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
	}



  }  


