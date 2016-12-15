package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Classes.Animal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Animal animal = new Animal("", "Animal");
		animal.aquatico = new Animal("Vive na Água", "Tubarão");
		animal.animal = new Animal("", "Macaco");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 290, 152);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPenseEmUm = new JLabel("Pense em um animal");
		lblPenseEmUm.setBounds(77, 11, 120, 14);
		frame.getContentPane().add(lblPenseEmUm);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				if (JOptionPane.showConfirmDialog(null,"O animal que você pensou vive na água?","Animal",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){					
					animal.aquatico.Perguntar();
				}else{										
					animal.animal.Perguntar();
				}			
			}					
		});
		btnOk.setBounds(90, 55, 89, 23);
		frame.getContentPane().add(btnOk);
	}
}
