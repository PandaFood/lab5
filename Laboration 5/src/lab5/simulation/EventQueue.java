package lab5.simulation;

import java.util.ArrayList;

public class EventQueue {

	private ArrayList<Event> eventQueue;
	
	public EventQueue(){
		eventQueue = new ArrayList<Event>();
		
	}
	
	public void addToQueue(Event e){
		eventQueue.add(e);
		
		
	}
	
	public Event getEvent(){
		Event event;
		event = eventQueue.get(0);
		eventQueue.remove(0);
		return event;
	}
	
	public void ClearList(){
		eventQueue.clear();
	}
	
	
}
