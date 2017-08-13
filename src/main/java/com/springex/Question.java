package com.springex;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	//private List<String> answers;
	//private List<Answer> answers;
	//private Map<String,String> answers;
	private Map<Answer,User> answers;
	public Question(){
		
	}

	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Answer, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}

	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    /*
	    Iterator itr=answers.iterator();
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    }*/
	    Set<Entry<Answer, User>> set=answers.entrySet();
	    Iterator<Entry<Answer, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	    	Entry<Answer, User> entry=itr.next();
	    	Answer ans=entry.getKey();
	    	User usr=entry.getValue();
	        System.out.println("Answer Info: "+ans);
	        System.out.println("Posted by : "+usr);
	    } 
	}  
}
