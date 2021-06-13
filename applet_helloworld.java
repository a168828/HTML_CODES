 import java.awt.Graphics;
 import java.applet.Applet;
import java.applet.*;  
import java.awt.*;  
 
   public class applet_helloworld extends Applet
   {	
     
     public void paint(Graphics g)
     {
       g.drawString("different shapes=",20,20);
         g.drawLine(10,20,50,60);
  	 g.drawRect(10,70,40,40);
  	 g.setColor(Color.RED);
   	 g.fillOval(60,20,30,90);
  	 g.fillArc(60,135,80,40,180,180);
  	 g.fillRoundRect(20,120,60,30,5,5);
}
 }