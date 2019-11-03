import galapagos.*;


public class W01Exercise1 {

	public static void main(String[] args) {
		Turtle frank = new Turtle();
		frank.penDown();

		frank.moveTo(0,100);

		frank.moveTo(100,100);
		frank.turn(270);
		frank.move(100);
		frank.turn(270);
		frank.move(180);
	}

}
