package lab5.simulation;

import java.util.Observable;

public abstract class Event extends Observable {
	int time;
	
	
	public Event() {
		
	}
	
	
	public int getTime(){
		
		return time;
	}
}
