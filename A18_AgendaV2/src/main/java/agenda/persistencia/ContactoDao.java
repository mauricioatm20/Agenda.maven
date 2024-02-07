package agenda.persistencia;

import java.util.Set;

import agenda.modelo.Contacto;

//permite guardar objetos contacto
public interface ContactoDao {

	public void insertar(Contacto c); 

	public void actualizar(Contacto c);
	
	public boolean eliminar(int idContacto);
	
	public boolean eliminar(Contacto c); 
	
	public Contacto buscar(int idContacto);
	
//	debe retornar todos los contactos cuyo nombre, apellido o apodo contenga la cadena "cadena"
	
	public Set<Contacto> buscar (String cadena); 
	
	public Set<Contacto> buscarTodos();




	
}
