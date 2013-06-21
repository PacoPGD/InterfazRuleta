import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.util.Calendar;

public class Chat extends JFrame implements ActionListener, KeyListener{
  
	private JTextField TextoAEscribir;
	private JTextArea TextoEnChat;
    private JButton boton1;
	private DrawImage fondo;


	
	public Chat() {
		
		setTitle("Chat");
		
		fondo=new DrawImage("fondoChat.jpg");
		setContentPane(fondo);
		
		
		
        setMinimumSize(new Dimension(300, 300));
        setResizable(false);

     	setLayout(null);
 		//setLocationRelativeTo(null);
		
		TextoEnChat= new JTextArea(100, 80);
		TextoEnChat.setBounds(50,50,270,150);
        add(TextoEnChat);
		
		TextoEnChat.setEditable(false);
		
		TextoAEscribir=new JTextField();
        TextoAEscribir.setBounds(50,210,200,30);
        TextoAEscribir.addKeyListener(this);
        add(TextoAEscribir);
		
	
        boton1=new JButton("->");
        boton1.setBounds(250,210,70,30);
        add(boton1);
        boton1.addActionListener(this);

		 //JScrollPane scroll = new JScrollPane(TextoEnChat);
		
		//scroll.setViewportView();		

    }
    
	
 public void actionPerformed(ActionEvent e) {
	    Calendar Cal= Calendar.getInstance();
		if (e.getSource()==boton1) {
			String contenidoChat=TextoEnChat.getText();

			if(contenidoChat.equals(""))
			{
				TextoEnChat.setText("<"+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+">"+contenidoChat+TextoAEscribir.getText());
				TextoAEscribir.setText("");
			}
			else
			{
				TextoEnChat.setText(contenidoChat+"\n"+"<"+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+">"+TextoAEscribir.getText());
				TextoAEscribir.setText("");			
			}
		}
  }


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyReleased(KeyEvent e) {
    Calendar Cal= Calendar.getInstance();
	if(e.getKeyCode() == KeyEvent.VK_ENTER) {
		String contenidoChat=TextoEnChat.getText();

		if(contenidoChat.equals(""))
		{
			TextoEnChat.setText("<"+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+">"+contenidoChat+TextoAEscribir.getText());
			TextoAEscribir.setText("");
		}
		else
		{
			TextoEnChat.setText(contenidoChat+"\n"+"<"+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+">"+TextoAEscribir.getText());
			TextoAEscribir.setText("");			
		}
	}
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}   


}