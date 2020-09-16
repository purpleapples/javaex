package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
	private int[] scores;
	
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	@Override
	public String toString(){
		
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public Scoreboard getClone() {
		
		Scoreboard clone = null;

		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("복제 실패");
		}
				
		return clone;
	}

	public int[] getScores() {
		return scores;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 clone method override
		// 먼저 얕은 복제  시도
		Scoreboard clone = (Scoreboard)super.clone();
		clone.scores = Arrays.copyOf(scores, scores.length);
		// 내부의 참조 객체 복세 시도 -> 깊은 복제
		
		return clone;
	}
	

}
