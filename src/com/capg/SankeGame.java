package com.capg;

public class SankeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int start = 0;
		int position = start;
		int diceValue = (int) Math.floor(Math.random() * 10) % 6;
		int action = (int) Math.floor(Math.random() * 10) % 3;
		int noPlay = 1;
		int ladder = 2;
		int snake = 0;
		
		if(action == noPlay) {
			System.out.println("Stay in the same position");
		}else if(action == ladder) {
			position += diceValue;
		} else if(action == snake){
			position -= diceValue;
		}
	}
}
