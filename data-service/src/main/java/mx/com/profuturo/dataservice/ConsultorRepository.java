package mx.com.profuturo.dataservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultorRepository extends MongoRepository<Consultores, String>{
	
	public Consultores findBy_id(String _id);
    public List<Consultores> findByNombre(String Nombre);
    public List<Consultores> findByPuesto(String Puesto);
    public List<Consultores> findByEdad(String Edad);
    
}
