package asPieChart;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PieChart extends JFrame {
	
	private int North, South, West, East, Midwest;
	
	public PieChart(int North, int South, int West, int East, int Midwest) {
		super();
		this.North = North;
		this.South= South;
		this.West= West;
		this.East= East;
		this.Midwest = Midwest;
	}

	@Override 
	public void paint(Graphics g) {
		super.paint(g);
		
		double total = North + South + West +East +Midwest;
		
		int startAngle =0; 
		int arcLength = (int)((North/total) * 360);
		g.setColor(Color.red);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        
        startAngle = startAngle + arcLength; 
		arcLength = (int)((South/total) * 360);
		g.setColor(Color.cyan);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        
        startAngle = startAngle + arcLength; 
		arcLength = (int)((West/total) * 360);
		g.setColor(Color.magenta);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        startAngle = startAngle + arcLength; 
		arcLength = (int)((East/total) * 360);
		g.setColor(Color.green);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        startAngle = startAngle + arcLength; 
		arcLength = (int)((Midwest/total) * 360);
		g.setColor(Color.orange);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
       
        int xRect = 100;
        int recWidth = 50;
        int horSpacing = 10;
        int verSpacing = 5;
        
        int yRect = 500;
        int recHeight = 10;
        g.setColor(Color.red);
        g.fillRect(xRect, yRect, recWidth, recHeight);
        
        int xString = xRect + recWidth + horSpacing;
        int yString = yRect+ recHeight;
        String theString = "North - " + North;
        g.drawString(theString, xString, yString);
        
        yRect = yRect + recHeight + verSpacing;
        g.setColor(Color.cyan);
        g.fillRect(xRect, yRect, recWidth, recHeight);
        
        int xString2 = xRect + recWidth + horSpacing;
        int yString2 = yRect+ recHeight;
        String theString2 = "South - " + South;
        g.drawString(theString2, xString2, yString2);
        
        yRect = yRect + recHeight + verSpacing;
        g.setColor(Color.magenta);
        g.fillRect(xRect, yRect, recWidth, recHeight);
        
        int xString3 = xRect + recWidth + horSpacing;
        int yString3 = yRect + recHeight;
        String theString3 = "West - " + West;
        g.drawString(theString3, xString3, yString3);
        
        yRect = yRect + recHeight + verSpacing;
        g.setColor(Color.green);
        g.fillRect(xRect, yRect, recWidth, recHeight);
        
        int xString4 = xRect + recWidth + horSpacing;
        int yString4 = yRect + recHeight;
        String theString4 = "East - " + East;
        g.drawString(theString4, xString4, yString4);
        
        yRect = yRect + recHeight + verSpacing;
        g.setColor(Color.orange);
        g.fillRect(xRect, yRect, recWidth, recHeight);
        
        int xString5 = xRect + recWidth + horSpacing;
        int yString5 = yRect + recHeight;
        String theString5 = "Midwest - " + Midwest;
        g.drawString(theString5, xString5, yString5);
        
        
     
		
		
		
	}
}
