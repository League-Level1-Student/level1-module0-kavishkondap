package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	 JButton button1 = new JButton ();
	  JButton button2 = new JButton ();
	  JButton button3 = new JButton ();
	public static void main(String[] args) {
	new SoundEffectsMachine().showButton();
}
public void showButton() {
  JFrame frame = new JFrame ();
  frame.setVisible(true);
  JPanel panel = new JPanel ();
  frame.add(panel);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  button1.addActionListener(this);
  button2.addActionListener(this);
  button3.addActionListener(this);
  panel.add(button1);
  panel.add(button2);
  panel.add(button3);
  frame.pack();
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
JButton buttonClicked = (JButton) e.getSource();
if(buttonClicked==button1) {
	playSound("cymbal.wav");
}else if (buttonClicked==button2) {
	playSound("homer-woohoo.wav");
}else if(buttonClicked==button3) {
	playSound("sawing-wood-daniel_simon.wav");
}
}

}
