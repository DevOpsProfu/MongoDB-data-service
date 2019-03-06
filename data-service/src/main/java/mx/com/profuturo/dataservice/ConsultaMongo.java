package mx.com.profuturo.dataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsultaMongo {
	
	@Autowired
	private ConsultorRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	ResponseEntity<?> getConsultores() {

		List<Consultores> consultor = repository.findAll();
		
		if(consultor.isEmpty()){
			return ResponseEntity.notFound().build();
		}else{
			return new ResponseEntity<Object>(consultor, new HttpHeaders(),HttpStatus.OK);
		}					
	}	
}
