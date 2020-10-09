/*
Rohit Dewan
2/8/05
Graphics, Pd. 3

This program draws a Butterfly ping pong ball with a comet like tail to show
a stunning appearance effect*/
import java.awt.*;
import java.applet.Applet;
import java.awt.geom.*;

public class butterfly extends Applet
{
	public void init() {
		setBackground(Color.yellow);
		setFont(new Font("Times", Font.PLAIN, 18));
		repaint();
		resize(800,1000);
	}
	
	public void paint(Graphics g) {
		 
		Graphics2D g2 = (Graphics2D) g;
		drawGrid(g);
		ball(g2);
		drawLogoTitle(g2);
	}
	public void ball(Graphics2D g2){
		//fill Ellipse2D.Double
		g2.setPaint(new GradientPaint(325,325,Color.orange,475,325,Color.white));
		
		g2.fill(new Ellipse2D.Double(325,250,150,150));
		//draw Arc2D.Double
		g2.setPaint(Color.black);
		g2.draw(new Arc2D.Double(355.5,300,9,50,90,180,Arc2D.OPEN));
		g2.draw(new Arc2D.Double(435.5,300,9,50,90,-180,Arc2D.OPEN));
		g2.draw(new CubicCurve2D.Double(400,250,520,250,670,420,260,560));
		g2.draw(new CubicCurve2D.Double(467,360,490,320,510,490,260,560));
		//draw first star, located at the very left in between the arcs
		GeneralPath outline = new GeneralPath();
		outline.moveTo(360.5f,300f);
		outline.lineTo(360.5f+20/3,300f);
		outline.lineTo(360.5f+20/3+20/6,295f);
		outline.lineTo(360.5f+20/3+20/3,300f);
		outline.lineTo(360.5f+20f,300f);
		outline.lineTo(360.5f+20-20/3,305f);
		outline.lineTo(360.5f+20f,315f);
		outline.lineTo(360.5f+20/3+20/6,310f);
		outline.lineTo(360.5f,315f);
		outline.lineTo(360.5f+20/3,305f);
		outline.lineTo(360.5f,300f);
		outline.closePath();
		//draw the second star, located in the middle between the arcs
		GeneralPath outline1 = new GeneralPath();
		outline1.moveTo(390.5f,300f);
		outline1.lineTo(390.5f+20/3,300f);
		outline1.lineTo(390.5f+20/3+20/6,295f);
		outline1.lineTo(390.5f+20/3+20/3,300f);
		outline1.lineTo(390.5f+20f,300f);
		outline1.lineTo(390.5f+20-20/3,305f);
		outline1.lineTo(390.5f+20f,315f);
		outline1.lineTo(390.5f+20/3+20/6,310f);
		outline1.lineTo(390.5f,315f);
		outline1.lineTo(390.5f+20/3,305f);
		outline1.lineTo(390.5f,300f);
		outline1.closePath();
		//draw the third star, located at the very right between the arcs
		GeneralPath outline2 = new GeneralPath();
		outline2.moveTo(420.5f,300f);
		outline.lineTo(420.5f+20/3,300f);
		outline.lineTo(420.5f+20/3+20/6,295f);
		outline.lineTo(420.5f+20/3+20/3,300f);
		outline.lineTo(420.5f+20f,300f);
		outline.lineTo(420.5f+20-20/3,305f);
		outline.lineTo(420.5f+20f,315f);
		outline.lineTo(420.5f+20/3+20/6,310f);
		outline.lineTo(420.5f,315f);
		outline.lineTo(420.5f+20/3,305f);
		outline.lineTo(420.5f,300f);
		outline2.closePath();
		g2.setPaint(Color.red);
		g2.fill(outline);
		g2.fill(outline1);
		g2.fill(outline2);
		g2.setPaint(Color.black);
		g2.drawString("ITTF Approved",340,292);
		g2.drawString("Japan",374.5f,350);
	}
	public void drawLogoTitle(Graphics2D g2){
		//draw two rotated ovals
		g2.rotate(Math.PI/8.0);
		g2.setPaint(new GradientPaint(360,-180,Color.magenta,390,-180,Color.white));
		g2.fill(new Ellipse2D.Double(360,-150,30,60));
		g2.rotate(-2*Math.PI/8.0);
		g2.setPaint(new GradientPaint(300,-172.5f,Color.magenta,322.5f,-172.5f,Color.white));
		g2.fill(new Ellipse2D.Double(300,150,22.5,45));
		//set rotation back to normal
		g2.rotate(Math.PI/8.0);	
		g2.setPaint(Color.blue);
		g2.fill(new Rectangle2D.Double(420,10,200,20));
		g2.setPaint(Color.white);
		g2.fill(new Rectangle2D.Double(420,30,200,20));
		g2.setPaint(Color.red);
		g2.fill(new Rectangle2D.Double(420,50,200,20));
		g2.setPaint(Color.black);
		g2.draw(new Line2D.Double(320,80,620,80));
		g2.drawString("Butterfly",440,45);
		
	}
	public void drawGrid(Graphics g){
		//for (int x=0; x<=800; x+=20){
		//	g.drawLine(x,0,x,800);
		//}
		//for (int y=0; y<=1000; y+=20){
		//	g.drawLine(0,y,1000,y);
		//}
	}
	
}
