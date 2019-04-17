package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();		
		frame.setSize(1000, 1000);
		JButton button = new JButton();
		frame.add(button);		
		button.addActionListener((ActionListener) this);

		
		
		System.out.println("Button Clicked");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, ":)");
			
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, ":(");
			
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, ":D");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, ">:(");
			
		}
		else {
			JOptionPane.showMessageDialog(null, ":|");
		}
		JOptionPane.showMessageDialog(null, "Woohoo!");
		// TODO Auto-generated method stub
		
	}

}

