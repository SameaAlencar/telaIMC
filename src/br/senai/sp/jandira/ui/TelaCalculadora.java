package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Conta;

public class TelaCalculadora {
	
	public void criarTela() {
		Font fontTitulo = new Font("Arial", Font.BOLD, 22);
		Font fontTexto = new Font("Arial", Font.PLAIN, 14);
		Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		Font fontResultado = new Font("Arial", Font.BOLD, 14);
		
		Color verde = new Color(0, 128, 0);
		Color azul = new Color(0, 0, 180);
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(400, 800);
		tela.setTitle("Cálculo de IMC");
		tela.setLayout(null); 
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setFont(fontTitulo);
		lblTitulo.setForeground(azul);
		lblTitulo.setText("Cálculo de IMC ");
		lblTitulo.setBounds(20, 10, 200, 40);
		
		JLabel lblPeso = new JLabel();
		lblPeso.setFont(fontSubtitulo);
		lblPeso.setText("Seu peso: ");
		lblPeso.setBounds(20, 50, 100, 40);
		
		JTextField txtResposta = new JTextField();
		txtResposta.setBounds(115, 60, 90, 30);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setFont(fontSubtitulo);
		lblAltura.setText("Sua altura: ");
		lblAltura.setBounds(15, 90, 100, 40);
		
		JTextField txtSegundaResp = new JTextField();
		txtSegundaResp.setBounds(115, 95, 90, 30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(40, 133, 200, 20);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setFont(fontSubtitulo);
		lblResultado.setText("Resultados: ");
		lblResultado.setBounds(20, 150, 140, 40);
		
		JLabel lblValorIMC = new JLabel();
		lblValorIMC.setFont(fontSubtitulo);
		lblValorIMC.setText("Valor IMC: ");
		lblValorIMC.setBounds(20, 190, 100, 40);
		
		
		JLabel lblExibirValorImc = new JLabel();
		lblExibirValorImc.setBounds(115, 190, 100, 40);
		lblExibirValorImc.setFont(fontSubtitulo);
		lblExibirValorImc.setForeground(verde);
		
		
		JLabel lblEstado = new JLabel();
		lblEstado.setFont(fontSubtitulo);
		lblEstado.setText("Estado IMC: ");
		lblEstado.setBounds(20, 235, 200, 40);
		
		JLabel lblExibirEstado = new JLabel();
		lblExibirEstado.setBounds(125, 190, 140, 133);
		lblExibirEstado.setFont(fontSubtitulo);
		lblExibirEstado.setForeground(verde);
		
		
		
		
		
		
		
		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblPeso);
		tela.getContentPane().add(txtResposta);
		tela.getContentPane().add(lblAltura);
		tela.getContentPane().add(txtSegundaResp);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblValorIMC);
		tela.getContentPane().add(lblEstado);
		tela.getContentPane().add(lblExibirValorImc);
		tela.getContentPane().add(lblExibirEstado);
		
		
		tela.setVisible(true);
		
		// Evento de botão
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Conta conta = new Conta();
				conta.setPeso(txtResposta.getText());
				conta.setAltura(txtSegundaResp.getText());
				
				lblExibirValorImc.setText(conta.mostrarString());
			
				lblExibirEstado.setText(conta.mostrarStatusImc());
				
			}
		});
		
		
	}

}
