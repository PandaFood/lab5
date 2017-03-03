package lab5.data;

import lab5.simulation.Event;
import lab5.data.events.*;

public class Person {

	Event event;
	public Person(){
		event = new Enter();
	}
	
	public void Done(){
		event =  new Leave();
	}
	
	public void Ready(){
		event = new Ready();
	}
	
	public boolean isReady(){
		if(event.getClass() == Ready.class)
			return true;
		else
			return false;
	}
	
	public boolean isDone(){
		if(event.getClass() == Leave.class)
			return true;
		else
			return false;
		
	}
	
	
	
	public boolean isHappy(){
		if(true){
			return false;
		}
		else
			return true;
	}
	
	
	
	
	
	
}
