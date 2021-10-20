package br.senai.sp.jandira;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCalculadora {
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(400, 800);
		tela.setTitle("Cálculo de IMC");
		tela.setLayout(null); 
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálculo de IMC");
		lblTitulo.setBounds(20, 10, 100, 40);
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setBounds(20, 50, 70, 40);
		
		JTextField txtResposta = new JTextField();
		txtResposta.setBounds(90, 60, 90, 30);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura: ");
		lblAltura.setBounds(20, 90, 70, 40);
		
		JTextField txtSegundaResp = new JTextField();
		txtSegundaResp.setBounds(90, 95, 90, 30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(40, 133, 130, 20);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultados: ");
		lblResultado.setBounds(20, 150, 70, 40);
		
		JLabel lblValorIMC = new JLabel();
		lblValorIMC.setText("Valor IMC: ");
		lblValorIMC.setBounds(20, 179, 70, 40);
		
		JLabel lblEstado = new JLabel();
		lblEstado.setText("Estado IMC: ");
		lblEstado.setBounds(20, 210, 70, 40);
		
		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblPeso);
		tela.getContentPane().add(txtResposta);
		tela.getContentPane().add(lblAltura);
		tela.getContentPane().add(txtSegundaResp);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblValorIMC);
		tela.getContentPane().add(lblEstado);
		
		
		tela.setVisible(true);
		
		
	}

}
