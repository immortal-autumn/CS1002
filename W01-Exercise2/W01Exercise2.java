import galapagos.*;
import java.awt.Color; 	

public class W01Exercise2 {

	public static void main(String[] args) {
		TurtleDrawingWindow NW = new TurtleDrawingWindow();
		Turtle frank = new Turtle(0);
		Turtle a = new Turtle(0);
		Turtle b = new Turtle(0);
		Turtle c = new Turtle(0);
		NW.add(a);
		NW.add(frank);
		NW.add(c);
		
		NW.add(b);
		
		NW.setVisible(true);
		NW.
		frank.speed(120);
		a.speed(39);
		c.speed(30);
		c.jumpTo(-190,-100);
		frank.penDown();
		a.penDown();
		b.jumpTo(40,40);
		b.turn(1280);
		c.penColor(Color.red);
		c.move(20);
		c.penColor(Color.yellow);
		c.move(20);
		c.penColor(Color.green);
		c.move(20);
		c.penColor(Color.blue);
		c.move(20);
		c.penColor(Color.pink);
		c.move(20);
		c.penColor(Color.black);
		c.move(20);
		c.penColor(Color.white);
		c.move(20);


		frank.moveTo(0,50);
		a.jumpTo(25,25);
		b.move(48);
		a.bodyColor(Color.blue);
		frank.turn(135);
		a.move(25);
		a.bodyColor(Color.green);
		a.penColor(Color.red);
		frank.move(50);
		a.turn(60);
		a.bodyColor(Color.orange);
		frank.turn(135);
		a.move(25);
		frank.move(50);
		a.turn(60);
		a.move(25); 	
		frank.penUp();
	}

}
