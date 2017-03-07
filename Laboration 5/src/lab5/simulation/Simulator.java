package lab5.simulation;



public class Simulator {

	EventQueue eq;
	boolean redFlag = false;
	
	public Simulator(){
		eq = new EventQueue();
		
	}
	
	public Event getEvent(){
		if(redFlag)
			return null;
		return eq.getEvent();		
	}
	
	public boolean addEvent(Event e){
		if(redFlag)
			return false;
		eq.addToQueue(e);
		return true;
	}
}
