package models;
import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.*;

public class Task {
	
	private Long id;
	
	@Required
	private String label;
	
	private static List<Task> tasks =  new ArrayList<Task>();
	
	public static List<Task> all(){
		return tasks;
	}
	
	public static void create(Task task){
		tasks.add(task);
	}
	
	public static void delete(Long id){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}