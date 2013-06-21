import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;

import java.awt.Desktop;
import java.net.URI;


public class NewPageWeb {

	public static void AbrirURL(String web) {
if(java.awt.Desktop.isDesktopSupported()){
 try{
      Desktop dk = Desktop.getDesktop();
      dk.browse(new URI(web));
 }catch(Exception e){
     System.out.println("Error al abrir URL: "+e.getMessage());
 }
}  
				}

	}


