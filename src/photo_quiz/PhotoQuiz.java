package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {

	public void run() throws Exception {
		int score = (0);
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String image = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Pearl_Winter_White_Russian_Dwarf_Hamster_-_Front.jpg/1200px-Pearl_Winter_White_Russian_Dwarf_Hamster_-_Front.jpg";
		Component comp = createImage(image);
		quizWindow.add(comp);
		quizWindow.pack();
		comp.addMouseMotionListener(this);
		String answer = JOptionPane.showInputDialog("Is this a hamster or a guinea pig?");
		if (answer.equals("hamster")){
			JOptionPane.showMessageDialog(null,"Correct");
			score +=1;
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect");
		}
		quizWindow.remove(comp);
		String imageTwo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq8BnFZUVdoTfERgJ_-xGcK2WOhwwFUERypWnif1HfmnvHJnEk";
		Component c = createImage(imageTwo);
		quizWindow.add(c);
		quizWindow.pack();
		String answerTwo = JOptionPane.showInputDialog("Is this a hamster or a guinea pig?");
		if (answerTwo.equals("guinea pig")){
			JOptionPane.showMessageDialog(null,"Correct");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect");
		}
		JOptionPane.showMessageDialog(null,"You scored " + score + " out of 2.");
		
		
		
		
		
		
		
		
		
		

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"mouse Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"mouse Moved");
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
