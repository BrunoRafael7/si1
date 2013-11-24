package controllers;

import models.Task;

import play.data.Form;
import play.mvc.*;

public class Application extends Controller {
	
	static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
    	return redirect(routes.Application.tasks());
    }

    public static Result tasks(){
    	return ok(views.html.index.render(Task.all() , taskForm));
    }
    
    public static Result newTask(){
    	Form<Task> form = taskForm.bindFromRequest();
    	if(form.hasErrors()){
    		return badRequest(views.html.index.render(Task.all(), form));
    	}else{
    		Task.create(form.get());
    		return redirect(routes.Application.tasks()); 
    	}
    	
    }
    
    public static Result deleteTask(Long id){
    	return TODO;
    }
   
}