package houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot t;

	public static void main(String args[]) {
	t = new Robot("mini");
	t.setSpeed(10);
	t.setX(50);
	t.setY(450);
	t.setWindowColor(0, 0, 0);
	drawPointyRoof("small", 100, 100, 100);
	drawFlatRoof("meduim", 50, 255, 0);
	drawPointyRoof("large", 255, 0, 0);
	drawFlatRoof("small", 24, 0, 200);
	drawFlatRoof("large", 23, 15, 68);
	drawPointyRoof("meduim", 60, 140, 200);

	

}
	public static void drawPointyRoof(String height, int r, int g, int b) {
		
		int h = 0;
		if (height.equals("small")){
			h = 60;
		}
		else if (height.equals("meduim")) {
			h = 120;
		}
		else {
			h = 250;
		}
		t.penDown();
		t.setPenColor(r, g, b);
		t.move(h);
		t.turn(45);
		t.move(20);
		t.turn(90);
		t.move(20);
		t.turn(45);
		t.move(h);
		t.turn(-90);
		t.move(30);
		t.turn(-90);	
	}
public static void drawFlatRoof(String height, int r, int g, int b) {
		
		int h = 0;
		if (height.equals("small")){
			h = 60;
		}
		else if (height.equals("meduim")) {
			h = 120;
		}
		else {
			h = 250;
		}
		t.penDown();
		t.setPenColor(r, g, b);
		t.move(h);
		t.turn(90);
		t.move(40);
		t.turn(90);
		t.move(h);
		t.turn(-90);
		t.move(30);
		t.turn(-90);	
	}
}