package asExceptionGame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener{

	private JPanel box = new JPanel();
	private JPanel central = new JPanel();
	
	private JPanel main = new JPanel();
	
	private JTextField tfGuess = new JTextField(15);
	private JTextArea jtaMessage = new JTextArea (10, 20);
	private JScrollPane jscrMessage = new JScrollPane (jtaMessage, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	private JLabel lblGuess = new JLabel("Enter Guess");
	

	private int guessCount = 0;
	private int gameCount = 0;
	
	Guess cat;
	private String message, userGuess;

	

	public JFrameExt() {
		super();
		
		this.setContentPane(main);
		/* FlowLayout fl = new FlowLayout();
		box.setLayout(fl); */
		
		main.add(box);
		main.add(central);
		box.add(lblGuess);
		box.add(tfGuess);
	
		
		central.add(jscrMessage);
		
		
		
		tfGuess.addActionListener(this);
		cat = new Guess();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == tfGuess) {
			guessCount ++;
			
			
			try {
				userGuess = tfGuess.getText();
				cat.checkGuess(userGuess);
				
				message = "Correct Guess" +"\n";
				
				gameCount ++;
				
				String out = "\nGuess count: " + guessCount + "\nGame count: " +gameCount +"\n";
				
				jtaMessage.append(out);
				
				cat = new Guess();
				
				
			} catch (GuessNotWholeNumberException e1) {
				message = e1.getMessage();
			} catch(GuessOutOfRangeException e1) {
				message = e1.getMessage();
			} catch (GuessTooSmallException e1) {
				message = e1.getMessage();
			} catch (GuessTooLargeException e1) {
				message = e1.getMessage();
			}
			
			finally {
			
				jtaMessage.append(message + "\n");
				jtaMessage.append ("Enter your guess above" + "\n");
				
				
			}
			
			
		}
		
		
	}

}
