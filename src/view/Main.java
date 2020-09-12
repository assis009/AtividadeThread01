package view;

import javax.swing.JOptionPane;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		int vet [] = new int [1000];
		int num=0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero impar"
		+ " para um for convencional e um par para foreach: "));		
		
		for(int i=0; i<1000; i++){
			vet[i]= 1+(int)(Math.random()*100);
		}
		
		Thread thread = new ThreadVetor(vet, num);
		thread.start();
		
	}

}
