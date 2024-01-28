package asCalculator;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener{

	private JButton add = new JButton("Add");
	private JButton sub = new JButton("Sub");
	private JButton mult = new JButton("Mult");
	private JButton div = new JButton("Div");
	private JButton clear = new JButton("Clear");
	
	private JTextField tfNumOne = new JTextField (10);
	private JTextField tfNumTwo = new JTextField(10);
	private JTextField tfResult = new JTextField(10);
	private JPanel pnlMain = new JPanel();
	private JPanel pnlNumOne = new JPanel();
	private JPanel pnlNumTwo = new JPanel();
	private JPanel pnlResult = new JPanel();
	private JPanel pnlClick = new JPanel();
	private JLabel lblNumOne = new JLabel("Number 1");
	private JLabel lblNumTwo = new JLabel("Number 2");
	private JLabel lblresult = new JLabel("Result");
	
	public JFrameExt() {
		super();
		
		this.setContentPane(pnlMain);
		
		setTitle("Calculator");
		setSize(400,200);
		setVisible(true);
		GridLayout gl = new GridLayout(4,1);
		pnlMain.setLayout(gl);
		pnlMain.add(pnlNumOne);
		pnlMain.add(pnlNumTwo);
		pnlMain.add(pnlResult);
		pnlMain.add(pnlClick);
		pnlNumOne.setBackground(Color.green);
		pnlNumTwo.setBackground(Color.red);
		pnlResult.setBackground(Color.cyan);
		pnlClick.setBackground(Color.magenta);
		pnlNumOne.add(lblNumOne);
		pnlNumOne.add(tfNumOne);
		pnlNumTwo.add(lblNumTwo);
		pnlNumTwo.add(tfNumTwo);
		pnlResult.add(lblresult);
		pnlResult.add(tfResult);
		tfResult.setEditable(false);
		pnlClick.add(add);
		pnlClick.add(sub);
		pnlClick.add(mult);
		pnlClick.add(div);
		pnlClick.add(clear);
		
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sNumOne, sNumTwo, sNumAll;
		double dNumOne, dNumTwo, dNumAll;
		
		sNumOne = tfNumOne.getText().trim();
		dNumOne = Double.parseDouble(sNumOne);
		
		sNumTwo = tfNumTwo.getText().trim();
		dNumTwo = Double.parseDouble(sNumTwo);
		
		if(e.getSource()== add) {
			dNumAll = (dNumOne) + (dNumTwo);
			sNumAll = "" +dNumAll;
			tfResult.setText(sNumAll);
		} else if (e.getSource() == sub) {
			dNumAll = dNumOne - dNumTwo;
			sNumAll = "" +dNumAll;
			tfResult.setText(sNumAll);
		} else if (e.getSource() == mult) {
			dNumAll = dNumOne * dNumTwo;
			sNumAll = "" +dNumAll;
			tfResult.setText(sNumAll);
	} else if (e.getSource() == div) {
		dNumAll = dNumOne/ dNumTwo;
		sNumAll = "" +dNumAll;
		tfResult.setText(sNumAll);
} else if(e.getSource() == clear){
	tfNumOne.setText("");
	tfNumTwo.setText("");
	tfResult.setText("");
	
}
		} 
	
}
