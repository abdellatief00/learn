package die;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f  = new JFrame ();
		JPanel panel = new JPanel();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPasswordField p1 =new JPasswordField (10);
		JPasswordField p2 = new JPasswordField (10);
		JLabel l1 = new JLabel ("password");
		JLabel l2 = new JLabel ("confirm password");
		JButton b1 = new JButton ("ok");
		f.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(3,2,20,30));
		char [] pass = {'1','2','3','4','5'};	
		panel.add(l1);
		panel.add(p1);
		panel.add(l2);
		panel.add(p2);
		panel.add(b1);
		f.add(BorderLayout.CENTER,panel);
		
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			char [] p1pass = p1.getPassword();
			char[] p2pass = p1.getPassword();
		if (!(Arrays.equals(p1pass, p2pass))) 
			JOptionPane.showMessageDialog(null, "passwrd doesnt match");
		else if (!(Arrays.equals(pass, p1pass)))
			JOptionPane.showMessageDialog(null, "wrong pass");
		else
			JOptionPane.showMessageDialog(null, "congratiulation your pass is ok");
			
		}
		
	});
	
	f.setSize(400, 300);
	
	
	}

}
