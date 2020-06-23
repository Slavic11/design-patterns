package Observerer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
//Reciver
public class Trainee extends Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private String training;
	
	public void setTraining(String training) {
		this.training = training;
	}
	
	public void executeGetUp() {
		System.out.println("Trainee execute get up.");
		setTraining("Get Up");
		setChanged();
		notifyObservers(training);
	}


	public void executeLieDown() {
		System.out.println("Trainee execute lie down.");
		setTraining("Lie Down");
		setChanged();
		notifyObservers(training);
		
	}
		
}
