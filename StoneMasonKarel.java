/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {


	//create methods to designate each task
	public void run(){
		
		while(true){
			
			fixColumn();
			moveDown();
			if(frontIsBlocked()) break;
			moveBetween();
			
		}
	}
	
	private void fixColumn(){
		
		turnLeft();
		if(noBeepersPresent()) putBeeper();
		while(frontIsClear()){
			if(noBeepersPresent()) putBeeper();
			move();
		}
		if(noBeepersPresent()) putBeeper();
	}
	
	private void moveDown(){
		turnAround();
		while(frontIsClear()){
			move();
			
		}
		turnLeft();
	}
	
	private void moveBetween(){
		for(int i = 0; i < 4; i++){
			move();
		}
	}
}
