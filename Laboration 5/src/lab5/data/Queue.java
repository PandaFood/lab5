package lab5.data;

import java.util.ArrayList;

public class Queue {

	private final int QUEUECHAIRS = 4;
	private static ArrayList<Person> list;
	
	public int QUEUECHAIRS(){
		return QUEUECHAIRS;
		}
	
	public Queue(){
		list = new ArrayList<Person>();
	}
	
	public boolean addPerson(Person person){
		if(!person.isHappy()){
			for(int i = 0; i < QUEUECHAIRS; i++)
				if(list.get(i).isHappy()){
					list.add(i, person);
					return true;
				}						
			
		}
		else if(list.size() >= QUEUECHAIRS)
			return false;
		else
			list.add(person);
			return true;
	}
	
	
	
	
}
