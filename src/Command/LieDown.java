package Command;

import Observerer.Trainee;
//ConcreteCommand
public class LieDown implements Command{
	
	private Trainee trainee;
	
	public LieDown(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		this.trainee.executeLieDown();
	}

	
}
