package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener {
	public static void main(String[] args) {
		new cuteness_tv().run1();
}
	JButton button_one = new JButton();
	JButton button_two = new JButton();
	JButton button_three = new JButton();
	void run1() {
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

	private void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button_one) {
			showDucks();
		}
		else if(e.getSource() == button_two) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
		
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
