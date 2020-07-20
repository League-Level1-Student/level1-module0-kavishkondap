import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkpoint implements KeyListener {
public  void stuff() {
	JFrame frame = new JFrame ();
	JLabel label = new JLabel ();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	label.setText("Stuff");
	frame.add(label);
	frame.pack();
	frame.addKeyListener(this);
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	speak("Ouch");
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}

