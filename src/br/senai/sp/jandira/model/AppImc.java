package br.senai.sp.jandira.model;

public class AppImc {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setPeso("40");
        conta.setAltura("100");
        
        System.out.println(conta.calcularImc());
        System.out.println(conta.mostrarStatusImc());
	}

}
