package br.senai.sp.jandira.model;

public class Conta {


		private double peso;
		private double altura;
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(String altura) {
			this.altura = Double.parseDouble(altura);
		}
		
		public double getPeso() {
			return peso;
		}
		public void setPeso(String peso) {
			this.peso = Double.parseDouble(peso);
		}
		
		
		
		public double calcularImc() {
			double imc = peso / Math.pow(altura, 2);
		  return imc;
			
		}
		
		public String mostrarString() {
			return String.valueOf(calcularImc());
			
		}
		
		public String mostrarStatusImc() {
			if (calcularImc() < 18.5) {
				return "Abaixo do peso!";
				
			}else if(calcularImc() >= 18.6 && calcularImc() < 24.9 ) {
				return "Peso ideal!";
			}else if (calcularImc()>= 25 && calcularImc() < 29.9) {
				return "Levemente acima do peso!";
			}else if (calcularImc() >= 30 && calcularImc()< 34.9) {
				return "Obesidade Grau I!";
			}else if (calcularImc() >= 35 && calcularImc() < 40) {
				return "Obesidade Grau II!";
			}else {
				return "Obesidade III mórbida";
			}
			
			
			
			
				
			
			
			
			
			
			
			
		}
		
		
		
		

	

}
