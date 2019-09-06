package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;

import entities.EmployeeEntity;

/**
 * Session Bean implementation class EmployeeEJB
 * @param <Employee>
 */
@Stateless
@LocalBean
public class EmployeeEJB<Employee> {


	@PersistenceContext
	private EntityManager em;
	
    public EmployeeEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(EmployeeEntity employeeEntity)
    {
    	System.out.println("============================");
    	System.out.println(employeeEntity.getName());
    	em.persist(employeeEntity);
    	System.out.println("============================");
    }

	  public List<Employee> ViewAllEmployees() {
	  System.out.println("do we get here....?");
	  
	  List<Employee> results = null;
	  
	  javax.persistence.Query query = em.createQuery("select e from Employee e"); results =
	  query.getResultList(); System.out.println("whats here" +
	  results.get(1).toString());
	  
	  return results;
	  
	  
	  }
}

   
	

	 
