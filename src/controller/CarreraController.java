package controller;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Carrera;

public class CarreraController implements Serializable {

	private static final long serialVersionUID = 902997133635722325L;
	private EntityManagerFactory emf = null;

	public CarreraController() {
		this.emf = Persistence.createEntityManagerFactory("Example");
	}

	public void insert(Carrera carrera) {
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			if (this.getCarreraID(carrera.getId_Carrera()) != null) {
				System.out.println("Ya se encuentra la carrera con el id: " + carrera.getId_Carrera());
			} else {
				em.getTransaction().begin();
				em.persist(carrera);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Carrera getCarreraID(int id_carrera) {
		EntityManager em = emf.createEntityManager();
		List<Carrera> listado = em
				.createQuery("SELECT C FROM Carrera C WHERE C.id_carrera =:id_carrera ", Carrera.class)
				.setParameter("id_carrera", id_carrera).getResultList();
		if (listado.size() == 0) {// no hay carrera con ese id
			return null;
		} else {
			return listado.get(0);
		}
	}
	

	public List<Carrera> getCarrerasPorInscriptos() {
		EntityManager em = emf.createEntityManager();
		Query query = em
				.createNativeQuery("SELECT m.id_carrera, c.nombre_carrera FROM carrera c JOIN Matricula m ON c.id_carrera=m.id_carrera GROUP BY m.id_carrera, c.nombre_carrera ORDER BY count(m.id_carrera) DESC", Carrera.class)
				;
		 List<Carrera> listado = query.getResultList();
		if (listado.size() == 0) {// no hay carrera con ese id
			return null;
		} else {
			return listado;
		}
	}
	


}
