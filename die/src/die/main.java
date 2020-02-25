package die;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.BadLocationException;

public class main{
	private static int i = 0;
	public static void main(String[] args) {

	JFrame f = new JFrame("hello there ");
	f.setLayout(new FlowLayout ());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	JRadioButton r1 = new JRadioButton ("red");
	JRadioButton r2 = new JRadioButton ("green");
	ButtonGroup bg = new ButtonGroup ();
	bg.add(r1);
	bg.add(r2);
	
	JTextArea jta = new JTextArea(2 ,10);
	JScrollPane sp = new JScrollPane (jta);
	jta.setBackground(Color.white );
	JCheckBox c1 = new JCheckBox ("press",false);
	jta.setForeground(Color.red);
	jta.append("fuck society");
	jta.setEditable(false);
	jta.setToolTipText("wrie any thing u want (freedom //)");
	jta.setLineWrap(true);
	c1.setFont(new Font("Arial",Font.ITALIC,18));
	
	c1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (c1.isSelected())
				jta.setForeground(Color.blue);
			 
		}
	});
	f.add(r1);
	f.add(r2);
	f.add(sp);
	f.add(c1);
	f.pack();

	}

}
