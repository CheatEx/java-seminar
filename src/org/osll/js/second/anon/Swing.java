package org.osll.js.second.anon;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Swing extends JDialog {
	
	public Swing() {
		this.setTitle("Demo dialog");
		
		this.getContentPane().setLayout(new BorderLayout());
		
		final JLabel l = new JLabel("I'm a label");
		this.getContentPane().add(l, BorderLayout.NORTH);
		
		JButton b = new JButton("Press me!");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText("Ouch!");
			}
		});
		this.getContentPane().add(b, BorderLayout.SOUTH);

		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing();
	}

}
