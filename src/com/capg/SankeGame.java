package com.capg;

public class SankeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int start = 0;
		int position = start;
		int count = 0;
		
		while(position != 100) {
			int diceValue = (int) Math.floor(Math.random() * 10) % 6;
			int action = (int) Math.floor(Math.random() * 10) % 3;
			int noPlay = 1;
			int ladder = 2;
			int snake = 0;
			count++; 
			
			if(action == noPlay) {
				System.out.println("Stay in the same position");
			}else if(action == ladder) {
				int after = position+diceValue;
				if(after >100) {
					System.out.println("Stay in the same position");
				} else {
					position +=diceValue;
				}
				
			} else if(action == snake){
				int after = position-diceValue;
				if(after <0) {
					System.out.println("moving to zero");
					position = 0;
				} else {
					position -=diceValue;
				}
			}
			
			System.out.println("Updated Position: " + position);
		}
		
		System.out.println("Number of time dice played: " + count);
		
	}
}
