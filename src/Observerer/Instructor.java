package Observerer;

import Command.Command;
import Command.GetUp;
import Command.LieDown;
//Invoker
public class Instructor {
	
	Command executeLieDown;
	Command executeGetUp;
	
	public Instructor(Command executeLieDown, Command executeGetUp) {
		this.executeGetUp = executeGetUp;
		this.executeLieDown = executeLieDown;
	}
	

	public void executeGetUp() {
		executeGetUp.execute();
	}
	
	public void executeLieDown() {
		executeLieDown.execute();
	}
	
}
