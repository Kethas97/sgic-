import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ExcelAdd extends JFrame {
	private JTextField textField;
	
	JFileChooser fileChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcelAdd frame = new ExcelAdd();
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
	public ExcelAdd() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setBounds(100,100,400,400);
		
		JButton btnNewButton = new JButton("Add Excel File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
                textField.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}
		});
		btnNewButton.setBounds(84, 124, 99, 21);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(214, 125, 152, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 CsvToDb cs=new  CsvToDb();
				 cs.Data(fileChooser.getSelectedFile().getAbsolutePath());
				
				 JOptionPane.showMessageDialog(btnNewButton_1, "insert success", "added", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setBounds(157, 184, 89, 23);
		getContentPane().add(btnNewButton_1);
	}

}
