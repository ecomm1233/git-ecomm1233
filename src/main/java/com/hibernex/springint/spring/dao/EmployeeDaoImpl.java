package com.hibernex.springint.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernex.springint.spring.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{

		@PersistenceContext
		EntityManager em;

		
		//Method to save Employee
		public void saveEmployee(Employee e){
			
			em.persist(e);
			
		}
		
		
		//Method to delete Employee
		public void deleteEmployee(int id){
			
			Employee e=em.find(Employee.class, id);
			em.remove(e);
		}
			
		//Method to return all employees
		public List<Employee> getAllEmployees(){
			/*
			CriteriaQuery<Employee> query = em.getCriteriaBuilder().createQuery(Employee.class);
			@SuppressWarnings("unused")
			Root<Employee> root=query.from(Employee.class);
			return em.createQuery(query).getResultList();
			*/
			TypedQuery<Employee> query = em.createNamedQuery("Employee.selectAll", Employee.class);
			return query.getResultList();
		}

		public int updateSalary(int id) {
			/*Employee e=em.find(Employee.class, id);
			double newSal = e.getSalary()+(e.getSalary()*0.10); //Increase salary by 10%
			e.setSalary(newSal);
			*/
			int count = em.createQuery("Update Employee set salary = (salary + (salary*0.1)) where id ="+id).executeUpdate();
			return count;
		}

		public Double getMaxEmployeeSalary() {
			
			TypedQuery<Double> query =  em.createQuery("Select MAX(salary) from Employee",Double.class);
						
			return query.getSingleResult();
		}


		public Employee getSalaryById(int id) {
			CriteriaBuilder cb= em.getCriteriaBuilder();
			CriteriaQuery<Employee> q = cb.createQuery(Employee.class);
			Root<Employee> c= q.from(Employee.class);
			ParameterExpression<Integer> p = cb.parameter(Integer.class);
			q.select(c).where(cb.equal(c.get("id"), p));
			
			
			TypedQuery<Employee> query = em.createQuery(q);
			return  query.setParameter(p, id).getSingleResult();
		}
}
