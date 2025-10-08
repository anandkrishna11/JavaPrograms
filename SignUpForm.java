import javax.swing.*;
import java.awt.*;
public class SignUpForm {

	public static void main(String[] args) {
		JFrame mainFrame=new JFrame();
		mainFrame.setTitle("Sign Up Form");
		mainFrame.setSize(300,150);
		
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new GridLayout(6,2,10,10));
		
		JLabel nameLabel=new JLabel("Name");
		JTextField nameField=new JTextField();
		
		JLabel emailLabel=new JLabel("Email");
		JTextField emailField=new JTextField();
		
		JLabel genderLabel= new JLabel("Gender");
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		ButtonGroup genButtonGroup=new ButtonGroup();
		genButtonGroup.add(male);
		genButtonGroup.add(female);
		
		JPanel genderPanel=new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel= new JLabel("Country");
		String[] countries= {"India","China","USA"};
		JComboBox<String> countryBox = new JComboBox<>(countries);
		
		JLabel addressLabel=new JLabel("Address");
		JTextArea addressArea= new JTextArea(3,4);
		JButton submitbtn= new JButton("submit");
		mainPanel.add(nameLabel);mainPanel.add(nameField);
		mainPanel.add(emailLabel);mainPanel.add(emailField);
		mainPanel.add(genderLabel);
		mainPanel.add(genderPanel);
		mainPanel.add(countryLabel);mainPanel.add(countryBox);
		mainPanel.add(addressLabel);mainPanel.add(addressArea);
		mainPanel.add(new JLabel(""));mainPanel.add(submitbtn);
		mainFrame.add(mainPanel);
		
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		

	}

}
