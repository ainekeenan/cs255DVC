package asDraw;

import java.awt.Color;
import java.net.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelExt extends JPanel {

    String type;
    URL cat = getClass().getResource("motorcycleCat.gif");
    URL squirrel = getClass().getResource("Squirrel.gif");
    URL snoopy = getClass().getResource("snoopy.gif");
    URL davis26 = getClass().getResource("FRClassof2026_v2.gif");
    
    ImageIcon imgicCat = new ImageIcon(cat);
    ImageIcon imgicSquir = new ImageIcon(squirrel);
    ImageIcon imgicSnoopy = new ImageIcon(snoopy);
    ImageIcon imgicDavis26 = new ImageIcon(davis26);
    
    Image imgCat = imgicCat.getImage();
    Image imgSquir = imgicCat.getImage();
    Image imgSnoopy = imgicSnoopy.getImage();
    Image imgDavis26 = imgicDavis26.getImage();
  
    Image[] pics = {imgCat, imgSquir, imgSnoopy, imgDavis26};
    

    
	
	public JPanelExt() {
		super();

		
	}
	
	
	
	

	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
	if(type.equalsIgnoreCase("happy")) {
		g.setColor(Color.cyan);
	       g.fillOval(0,0,300,300);
	       g.setColor(Color.RED);
	       g.fillOval(80,75,30,30);
	       g.fillOval(190,75,30,30);
	       g.setColor(Color.black);
	       g.fillArc (75,100,150,150,0,-180);
	      
	}
		
	
	       
	       
	       if(type.equalsIgnoreCase("sad")){g.setColor(Color.GREEN);
           g.fillOval(0,0,300,300);
           g.setColor(Color.black );
           g.fillOval(80,75,30,30);
           g.fillOval(190,75,30,30);
           g.setColor(Color.black);
           g.drawArc(75,150,150,150,0,180);}
	       
           
           if(type.equalsIgnoreCase("random")) {
        	   // int n = ( (int) (Math.random ( ) * 4 )+1 );
        	   
        	 int x =  ( (int) (Math.random ( ) * 4 ) );
        	   
        	   Image rude = pics[x]; 
        	   
        	   g.drawImage(rude, 0, 0, this.getWidth(), this.getHeight(), this); 
        	  
             /* if(n == 1) {
            	   g.drawImage (imgCat,0,0,this.getWidth( ), this.getHeight ( ) , this);
               } else if (n==2) {
            	   g.drawImage (imgSquir,0,0,this.getWidth( ), this.getHeight ( ) , this);
               } else if(n==3) {
            	   g.drawImage (imgSnoopy,0,0,this.getWidth( ), this.getHeight ( ) , this);
               } else if(n==4) {
            	   g.drawImage (imgDavis26,0,0,this.getWidth( ), this.getHeight ( ) , this);
               }  */
               
               


           }
	
	} 
	       
	       
	
	       
	       
	public void setPictureType (String PictureType) {
		type = PictureType;
	
		
		repaint();

		
			
		}
		
		
	}
		

