package controller;

public class ThreadVetor extends Thread {
	
	int vet [] = new int [1000];
	int num = 0;
	
	public ThreadVetor(int [] vet, int num ) {
		
		
		for(int i=0; i<1000; i++){
			this.vet[i]=vet[i];
		}
		
		this.num = num;
	}

	
	public void run() {
		
		Calc();
	}


	private void Calc() {
		
		if(num%2==0){//verificando se o numero digitado é par ou impar 
			
			 double tempoInicial = System.nanoTime();// pegando o tempo inicial 
			 for (int i = 0 ; i < vet.length; i++) {
			 }
			 double tempoFinal =  System.nanoTime();//pegando o tempo final depois de percorrer o for 
			 double tempoTotal = tempoFinal - tempoInicial ;// tempo final menos o inicial 
			 tempoTotal= tempoTotal / (Math.pow(10,9));// transformando em segundos 
			 
			 System.out.println(tempoTotal+ " segundos");
		}else{
			
			double tempoInicial = System.nanoTime();// pegando o tempo inicial 
			 for (int vetor : vet) {
			 }
			 double tempoFinal =  System.nanoTime();//pegando o tempo final depois de percorrer o for 
			 double tempoTotal = tempoFinal - tempoInicial ;// tempo final menos o inicial 
			 tempoTotal= tempoTotal / (Math.pow(10,9));// transformando em segundos
			 
			 System.out.println(tempoTotal+ " segundos");
		}
	}
}
