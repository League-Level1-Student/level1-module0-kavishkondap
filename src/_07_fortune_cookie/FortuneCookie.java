package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		new FortuneCookie().showButton();
	}

	public void showButton() {
		// System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You have a lot of wealth in your future");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will meet new people in the near future");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will travel far away in the future");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will have to try something new soon");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will have a successful future");
		}
	}
}
