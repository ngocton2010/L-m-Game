package entity;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.border.TitledBorder;


import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JTextField;


public class Programs extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4249210565441581027L;
	private JPanel contentPane;
	private int random;

	
	private JButton btnNewButton_12;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_13;
	private JButton btnNewButton_4;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_6_1;
	private JButton btnNewButton_6_2;
	private JButton btnNewButton_14;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Programs() {
		
		
		try {
			setIconImage(ImageIO.read(new File("Resources/original.JPG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 0, 551);
		contentPane.add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 551, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Khung Game", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)), "Khung Game", TitledBorder.LEADING, TitledBorder.TOP, null, UIManager.getColor("Button.background")));
		panel_1.setToolTipText("");
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(25, 31, 668, 535);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
	
		
		
//		Image image = new ImageIcon(getClass().getResource("/Game/icon/icon" + random + ".jpg")).getImage();
//		Icon icon = new ImageIcon(image.getScaledInstance(width, height, image.SCALE_SMOOTH));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 22, 208, 157);
		btnNewButton.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(new ImageIcon("Resources/" + 1 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(228, 22, 208, 157);
		btnNewButton_1.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon(new ImageIcon("Resources/" + 2 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(446, 22, 212, 157);
		btnNewButton_2.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon(new ImageIcon("Resources/" + 3+ ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(10, 190, 208, 157);
		btnNewButton_3.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setIcon(new ImageIcon(new ImageIcon("Resources/" + 4 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(228, 189, 208, 157);
		btnNewButton_4.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setIcon(new ImageIcon(new ImageIcon("Resources/" + 5 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(446, 190, 212, 157);
		btnNewButton_5.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setIcon(new ImageIcon(new ImageIcon("Resources/" + 6 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(10, 358, 208, 157);
		btnNewButton_6.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setIcon(new ImageIcon(new ImageIcon("Resources/" + 7 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_6);
		
		btnNewButton_6_1 = new JButton("");
		btnNewButton_6_1.setBounds(228, 357, 208, 157);
		btnNewButton_6_1.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_6_1.setBorder(null);
		btnNewButton_6_1.setIcon(new ImageIcon(new ImageIcon("Resources/" + 8 + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_6_1);
		
		btnNewButton_14 = new JButton("");
		btnNewButton_14.setBounds(446, 358, 212, 157);
		btnNewButton_14.setIcon(new ImageIcon("Resources/" + random + ".jpg"));
		btnNewButton_14.setBorder(null);
		btnNewButton_14.setIcon(new ImageIcon(new ImageIcon("Resources/" + null + ".jpg").getImage().getScaledInstance(208, 157, Image.SCALE_SMOOTH)));
		panel_1.add(btnNewButton_14);

		

		
		
		try {
			BufferedImage imageIO=ImageIO.read(new File("Resources/original.JPG"));

			JLabel picLabel = new JLabel(new ImageIcon(imageIO));
			picLabel.setBounds(20, 28, 521, 319);
		
			
			picLabel.setIcon(new ImageIcon(new ImageIcon(imageIO).getImage().getScaledInstance(550, 350, Image.SCALE_DEFAULT)));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "\u1EA2nh g\u1ED1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(782, 31, 562, 370);
			panel_2.setLayout(null);
			
		
			panel_2.add(picLabel);
			contentPane.add(panel_2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnNewButton_7 = new JButton("<< Bước Lùi");
		btnNewButton_7.setBounds(259, 604, 116, 42);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Bước Tới >>");
		btnNewButton_8.setBounds(397, 604, 116, 42);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("CHƠI LẠI");
		btnNewButton_9.setBounds(780, 606, 89, 42);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("TẠM DỪNG");
		btnNewButton_10.setBounds(890, 606, 103, 42);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("GIẢI BFS");
		btnNewButton_11.setBounds(1023, 606, 89, 42);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("GIẢI TỐI ƯU");
		btnNewButton_12.setBounds(1142, 606, 103, 42);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("THOÁT");
		btnNewButton_13.setBounds(1255, 604, 89, 42);
		contentPane.add(btnNewButton_13);
		
		JLabel lblNewLabel = new JLabel("SỐ BƯỚC DUYỆT");
		lblNewLabel.setBounds(849, 514, 132, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SỐ BƯỚC ĐI");
		lblNewLabel_1.setBounds(66, 604, 116, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("THỜI GIAN GIẢI");
		lblNewLabel_2.setBounds(849, 483, 132, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDongHo = new JLabel();
		lblDongHo.setBounds(862, 412, 328, 60);
		contentPane.add(lblDongHo);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(1020, 483, 235, 36);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(138, 604, 62, 42);
		contentPane.add(lblNewLabel_4);
		
		
		setSize(1650,800);
		setTitle("Game xếp hình");
		setLocationRelativeTo(null);
		
		btnNewButton_13.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if (o.equals(btnNewButton_13)) {
			int thoat=JOptionPane.showConfirmDialog(this, "Bạn Có Muốn Thoát Không??", "Thoát", JOptionPane.YES_NO_OPTION);
			if (thoat==JOptionPane.YES_OPTION) {
				System.exit(1);
			}
			
		}
		if(o.equals(btnNewButton_10)) {
			
		}
		
	}

}
