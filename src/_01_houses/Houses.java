package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();

	public void run() {
		bob.setWindowColor(0, 0, 0);
		bob.setX(10);
		bob.setY(400);
		drawHouse("medium", "red");
		drawHouse("large", "blue");
		drawHouse("small", "green");
		drawHouse("large", "random");
		drawHouse("small", "random");
		drawHouse("medium", "random");
		drawHouse("large", "random");
		drawHouse("small", "random");
		
	}

	public static void drawHouse(String height, String color) {
		if (color.equals("red")) {
			bob.setPenColor(255, 0, 0);
		} else if (color.equals("green")) {
			bob.setPenColor(0, 255, 0);
		} else if (color.equals("blue")) {
			bob.setPenColor(0, 0, 255);
		} else {
			bob.setRandomPenColor();
		}
		int size;
		if (height.equals("small")) {
			size = 60;
		} else if (height.equals("medium")) {
			size = 120;
		} else {
			size = 250;
		}
		bob.penDown();
		bob.setSpeed(75);
		bob.setPenWidth(7);
		bob.move(size);
		if (size == 250) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		bob.move(size);
		bob.setPenColor(9, 79, 23);
		bob.turn(-90);
		bob.move(30);
		bob.turn(-90);
		if (color.equals("red")) {
			bob.setPenColor(255, 0, 0);
		} else if (color.equals("green")) {
			bob.setPenColor(0, 255, 0);
		} else if (color.equals("blue")) {
			bob.setPenColor(0, 0, 255);
		} else {
			bob.setRandomPenColor();
		}
	}

	public static void drawPointyRoof() {
		bob.turn(45);
		bob.move(25);
		bob.turn(90);
		bob.move(25);
		bob.turn(45);
	}

	public static void drawFlatRoof() {
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
	}

}
