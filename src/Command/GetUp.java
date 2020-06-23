package Command;

import Observerer.Trainee;
//ConcreteCommand
public class GetUp implements Command {
	
	private Trainee trainee;
	
	public GetUp(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		this.trainee.executeGetUp();
		
	}
}
