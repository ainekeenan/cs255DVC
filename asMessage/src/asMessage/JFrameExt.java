package asMessage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener{
	private JButton clickMe = new JButton("Click Me");
	private JButton click2 = new JButton("Click Me Too");
	private JTextField size = new JTextField(10);
	private JPanel main = new JPanel();
	private int count = 0;
	
	public JFrameExt() {
		super();
		
		
		
		FlowLayout fl = new FlowLayout();
		main.setLayout(fl);
		this.setContentPane(main);
		main.add(clickMe);
		main.add(size);
		main.add(click2);
		size.setEditable(false);
		clickMe.addActionListener(this);
		click2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == clickMe) {
			count ++;
			size.setText("Hello " +count);
		} else if(e.getSource() == click2) {
			count --;
			size.setText("Hello " +count);
		}
	}
	
	

}
