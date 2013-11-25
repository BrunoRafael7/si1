package models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Task extends Model{
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Required(message = "Obrigatório")
	private String label;
	
	private static Finder<Long, Task> find = new Finder<Long, Task>(Long.class, Task.class);
	
	public static List<Task> all(){
		return find.all();
	}
	
	public static void create(Task task){
		task.save();
	}
	
	public static void delete(Long id){
		find.ref(id).delete();
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