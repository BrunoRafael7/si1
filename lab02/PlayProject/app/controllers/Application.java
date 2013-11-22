package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result helloWorld() {
        return ok(web.render("Hello, ", "god job!"));
    }
    
    public static Result tasks(){
    	return ok(web.render("Bruno Rafael", "MATRÍCULA : 111210056"));
    }
    
    public static Result newTasks(){
    	return TODO;
    }
}
