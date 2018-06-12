import static spark.Spark.*;

public class Servidor {
    public static void main(String[] args) {

    	staticFileLocation("/static/PrimerParcial");

        get("/index", (req, res) -> {
        	res.redirect("/index.html");
        	return null;
        });
    	
        get("/menu", (req, res) -> {
        	res.redirect("/menu.html");
        	return null;
        });
      
        get("/nosotros", (req, res) -> {
        	res.redirect("/nosotros.html");
        	return null;
        });
      
        get("/contacto", (req, res) -> {
        	res.redirect("/contacto.html");
        	return null;
        });


        get("/404", (req, res) -> {
        	res.redirect("/404.html");
        	return null;
        });
        
        
        get("/contacto", (req, res) -> {

        	res.header("content-type", "text/html");

        	return "<form action='/post' method='POST'>"
				+ "<button type='submit'> ENVIAR </button>"
				+ "</form>";
        });
        
        
        
        get("/index", (req, res) -> {

        	res.header("content-type", "text/html");
        	return null;

        });

        
        get("/menu", (req, res) -> {

        	res.header("content-type", "text/html");

        	return null;
        });
        
        get("/nosotros", (req, res) -> {

        	res.header("content-type", "text/html");
        	return null;
        });
        
        get("/codigo", (req, res) -> {
        	res.status(404);
        	return "/404.html";
        });
  
    } 
   }

