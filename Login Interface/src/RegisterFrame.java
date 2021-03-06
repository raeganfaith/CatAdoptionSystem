import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterFrame extends JFrame {
	private Image img_neko = new ImageIcon(FrameLogin.class.getResource("res/logo.png")).getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtfname;
	private JTextField txtlname;
	private JTextField txtage;
	private JTextField txtaddress;
	private JTextField txtemail;
	private JTextField JsUsername;
	private JPasswordField jSPassword;
	private JPasswordField jSPassword2;
	private JLabel lblValidate = new JLabel("");
	private JTextField txtPrivacy;
	private JTextField txtAnd;
	private JTextField txtPrivacyPol;
	//public static ArrayList <String> email = new ArrayList();
	//public static ArrayList <String> username = new ArrayList();
	//public static ArrayList <String> password = new ArrayList();

	/**
	 * Launch the application.
	 */
	public void Back() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
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
	public RegisterFrame() {
		setBackground(new Color(204, 153, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 435);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setForeground(new Color(153, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 646, 132);
		panel.setBackground(new Color(153, 153, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNEKO1 = new JLabel("");
		lblNEKO1.setBounds(55, 0, 200, 125);
		panel.add(lblNEKO1);
		lblNEKO1.setIcon(new ImageIcon(img_neko));
		
		
		
		JLabel lblREGISTER = new JLabel("REGISTER HERE!");
		lblREGISTER.setBounds(232, 38, 305, 60);
		panel.add(lblREGISTER);
		lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
		lblREGISTER.setFont(new Font("Cher Faust", Font.PLAIN, 30));
		
		JLabel lblbtnClose = new JLabel("X");
		lblbtnClose.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					RegisterFrame.this.dispose();
				}			
			}		
			@Override
			public void mouseEntered(MouseEvent e) {
				lblbtnClose.setForeground(Color.RED);
			}		
			@Override
			public void mouseExited(MouseEvent e) {
				lblbtnClose.setForeground(Color.BLACK);
			}
			
		});
		lblbtnClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblbtnClose.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblbtnClose.setBounds(615, 0, 31, 31);
		panel.add(lblbtnClose);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(49, 173, 100, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(49, 202, 114, 19);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblLastName);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(323, 202, 76, 19);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(323, 231, 76, 19);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password:");
		lblReenterPassword.setBounds(323, 264, 147, 19);
		lblReenterPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblReenterPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(323, 173, 76, 19);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblEmail);
		
		txtfname = new JTextField();
		txtfname.setBounds(141, 175, 147, 19);
		contentPane.add(txtfname);
		txtfname.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(49, 231, 76, 19);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender: ");
		lblGender.setBounds(49, 256, 76, 19);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(49, 282, 76, 19);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblAddress);
		
		txtlname = new JTextField();
		txtlname.setBounds(141, 204, 147, 19);
		txtlname.setColumns(10);
		contentPane.add(txtlname);
		
		txtage = new JTextField();
		txtage.setBounds(141, 231, 147, 19);
		txtage.setColumns(10);
		contentPane.add(txtage);
		
		txtaddress = new JTextField();
		txtaddress.setBounds(141, 284, 147, 37);
		txtaddress.setColumns(10);
		contentPane.add(txtaddress);
		
		txtemail = new JTextField();
		txtemail.setBounds(458, 175, 163, 19);
		txtemail.setColumns(10);
		contentPane.add(txtemail);
		
		JsUsername = new JTextField();
		JsUsername.setBounds(458, 202, 163, 19);
		JsUsername.setColumns(10);
		contentPane.add(JsUsername);
		
		JCheckBox PrivacyTerms = new JCheckBox("I have read and agree to the ");
		PrivacyTerms.setBounds(141, 347, 183, 21);
		contentPane.add(PrivacyTerms);
		PrivacyTerms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PrivacyTerms.setBackground(new Color(204, 153, 102));
		
		//Array
		//ArrayList<String[]> listOfUser = new ArrayList<String[]>();
		
		
		JPanel jSRegister = new JPanel();
		jSRegister.setBounds(141, 377, 172, 48);
		//ArrayList<String[]> listOfUser = new ArrayList<String[]>();
		
		jSRegister.addMouseListener(new MouseAdapter() {
			
			//Registration Validation:
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLogin create = new FrameLogin();
				//FrameDashboard second = new FrameDashboard();
				//second.setVisible(true);
				String fname, lname, age, address,  email, user, pass, pass2;
				boolean privacy;
				fname = txtfname.getText();
				lname = txtlname.getText();
				age = txtage.getText();
				address = txtaddress.getText();
				email = txtemail.getText();
				user = JsUsername.getText();
				pass = jSPassword.getText();
				pass2 =jSPassword2.getText();
				privacy = PrivacyTerms.isSelected();
				
				if (fname.equals("") ||lname.equals("") || age.equals("") || address.equals("")|| 
						email.equals("")||pass.equals("")) {
					lblValidate.setText("Please input all requirements!");
				} else if(!(new String(jSPassword.getPassword()).equals(new String(jSPassword2.getPassword())))) {
						lblValidate.setText("Password didn't match!");
					
				} else if (privacy ==  false) {
					lblValidate.setText("Please agree to the Privacy and Terms Conditions!");
				}
				else {
					FrameLogin.email.add(email);
					FrameLogin.username.add(user);
					FrameLogin.password.add(pass);
						
					create.Back();
					create.setVisible(true);
				JOptionPane.showMessageDialog(null, "Registered!");
				RegisterFrame.this.dispose();
				SecurityQuestion secure = new SecurityQuestion();
				secure.setVisible(true);			
				}	
			}
				/**if(txtfname.getText().equals("") ||txtlname.getText().equals("") ||txtage.getText().equals("") ||
						txtaddress.getText().equals("") || txtemail.getText().equals("")||
						JsUsername.getText().equals("") || jSPassword.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Incomplete Input!");
					//lblValidate.setText("");
					//RegisterFrame.this.dispose();			
					//RegisterFrame second = new RegisterFrame();
					//second.setVisible(true);		
					if(txtpassword2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Validate your password!");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Successfully Registered!");
					FrameLogin framelogin = new FrameLogin();
					framelogin.setVisible(true);
					RegisterFrame.this.dispose();
				}		
				}**/
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jSRegister.setBackground(new Color(230, 130, 130));
			}	
			@Override
			public void mouseExited(MouseEvent e) {
				jSRegister.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				jSRegister.setBackground(new Color(285, 183, 183));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				jSRegister.setBackground(new Color(230, 130, 130));
			}
			
		});
		jSRegister.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		jSRegister.setBackground(new Color(255, 153, 204));
		contentPane.add(jSRegister);
		jSRegister.setLayout(null);
		
		JLabel lblbuttonRegister = new JLabel("REGISTER");
		lblbuttonRegister.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblbuttonRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblbuttonRegister.setBounds(20, 10, 131, 28);
		jSRegister.add(lblbuttonRegister);
		
		JRadioButton rdbFemale = new JRadioButton("Female");
		rdbFemale.setBounds(141, 257, 76, 21);
		rdbFemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbFemale.setBackground(new Color(204, 153, 102));
		contentPane.add(rdbFemale);
		
		JRadioButton rdbMale = new JRadioButton("Male");
		rdbMale.setBounds(222, 257, 76, 21);
		rdbMale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbMale.setBackground(new Color(204, 153, 102));
		contentPane.add(rdbMale);
		
		
		
		JLabel lblAGE = new JLabel("");
		lblAGE.setBounds(10, 231, 29, 23);
		lblAGE.setForeground(Color.RED);
		contentPane.add(lblAGE);
		
		JLabel lblLN = new JLabel("");
		lblLN.setBounds(10, 202, 29, 23);
		lblLN.setForeground(Color.RED);
		contentPane.add(lblLN);
		
		JLabel lblADDRESS = new JLabel("");
		lblADDRESS.setBounds(10, 287, 29, 23);
		lblADDRESS.setForeground(Color.RED);
		contentPane.add(lblADDRESS);
		
		JLabel lblGENDER = new JLabel("");
		lblGENDER.setBounds(10, 258, 29, 23);
		lblGENDER.setForeground(Color.RED);
		contentPane.add(lblGENDER);
		
		JLabel lblEMAIL = new JLabel("");
		lblEMAIL.setBounds(293, 173, 20, 23);
		lblEMAIL.setForeground(Color.RED);
		contentPane.add(lblEMAIL);
		
		JLabel lblUSER = new JLabel("");
		lblUSER.setBounds(293, 207, 20, 23);
		lblUSER.setForeground(Color.RED);
		contentPane.add(lblUSER);
		
		JLabel lblPASS = new JLabel("");
		lblPASS.setBounds(293, 236, 20, 23);
		lblPASS.setForeground(Color.RED);
		contentPane.add(lblPASS);
		
		JLabel lblPASS2 = new JLabel("");
		lblPASS2.setBounds(293, 269, 20, 23);
		lblPASS2.setForeground(Color.RED);
		contentPane.add(lblPASS2);
		
		JPanel panelClear = new JPanel();
		panelClear.setBounds(341, 377, 172, 48);
		panelClear.addMouseListener(new MouseAdapter() {
			//To clear or reset
			@Override
			public void mouseClicked(MouseEvent e) {
				txtfname.setText("");
				txtlname.setText("");
				txtage.setText("");
				txtaddress.setText("");
				txtemail.setText("");
				JsUsername.setText("");
				jSPassword.setText("");
				jSPassword2.setText("");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				panelClear.setBackground(new Color(230, 130, 130));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panelClear.setBackground(new Color(255, 153, 153));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panelClear.setBackground(new Color(285, 183, 183));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				panelClear.setBackground(new Color(230, 130, 130));
			}
		});
		panelClear.setLayout(null);
		panelClear.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		panelClear.setBackground(new Color(255, 153, 204));
		contentPane.add(panelClear);
		
		JLabel lblClear = new JLabel("CLEAR");
		lblClear.setHorizontalAlignment(SwingConstants.CENTER);
		lblClear.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblClear.setBounds(20, 10, 131, 28);
		panelClear.add(lblClear);
		
		jSPassword = new JPasswordField();
		jSPassword.setBounds(458, 233, 163, 19);
		jSPassword.setEchoChar('*');
		jSPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(jSPassword);
		
		jSPassword2 = new JPasswordField();
		jSPassword2.setBounds(458, 266, 163, 19);
		jSPassword2.setEchoChar('*');
		jSPassword2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(jSPassword2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBounds(505, 283, 116, 21);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					jSPassword.setEchoChar((char)0);
					jSPassword2.setEchoChar((char)0);
				}else {
					jSPassword.setEchoChar('*');
					jSPassword2.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(new Color(204, 153, 102));
		contentPane.add(chckbxNewCheckBox);
		
		//JLabel lblValidate = new JLabel(".");
		//lblValidate.setHorizontalAlignment(SwingConstants.CENTER);
		//lblValidate.setForeground(Color.RED);
		//lblValidate.setBounds(172, 389, 341, 21);
		//contentPane.add(lblValidate);
		setUndecorated(true);
		lblValidate.setBounds(151, 320, 362, 21);
		lblValidate.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblValidate);
		lblValidate.setForeground(new Color(204, 0, 0));
		lblValidate.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		
		
		txtPrivacy = new JTextField();
		txtPrivacy.setBounds(323, 348, 76, 19);
		txtPrivacy.setForeground(new Color(0, 102, 204));
		txtPrivacy.setBorder(null);
		txtPrivacy.setBackground(new Color(204, 153, 102));
		txtPrivacy.setText("Terms of Use");
		txtPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(txtPrivacy);
		txtPrivacy.setColumns(10);
		
		txtAnd = new JTextField();
		txtAnd.setBounds(400, 348, 20, 19);
		txtAnd.setText("and");
		txtAnd.setForeground(new Color(0, 0, 0));
		txtAnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAnd.setColumns(10);
		txtAnd.setBorder(null);
		txtAnd.setBackground(new Color(204, 153, 102));
		contentPane.add(txtAnd);
		
		txtPrivacyPol = new JTextField();
		txtPrivacyPol.setText(" Privacy Policy.");
		txtPrivacyPol.setForeground(new Color(0, 102, 204));
		txtPrivacyPol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrivacyPol.setColumns(10);
		txtPrivacyPol.setBorder(null);
		txtPrivacyPol.setBackground(new Color(204, 153, 102));
		txtPrivacyPol.setBounds(419, 348, 83, 19);
		contentPane.add(txtPrivacyPol);
	}
}
