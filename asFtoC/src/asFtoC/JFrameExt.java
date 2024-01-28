package asFtoC;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener {
	
	private JButton FtoC = new JButton("F to C");
	private JButton CtoF = new JButton("C to F");
	private JTextField tfFrom = new JTextField (10);
	private JTextField tfTo = new JTextField(10);
	private JPanel pnlMain = new JPanel();
	private JPanel pnlFrom = new JPanel();
	private JPanel pnlTo = new JPanel();
	private JPanel pnlClick = new JPanel();
	private JLabel lblFrom = new JLabel("From");
	private JLabel lblTo = new JLabel("To");
	
	public JFrameExt() {
		super();
		
		this.setContentPane(pnlMain);
		
		setTitle("Converter");
		setSize(400,200);
		setVisible(true);
		GridLayout gl = new GridLayout(3,1);
		pnlMain.setLayout(gl);
		pnlMain.add(pnlFrom);
		pnlMain.add(pnlTo);
		pnlMain.add(pnlClick);
		pnlFrom.setBackground(Color.red);
		pnlTo.setBackground(Color.green);
		pnlClick.setBackground(Color.magenta);
		pnlFrom.add(lblFrom);
		pnlFrom.add(tfFrom);
		pnlTo.add(lblTo);
		pnlTo.add(tfTo);
		tfTo.setEditable(false);
		pnlClick.add(FtoC);
		pnlClick.add(CtoF);
		
		
		FtoC.addActionListener(this);
		CtoF.addActionListener(this);
		
	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sFrom, sTo;
		double dFrom, dTo;
		
		sFrom = tfFrom.getText().trim();
		dFrom = Double.parseDouble(sFrom);
		
		if(e.getSource() == FtoC) {
			dTo = 5.0/9.0 * (dFrom - 32.0);
	        sTo = "" + dTo;
			tfTo.setText(sTo);
		} else if(e.getSource() == CtoF) {
			dTo = (9.0/5.0 *dFrom) + 32.0;
	        sTo = "" + dTo;
			tfTo.setText(sTo);
		}
	}

}
