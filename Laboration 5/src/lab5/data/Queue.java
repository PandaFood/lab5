package lab5.data;

import java.util.ArrayList;

public class Queue {

	private final int WORKCHAIRS = 3;
	private final int QUEUECHAIRS = 4;
	private static Person[] chairs;
	private static ArrayList<Person> list;
	
	public int QUEUECHAIRS(){
		return QUEUECHAIRS;
	}
	
	public int WORKCHAIRS(){
		return WORKCHAIRS;
	}
	public int workSizeChair(){
		return chairs.length;
	}

	
	public Queue(){
		list = new ArrayList<Person>();
		chairs = new Person[WORKCHAIRS];
	}
	
	public void addPerson(Person person){
		if(!person.isHappy()){
			for(int i = 0; i < QUEUECHAIRS; i++)
				if(list.get(i).isHappy()){
					list.add(i, person);
					return;
				}
			//TODO: IMPLEMENT Take a walk
						
			
		}
		else if(list.size() >= QUEUECHAIRS)
			return;
		else
			list.add(person);
	}
	

	public Person personDone(Person person){
			for(int i = 0; i < chairs.length; i++){
				if(chairs[i] == person){
					chairs[i] = list.get(0);
					list.remove(0);
					return chairs[i];
				}				
			}
			//THIS SHOULD NEVER HAPPEN
			return person;
		
	}
	
	
	
	
}
