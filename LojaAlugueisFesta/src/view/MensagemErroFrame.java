package view;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class MensagemErroFrame extends JFrame {

	private JPanel contentPane;

	public MensagemErroFrame(String mensagem) {
		setTitle("Erro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblErro = new JLabel("Erro:");
		lblErro.setBounds(19, 40, 61, 16);
		contentPane.add(lblErro);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeFrame();
			}
		});
		btnOk.setBounds(186, 118, 117, 29);
		contentPane.add(btnOk);
		
		JTextPane mensagemTextPane = new JTextPane();
		mensagemTextPane.setBackground(SystemColor.window);
		mensagemTextPane.setBounds(62, 40, 241, 66);
		mensagemTextPane.setText(mensagem);
		contentPane.add(mensagemTextPane);
	}
	
	private void closeFrame(){
		super.dispose();
	}
}
