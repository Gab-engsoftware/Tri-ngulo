package br.ucsal;

import javax.swing.JOptionPane;

public class ProjetoTriangulo {

	public static void main(String[] args) {
	
		double a,b,c;
		
a= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro lado do tri�ngulo: "));	
b= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo lado do tri�ngulo: "));
c= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro lado do tri�ngulo: "));


if ((((a<(b+c)) && (a >(Math.abs (b-c))) && ((b< (a+c)) && (b > (Math.abs (a-c)))) && ((c<(b+a)) && (c>(Math.abs (b-a))))))){
	
	if(((a==b)) && (b==c) && (a==c)){
		
		JOptionPane.showMessageDialog(null, "� um tri�ngulo Equilatero!");	
	}
	
	if(((a!=b)) && (b!=c) && (a!=c)){

		JOptionPane.showMessageDialog(null, "� um tri�ngulo Escaleno!");	
	}
	
	if(((a==b) && (b!=c)) || ( (b==c) && (c!=a) || (a==c) && (c!=b)) ) {
		
		JOptionPane.showMessageDialog(null, "� um tri�ngulo Isoceles!");	
	}
	
	
	
	
}else{
	
	JOptionPane.showMessageDialog(null, "N�o � Tri�ngulo!");
	
	}



	}
	

}
