package controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Estudiante;


public class EstudianteController  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private EntityManagerFactory emf = null;
	//private EntityManager em = null;

	public EstudianteController() {
		this.emf = Persistence.createEntityManagerFactory("Example");
		//this.em = emf.createEntityManager();
	}

	public Estudiante getEstudianteDNI(int dni) {
		EntityManager em = emf.createEntityManager();
		// el select devuelve un listado por mas q sea uno
		List<Estudiante> listado = em.createQuery("SELECT E FROM Estudiante E WHERE E.dni =:dni ", Estudiante.class)
				.setParameter("dni", dni).getResultList();
		if (listado.size() == 0) {// no existe el estudiante
			return null;
		} else {
			return listado.get(0);
		}
	}

	public void insert(Estudiante estudiante) {
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			if (this.getEstudianteDNI(estudiante.getDni()) != null) {
				System.out.println("Ya se encuentra el estudiante con el DNI: " + estudiante.getDni());
			} else {
				em.getTransaction().begin();
				em.persist(estudiante);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public List<Estudiante> getEstudiantesSortDNI() {
		EntityManager em = emf.createEntityManager();
		List<Estudiante> listado = em.createQuery("SELECT E FROM Estudiante E ORDER BY E.dni ASC ", Estudiante.class)
				.getResultList();

		return listado;
	}
	
	public Estudiante getEstudianteLegajo(int legajo) {
		EntityManager em = emf.createEntityManager();
		// el select devuelve un listado por mas q sea uno
		List<Estudiante> listado = em.createQuery("SELECT E FROM Estudiante E WHERE E.legajo =:legajo ", Estudiante.class)
				.setParameter("legajo", legajo).getResultList();
		if (listado.size() == 0) {// no existe el estudiante
			return null;
		} else {
			return listado.get(0);
		}
	}
	
	public 	List<Estudiante> getEstudianteGenero(String genero) {
		EntityManager em = emf.createEntityManager();
		Query query =em.createNativeQuery("SELECT * FROM Estudiante E WHERE E.genero =:genero ", Estudiante.class)
				.setParameter("genero", genero);
		List<Estudiante> listado = query.getResultList();
		if (listado.size() == 0) {// no existe el estudiante
			return null;
		} else {
			return listado;
		}
	}

}
