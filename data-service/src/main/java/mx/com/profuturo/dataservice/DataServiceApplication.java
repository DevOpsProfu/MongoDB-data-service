package mx.com.profuturo.dataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.bson.types.ObjectId;

@SpringBootApplication

public class DataServiceApplication implements CommandLineRunner {

	@Autowired
	private ConsultorRepository repository;
	
    @Value("${user.role}")
    private String role;
	
    @Value("${nombre}")
    private String nombre;
    
	public static void main(String[] args) {
		SpringApplication.run(DataServiceApplication.class, args);	

	}
	
	@Override	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
		// save a couple of customers
		repository.save(new Consultores("3","Genaro","24","Consultor jr"));
		repository.save(new Consultores("4","Carlos","34","Consultor sr"));
		
		// fetch all customers
		System.out.println("Consultor found with findAll():");
		System.out.println("-------------------------------");
		for (Consultores consultor : repository.findAll()) {
			System.out.println(consultor.toString());
		}
		System.out.println();
		
		// fetch an individual customer
		
		System.out.println("--------------------");
		System.out.println(role);
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println(nombre);
		System.out.println("--------------------");
		
	}
	
}
