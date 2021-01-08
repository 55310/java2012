package com.swcodingschool.guibasic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel btnLogin;
	private JTextField txtUserID;
	private JTextField textUserPWD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// 데이터베이스 연결
					if(DBUtill.dbconn == null)DBUtill.DBConnect();
					
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		btnLogin = new JPanel();
		btnLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(btnLogin);
		btnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Login Demo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(120, 22, 213, 33);
		btnLogin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserID");
		lblNewLabel_1.setBounds(88, 103, 57, 15);
		btnLogin.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(88, 141, 57, 15);
		btnLogin.add(lblNewLabel_2);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(191, 100, 116, 21);
		btnLogin.add(txtUserID);
		txtUserID.setColumns(20);
		
		textUserPWD = new JTextField();
		textUserPWD.setBounds(191, 138, 116, 21);
		btnLogin.add(textUserPWD);
		textUserPWD.setColumns(20);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 데이터베이스 연결
				if(DBUtil.dbconn == null)DBUtil.DBConnect();
				// 입력된 유저아이디와 비밀번호를 가져온다.
				String userid = txtUserID.getText();
				String userpwd = txtUserPWD.getText();
				// 유저아이디와 비밀번호를 사용하여  
				System.out.println();
				System.out.println();
				
			}
		});
		btnNewButton.setBounds(210, 184, 97, 23);
		btnLogin.add(btnNewButton);
	}
}
