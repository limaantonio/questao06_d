package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {
	
	public static void bubbleSort(Aluno[] v, int n, int o) {
		Aluno aux = new Aluno();
		if(o == 1) {
			for (int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(v[j].mediaPonderada() >  v[j+1].mediaPonderada()) {
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
		if(o == 2) {
			for (int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(v[j].getNota01() >  v[j+1].getNota01()){
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
		if(o == 3) {
			for (int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(v[j].getNome().charAt(0)  > v[j+1].getNome().charAt(0)){
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
	}

	public static void insertionSort(Aluno[] v, int n, int o) {
		Aluno x = new Aluno();
		int j=0;
		
		if(o == 1) {
			for(int i=1; i<n; i++) {
				x = v[i];
				j = i-1;
				while(j >=0 && v[j].mediaPonderada() > x.mediaPonderada()) {
					v[j+1] = v[j];
					j--;
				}
				v[j+1] = x;
			}
		}
		if(o == 2) {
			for(int i=1; i<n; i++) {
				x = v[i];
				j = i-1;
				while(j >=0 && v[j].getNota01() > x.getNota01()) {
					v[j+1] = v[j];
					j--;
				}
				v[j+1] = x;
			}
		}
		if(o == 3) {
			for(int i=1; i<n; i++) {
				x = v[i];
				j = i-1;
				while(j >=0 && v[j].getNome().charAt(0) > x.getNome().charAt(0)) {
					v[j+1] = v[j];
					j--;
				}
				v[j+1] = x;
			}
		}
	}
	
	public static void selectionSort(Aluno[] v, int n, int o) {
		Aluno aux = new Aluno();
		int min;
		if(o == 1) {
			for(int i=0; i<n-1; i++) {
				min = i;
				for(int j=i+1; j<n; j++) {
					if(v[j].mediaPonderada()< v[min].mediaPonderada()) {
						min = j;
					}
					aux = v[j];
					v[j] = v[min];
					v[min] = aux;
				}
			}
		}
		if(o == 1) {
			for(int i=0; i<n-1; i++) {
				min = i;
				for(int j=i+1; j<n; j++) {
					if(v[j].getNota01() < v[min].getNota01()) {
						min = j;
					}
					aux = v[j];
					v[j] = v[min];
					v[min] = aux;
				}
			}
		}
		if(o == 3) {
			for(int i=0; i<n-1; i++) {
				min = i;
				for(int j=i+1; j<n; j++) {
					if(v[j].getNome().charAt(0) < v[min].getNome().charAt(0)) {
						min = j;
					}
					aux = v[j];
					v[j] = v[min];
					v[min] = aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n = 2;
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Aluno [] alunos = new Aluno[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Nota 1: ");
			double n1 = sc.nextInt();
			System.out.print("Nota 2: ");
			double n2 = sc.nextInt();
			
			alunos[i] = new Aluno(nome, n1, n2);
		}
		
		System.out.println("Ordenado por média:");
		bubbleSort(alunos, n, 1);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por nota 01:");
		bubbleSort(alunos, n, 2);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por aluno reprovado:");
		bubbleSort(alunos, n, 3);
		for(Aluno a : alunos) {
			if(a.reprovado() == true) {
				System.out.println(a.toString());
			}	
		}
		System.out.println();
		
		System.out.println(".......ORDENAÇAO COM INSERTION SORT......");
		
		System.out.println("Ordenado por média:");
		insertionSort(alunos, n, 1);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por nota 01:");
		insertionSort(alunos, n, 2);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por aluno reprovado:");
		insertionSort(alunos, n, 3);
		for(Aluno a : alunos) {
			if(a.reprovado() == true) {
				System.out.println(a.toString());
			}	
		}
		System.out.println();
		
		System.out.println(".......ORDENAÇAO COM SELECTION SORT......");
		
		System.out.println("Ordenado por média:");
		insertionSort(alunos, n, 1);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por nota 01:");
		insertionSort(alunos, n, 2);
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		System.out.println();
		System.out.println("Ordenado por aluno reprovado:");
		insertionSort(alunos, n, 3);
		for(Aluno a : alunos) {
			if(a.reprovado() == true) {
				System.out.println(a.toString());
			}	
		}

		
		System.out.println();
		
		
		
		
		
		

	}

}
