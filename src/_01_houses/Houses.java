package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();
	public void run() {

	bob.setX(10);
	bob.setY(400);
	for (int i = 1; i < 11; i++) {
		drawHouse(15*i);
	}
	}
	public static void drawHouse(int height) {
		bob.setPenColor(0,0,0);
		bob.penDown();
		bob.setSpeed(75);
		bob.setPenWidth(7);
		bob.move(height);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(height);
		bob.setPenColor(9, 79, 23);
		bob.turn(-90);
		bob.move(30);
		bob.turn(-90);
	}
}
