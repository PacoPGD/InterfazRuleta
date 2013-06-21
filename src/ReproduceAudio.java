

import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Ejemplo de reproducción de ficheros de sonido.
 * @author chuidiang
 * http://www.chuidiang.com
 */
public class ReproduceAudio {

    /**
     * Abre un fichero de sonido wav y lo reproduce
     * @param args
     */
	Clip sonido;
	
    public void para()
    {
       sonido.close();
       sonido.stop();
    }
	
    public void empieza(final String pista)
    {
        new Thread(
    			new Runnable() {
    			public void run() {
    				try {

                sonido = AudioSystem.getClip();

                sonido.open(AudioSystem.getAudioInputStream(new File(pista)));

                sonido.start();
                
                sonido.loop(Clip.LOOP_CONTINUOUSLY);

         

            } catch (Exception e) {
                System.out.println("" + e);
            }
    		}
    			
    	       
    	}).start();    	
    	
    }
    public ReproduceAudio(final String pista) {
    	empieza(pista);
    }

}