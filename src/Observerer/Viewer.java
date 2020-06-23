package Observerer;

import java.util.Observer;
import java.util.Observable;
//Reciver
public class Viewer implements Observer{

	@Override
	public void update(Observable observable, Object o) {
		System.out.println("Viewer changed training to "+ o.toString());
		
	}

}
