package asDraw;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExt extends JFrame implements ActionListener{
	private JButton happy = new JButton("Happy");
	private JButton sad = new JButton("Sad");
	private JButton random = new JButton("Random");
	private JPanelExt picture = new JPanelExt();
	private JPanel buttons = new JPanel();
	private JPanel main = new JPanel();
	
	
	
	public JFrameExt() {
		super();
		this.setContentPane(main);
		setVisible(true);
		setSize(400,700);
		GridLayout gl = new GridLayout(2,1);
		main.setLayout(gl);
		
		main.add(picture);
		main.add(buttons);
		
		buttons.add(happy);
		buttons.add(sad);
		buttons.add(random);
		
		buttons.setBackground(Color.green);
		picture.setBackground(Color.yellow);
		
		happy.addActionListener(this);
		sad.addActionListener(this);
		random.addActionListener(this);
		
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== happy) {
			picture.setPictureType("Happy");
			
		} 
		if(e.getSource()== sad) {
			picture.setPictureType("Sad");
		} 
		if(e.getSource()== random) {
			picture.setPictureType("Random");
		}
		
	}
	
	

	}

