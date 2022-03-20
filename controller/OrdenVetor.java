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

		public static int[] criarVetor(int tamanhoVetor) {

		Random random = new Random();
		int vetor[] = new int[tamanhoVetor];
		for (int i = 0; i < tamanhoVetor; i++) {
		vetor[i] = random.nextInt(100);
		}
		return vetor;
		}



		@SuppressWarnings("rawtypes")
		public static Comparable[] convertToComparable(int[] vet) {
		Integer[] vetComp = new Integer[vet.length];
		int x = 0;
		for (int i : vet) {
		vetComp[x] = i;
		x++;
		}
		return vetComp;
		}
}
