package mx.com.profuturo.dataservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Document
@EnableMongoRepositories
public class Consultores {
	@Id
	public String _id;
	
	public String Nombre;
	public String Edad;
	public String Puesto;
	
	
	public String getId() {
		return _id;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getEdad() {
		return Edad;
	}

	public String getPuesto() {
		return Puesto;
	}

	public Consultores() {}
	
	public Consultores(String id, String Nombre, String Edad, String Puesto) {
		this._id = id;
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Puesto = Puesto;
				
	}
	
    @Override
    public String toString() {
        return String.format(
                "Consultor[id='%s', Nombre='%s', Puesto='%s', Edad='%s']",
                _id, getNombre(), getPuesto(), getEdad());
    }
}
