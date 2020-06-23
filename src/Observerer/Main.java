package Observerer;

import Command.Command;
import Command.GetUp;
import Command.LieDown;

public class Main {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee();
		Instructor instructor = new Instructor(new GetUp(trainee), new LieDown(trainee));
		
		Viewer viewer = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainee.addObserver(viewer);
		trainee.addObserver(viewer2);
		trainee.addObserver(viewer3);
		
		instructor.executeGetUp();
		instructor.executeLieDown();
	}

}
