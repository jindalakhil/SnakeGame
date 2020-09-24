package com.capg;

public class SankeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to game");
		int start = 0;
		int diceValue = (int) Math.floor(Math.random() * 10) % 6;
		int action = (int) Math.floor(Math.random() * 10) % 3;
		
		int position = start;
		
		while(position != 100) {
			if(action > 100) {
				continue;
			} else {
				if(action == 1) {
					return;
				}else if(action ==2) {
					position += diceValue;
				} else {
					position -= diceValue;
				}
			}
		}
	}
}
