package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dham {

	private JFrame frmCalculater;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dham window = new dham();
					window.frmCalculater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dham() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculater = new JFrame();
		frmCalculater.setFont(new Font("Dialog", Font.BOLD, 12));
		frmCalculater.setForeground(new Color(220, 20, 60));
		frmCalculater.setTitle("CALCULATER");
		frmCalculater.getContentPane().setBackground(new Color(135, 206, 250));
		frmCalculater.setBackground(new Color(0, 0, 0));
		frmCalculater.setBounds(100, 100, 479, 533);
		frmCalculater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculater.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(68, 41, 341, 67);
		frmCalculater.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbac = new JButton("<--");
		btnbac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bcs=null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bcs=str.toString();
					textField.setText(bcs);
				}
			}
		});
		btnbac.setBackground(new Color(245, 222, 179));
		btnbac.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnbac.setBounds(68, 128, 60, 60);
		frmCalculater.getContentPane().add(btnbac);
		
		JButton btncut = new JButton("C");
		btncut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btncut.setFont(new Font("Tahoma", Font.BOLD, 18));
		btncut.setBackground(new Color(245, 222, 179));
		btncut.setBounds(155, 128, 60, 60);
		frmCalculater.getContentPane().add(btncut);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn00.getText();
				textField.setText(num);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBackground(new Color(245, 222, 179));
		btn00.setBounds(239, 128, 60, 60);
		frmCalculater.getContentPane().add(btn00);
		
		JButton btnmud = new JButton("%");
		btnmud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmud.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmud.setBackground(new Color(245, 222, 179));
		btnmud.setBounds(326, 128, 60, 60);
		frmCalculater.getContentPane().add(btnmud);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(new Color(245, 222, 179));
		btn7.setBounds(68, 198, 60, 60);
		frmCalculater.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(new Color(245, 222, 179));
		btn8.setBounds(155, 198, 60, 60);
		frmCalculater.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(new Color(245, 222, 179));
		btn9.setBounds(239, 198, 60, 60);
		frmCalculater.getContentPane().add(btn9);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBackground(new Color(245, 222, 179));
		btnmul.setBounds(326, 198, 60, 60);
		frmCalculater.getContentPane().add(btnmul);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(new Color(245, 222, 179));
		btn4.setBounds(68, 268, 60, 60);
		frmCalculater.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(new Color(245, 222, 179));
		btn5.setBounds(155, 268, 60, 60);
		frmCalculater.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num =textField.getText()+btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(new Color(245, 222, 179));
		btn6.setBounds(239, 268, 60, 60);
		frmCalculater.getContentPane().add(btn6);
		
		JButton btnmins = new JButton("-");
		btnmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnmins.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmins.setBackground(new Color(245, 222, 179));
		btnmins.setBounds(326, 268, 60, 60);
		frmCalculater.getContentPane().add(btnmins);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(new Color(245, 222, 179));
		btn1.setBounds(68, 338, 60, 60);
		frmCalculater.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(new Color(245, 222, 179));
		btn2.setBounds(155, 338, 60, 60);
		frmCalculater.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(new Color(245, 222, 179));
		btn3.setBounds(239, 338, 60, 60);
		frmCalculater.getContentPane().add(btn3);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBackground(new Color(245, 222, 179));
		btnplus.setBounds(326, 338, 60, 60);
		frmCalculater.getContentPane().add(btnplus);
		
		JButton btnzro = new JButton("0");
		btnzro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnzro.getText();
				textField.setText(num);
			}
		});
		btnzro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnzro.setBackground(new Color(245, 222, 179));
		btnzro.setBounds(68, 409, 60, 60);
		frmCalculater.getContentPane().add(btnzro);
		
		JButton btnequl = new JButton("=");
		btnequl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				
				}
			}
		});
		btnequl.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequl.setBackground(new Color(245, 222, 179));
		btnequl.setBounds(155, 409, 60, 60);
		frmCalculater.getContentPane().add(btnequl);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num =textField.getText()+btnpoint.getText();
				textField.setText(num);
			}
		});
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnpoint.setBackground(new Color(245, 222, 179));
		btnpoint.setBounds(239, 409, 60, 60);
		frmCalculater.getContentPane().add(btnpoint);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBackground(new Color(245, 222, 179));
		btndiv.setBounds(326, 409, 60, 60);
		frmCalculater.getContentPane().add(btndiv);
	}
}
