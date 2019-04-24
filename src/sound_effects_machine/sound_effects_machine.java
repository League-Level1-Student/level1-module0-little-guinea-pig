package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener{
	
public static void main(String[] args) {
	new sound_effects_machine().run();
}
JButton button_one = new JButton();
JButton button_two = new JButton();
JButton button_three = new JButton();
void run() {
	JFrame frame = new JFrame();
	frame.setSize(1000,1000);
	JPanel panel = new JPanel();
	

	button_one.addActionListener( this);
	button_two.addActionListener( this);
	button_three.addActionListener( this);	
	panel.add(button_three);
	panel.add(button_two);
	panel.add(button_one);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button_one) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	else if(e.getSource() == button_two) {
		playSound("alien-spaceship_daniel_simion.wav");
	}
	else {
		playSound("labrador-barking-daniel_simon.wav");
	}
}
	

}
