package com.javaex.api.objectclass.v4;

public class LanghClassText {

	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1 = " + s1);
		
		
		Scoreboard s2 = s1.getClone();
		
		System.out.println("s2 = " + s2);
		
		System.out.println("s1 == s2 ? "+ (s1==s2));
		
		s2.getScores()[1] = 50;
		
		System.out.println("s1[1] = " + s1.getScores()[1]);
		System.out.println("s2[1] = " + s2.getScores()[1]);
		
	}

}
