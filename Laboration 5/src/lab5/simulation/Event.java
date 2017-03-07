package lab5.simulation;

import java.util.Observable;

public interface Event {	

	
	public int getTime();
	
	public Event nextEvent();
}
