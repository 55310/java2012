package com.swcodingschool.guibasic;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class GuestBook extends JFrame {
	private JTextField txtName;
	private JTextField txtNumber;
	private JTextField txtAddr;
	private JTextField txtNofP;
	private JTextField txtDateTime;
	DefaultTableModel model;
	private JTable GuestBookinfo;
	private int userid4update;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestBook frame = new GuestBook();
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
	public GuestBook() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("GuestBook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 538);
		getContentPane().setLayout(null);
		
		JButton btnWrite = new JButton("작성");
		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		 if(DBUtil.dbconn == null) DBUtil.DBConnect();
	
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("성 명");
				model.addColumn("전화번호");
				model.addColumn("주 소");
				model.addColumn("방문인원");
				model.addColumn("날짜/시간");
				
				
				
				//작성 버튼을 클릭했을 때
				String sql = "INSERT INTO guestb(GuestName, PoneNumber, GuestAddr, GuestNofP, GuestDateTime) VALUES(?,?,?,?,?)";
				String GuestName = txtName.getText();
				String PoneNumber = txtNumber.getText();
				String GuestAddr = txtAddr.getText();
				String GuestNofP = txtNofP.getText();
				String GuestDateTime = txtDateTime.getText();
				
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
					pstmt.setString(1, GuestName);
					pstmt.setInt(2, Integer.parseInt(PoneNumber));
					pstmt.setString(3, GuestAddr);					
					pstmt.setInt(4, Integer.parseInt(GuestNofP));									
					pstmt.setInt(5, Integer.parseInt(GuestDateTime));
					
					pstmt.execute();
					LoadTbl();
					
				}catch(SQLException einsert) {
					JOptionPane.showMessageDialog(null, "Insertion 오류가 발생하였습니다.");
					einsert.printStackTrace();
				}// end of try catch
				
			}

		});
		
		btnWrite.setFont(new Font("궁서", Font.BOLD, 12));
		btnWrite.setBounds(95, 401, 67, 23);
		getContentPane().add(btnWrite);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(208, 119, 441, 337);
		getContentPane().add(scrollPane);
		
		GuestBookinfo = new JTable();
		GuestBookinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 테이블의 임의 행을 클릭했을 때
				// 현재 행의 번호를 취하여, 행의 첫 컬럼에서 아이디값을 얻어
				// setTextField 메서드를 호출한다.
				// 호출된 메서드에서는 아이디값을 이용하여 데이터를 검색하여
				// 데이터아이템 텍스트필드에 뿌려준다.
				int row = GuestBookinfo.getSelectedRow();
				userid4update = Integer.parseInt(GuestBookinfo.getModel().getValueAt(row, 0).toString());
				
			
				
				
			}
		});
		
		scrollPane.setViewportView(GuestBookinfo);
		
		
		
		
		JPanel panel_GuestData = new JPanel();
		panel_GuestData.setBackground(Color.WHITE);
		panel_GuestData.setBounds(0, 119, 208, 283);
		getContentPane().add(panel_GuestData);
		panel_GuestData.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(80, 0, 116, 21);
		panel_GuestData.add(txtName);
		txtName.setColumns(10);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(80, 52, 116, 21);
		panel_GuestData.add(txtNumber);
		txtNumber.setColumns(10);
		
		txtNofP = new JTextField();
		txtNofP.setBounds(80, 176, 116, 21);
		panel_GuestData.add(txtNofP);
		txtNofP.setColumns(10);
		
		txtAddr = new JTextField();
		txtAddr.setBounds(80, 112, 116, 21);
		panel_GuestData.add(txtAddr);
		txtAddr.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("성명 :");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_1.setBounds(0, 0, 70, 21);
		panel_GuestData.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("전화번호 :");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_2.setBounds(-2, 52, 70, 21);
		panel_GuestData.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("주소 :");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_3.setBounds(0, 112, 70, 21);
		panel_GuestData.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("방문인원 :");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_4.setBounds(0, 176, 70, 21);
		panel_GuestData.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("날짜/시간\r\n :");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 233, 70, 15);
		panel_GuestData.add(lblNewLabel_5);
		
		txtDateTime = new JTextField();
		txtDateTime.setBounds(80, 231, 116, 18);
		panel_GuestData.add(txtDateTime);
		txtDateTime.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("방명록");
		lblNewLabel.setBounds(271, 10, 111, 50);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 35));
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("궁서", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnDelete.setBounds(95, 433, 67, 23);
		getContentPane().add(btnDelete);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 401, 208, 55);
		getContentPane().add(panel);
	}
	
	private void LoadTbl() {
		model = new DefaultTableModel();
		model.addColumn("성 명");
		model.addColumn("전화번호");
		model.addColumn("주 소");
		model.addColumn("방문인원");
		model.addColumn("날짜/시간");
		
		// 데이터베이스 연결이 안되어 있으면 연결
		if(DBUtil.dbconn == null) DBUtil.DBConnect();
		String sql = "SELECT * FROM guestb";
		
		try {
			PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				model.addRow(new Object[] {
						rs.getInt(1),      // bookid
						rs.getString(2),   // title
						rs.getString(3),   // author
						rs.getString(4),   // publisher
						rs.getInt(5)       // price
				});
			}// end of while
			rs.close();
			pstmt.close();
			
			GuestBookinfo.setModel(model);
			GuestBookinfo.setAutoResizeMode(0);
			GuestBookinfo.getColumnModel().getColumn(0).setPreferredWidth(50);//bookid
			GuestBookinfo.getColumnModel().getColumn(1).setPreferredWidth(150);//title
			GuestBookinfo.getColumnModel().getColumn(2).setPreferredWidth(80);//author
			GuestBookinfo.getColumnModel().getColumn(3).setPreferredWidth(80);//publisher
			GuestBookinfo.getColumnModel().getColumn(4).setPreferredWidth(50);//price
			
			JOptionPane.showMessageDialog(null, "테이블을 로딩하였습니다.");
			
		}catch(SQLException eload) {
			JOptionPane.showMessageDialog(null, "테이블 로딩 오류");
			eload.printStackTrace();
		}
		
		
	}// end of LoadTbl()
}
