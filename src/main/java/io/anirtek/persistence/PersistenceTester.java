package io.anirtek.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.anirtek.persistence.entity.Employee;

public class PersistenceTester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anirtek-jpa");

		EntityManager em = emf.createEntityManager();

		// INSERT INTO action
		// Employee emp = new Employee();
		// emp.setFirstName("Mayank");
		// emp.setLastName("Jain");
		// emp.setEmail("mjain8@binghamton.edu");
		// emp.setCity("San Francisco");
		//
		// em.getTransaction().begin();
		// em.persist(emp);
		// em.getTransaction().commit();

		// FIND BY ID
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// Employee emp = em.find(Employee.class, "a13f3cb4dbfc75953426");
		// System.out.println(emp.toString());

		// UPDATE BY ID
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// emp.setFirstName("Jack");
		// emp.setLastName("Sparrow");
		// emp.setEmail("jsparrow@binghamton.edu");
		// emp.setCity("Los Angeles");
		//
		// em.getTransaction().begin();
		// em.merge(emp);
		// em.getTransaction().commit();

		// DELETE
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// if (emp != null) {
		// em.getTransaction().begin();
		// em.remove(emp);
		// em.getTransaction().commit();
		// }

		em.close();
		emf.close();
	}
}
