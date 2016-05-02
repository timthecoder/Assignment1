/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	//program that creates checkerboard

	private boolean direction = true;
	private boolean piece = true;
	
	public void run(){
		
		while(true){
			
			row();
			if(rightIsBlocked() && facingWest() || leftIsBlocked() && facingEast() )break;
			if(direction){
				turnLeft();
				move();
				placeChecker();
				turnLeft();
				move();
				direction = false;
			}else{
				turnRight();
				move();
				placeChecker();
				turnRight();
				move();
				direction = true;	
			}
			
		}
		
	}
	
	//algorithm to move within a row
	private void row(){
		while(frontIsClear()){
			placeChecker();
			move();
		}
		placeChecker();
	}
	
	//this places the checker pieces
	private void placeChecker(){
		if(piece){
			putBeeper();
			piece = false;
		}else{
			piece = true;
		}
	}

}
