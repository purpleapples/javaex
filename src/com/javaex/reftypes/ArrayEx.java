package com.javaex.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		//defineArray();
		//twoDimenEx();
		//arrayCopyEx();
		arrayCopySystem();

	}
	
	public static void arrayCopySystem() {
		int src[] = {1, 2, 3};
		int tgt[] = new int[10];
		
		System.arraycopy(src, 0, tgt, 0, src.length);
		for (int i : tgt) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}
	
	public static void arrayCopyEx() {
		// array size can not be changed
		int src[] = {1, 2, 3};
		int tgt[] = new int[10];
		
		for (int i = 0; i < src.length; i++) {
			tgt[i] = src[i];
		}
		for (int j = 0; j < tgt.length; j++) {
			System.out.printf("%d\t", tgt[j]);
		}
		
		System.out.println();
		
		// 위의 과정은 해당 method로 구현되어 있다.
		//System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	
	
	public static void twoDimenEx() {
		// two dimensional array declaration 
		int [][] twoDimen = new int[5][10];
		// Multidimensional array is array of array
		
		// default data already exist
		
		int table[][] = {
				{1 ,2, 3, 4, 5, 6 ,7, 8, 9, 0},
				{2 ,3, 4, 5, 6, 7 ,8, 9, 0, 1},
				{3 ,4, 5, 6, 7, 8 ,9, 0, 1, 2},
				{4 ,5, 6, 7, 8, 9 ,0, 1, 2, 3},
				{5 ,6, 7, 8, 9, 0 ,1, 2, 3, 4},
		};
		System.out.println("table length:" + table.length);
		System.out.println("table[0] length:" + table[0].length);
		int sum = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
				sum += table[i][j];				
			}
			System.out.println();			
		}
		System.out.println("summation result : " + sum);
	}
	
	public static void defineArray() {
		// array declaration
		String[] name;
		int scores[];
		
		name = new String[] {
				"김", "이", "박", "최"
		};
		
		scores = new int[4];
		
		// index use
		// index range : 0 ~ length -1 (warning)
		
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 95;
		
		
		// a value list already exists
		int age[] = {28, 30, 25, 32};
		
		// array length 는 length attribute에 존재
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%d세) - %d점%n",
					name[i],age[i],scores[i]);
			
		}
		
		// ref type은 reference id를 담는다.
		
		int[] scores2 = scores;
		System.out.println(scores == scores2);
		System.out.println("score[2] -> " + scores[2]);		
		scores2[2] = 100;
		
		System.out.println("score[2] -> " + scores[2]);
	}

}
