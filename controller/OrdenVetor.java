package controller;

public class OrdenVetor {
	public static void  {

		int vetor[]= criarVetor(100000);
		insertionSort(vetor);


		}



		public static void insertionSort(int[] vetor) {
		int j;
		int key;
		int i;



		float tempoinicio = System.nanoTime();
		for (j = 1; j < vetor.length; j++) {
		key = vetor[j];
		for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
		vetor[i + 1] = vetor[i];
		}
		vetor[i + 1] = key;
		}
		float tempoFinal = System.nanoTime();
		float total = tempoFinal - tempoinicio;



		System.out.println("O tempo total será:" + total);



		}
		
			public static void bubbleSort(int[] vetor) {
				boolean troca = true;
				int x;
				while (troca) {
					troca = false;
					for (int i = 0 ; i < vetor.length - 1; i++) {
						if(vetor[i]> vetor[i+1]) {
							aux = vetor[i];
							vetor[i] = vetor[i+1];
							vetor[i+1] = aux;
							troca = true;
						}
					}
				}
				
			}
		
		public static void quickSort(int[] vetor) {
			quickSort(vetor, 0, vetor.length - 1);
			}

			private static void quickSort(int[] vetor, int inicio, int fim) {
			if(inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
			}
			}
		
			private static int separar(int[] vetor, int inicio, int fim) {
				int pivo = vetor[inicio];
				int i = inicio +1 , f = fim;
				while(i <= f) {
				if(vetor[i] <= pivo)
				i++;
				else if (pivo < vetor[f])
				f--;
				else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
				}

				}
				vetor[inicio] = vetor[f];
				vetor[f] = pivo;
				return f;
				}
}
