package iINTERFACE;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;  
import java.awt.geom.Rectangle2D;  
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;  
  
public class Fundo extends javax.swing.JPanel{  
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		BufferedImage b;  
        Rectangle2D rect;  
          
        public Fundo(){   
            try {  
                 //se voc� pegar uma imagem dentro do mesmo jar/projeto  
                //b = ImageIO.read(getClass().getResourceAsStream("<pacote>/<imagem>"));  
                b = ImageIO.read(new File("C:/Users/Propriet�rio/Desktop/Bohemia-6.jpg")); 
                
                //ou, se voc� pegar uma imagem direto do sistema, use este                 
                // b = ImageIO.read(new File("<caminho da imagem>"));  
                  
                //cria uma imagem do tamanho 130x130,   
                //que vai se repetir ao longo do fundo, o tamanho � voc� quem escolhe.  
              
                rect = new Rectangle(0,0,this.getWidth(),this.getHeight()); 
                  
            } catch (IOException ex) {  
                ex.printStackTrace(System.err);  
            }  
        }  
          
        @Override   
        public void paintComponent(Graphics g){    
            /* 
             * Se voc� quiser que a imagem seja uma s� (extendida ao tamanho da tela, n�o replicada 
             * tire os coment�rios da proxima linha 
             */  
              
          // rect = new Rectangle(0,0,this.getWidth(),this.getHeight());  
              
              
            TexturePaint p = new TexturePaint(b,rect);  
            Graphics2D g2 = (Graphics2D) g;  
            g2.setPaint(p);  
            g2.fillRect(0,0,this.getWidth(),this.getHeight());  
   
        }  
    }  
