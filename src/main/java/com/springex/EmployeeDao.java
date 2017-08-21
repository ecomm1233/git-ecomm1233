package com.springex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.demo.Employees;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e){
		System.out.println("Inside save employees");
		String query="Insert into Employee values('"+e.getId()+"','"+e.getName()+"','"+e.getDeptId()+"','"+e.getJob()+"')";
		System.out.println("Insert Query = "+query);
		return jdbcTemplate.update(query);
		
	}
	
	public int updateEmployee(Employee e){
		
		String query="Update Employee set ename= '"+e.getName()+"', deptId = "+e.getDeptId()+", job = '"+e.getJob()+"' where eid = "+e.getId();
		
		return jdbcTemplate.update(query);
		
	}
	
	public int deleteEmployee(int id){
		
		String query="Delete from Employee where eid = "+id;
		
		return jdbcTemplate.update(query);
		
	}
	
	public Boolean saveEmployeeByPreparedStatement(final Employee e){
		String insertQuery="insert into Employee values (?,?,?,?)";
		
		return jdbcTemplate.execute(insertQuery, new PreparedStatementCallback<Boolean>() {
			
			public Boolean doInPreparedStatement(PreparedStatement ps) 
					throws SQLException, DataAccessException {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3,e.getDeptId());
				ps.setString(4, e.getJob());
				
				return ps.execute();
			}		
			
		});
		
	}
	
	public List<Employee> getAllEmployees(){
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>()
		{

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				
				List<Employee> list=new ArrayList<Employee>();
				
				while(rs.next()){
					Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
					list.add(e);
				}
				return list;
			}
			
		});
	}
	
	public List<Employee> getAllEmployeesRowMapper(){
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>(){

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			}
			
			
			
		});
		
	}
	public Employee getEmployeeById(int id){  
	    String sql="select * from Employee where eid = ?";  
	    Employees e = jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employees>(Employees.class));  
	    System.out.println(e.toString());
	    Employee e1 = new Employee(e.geteId(),e.getEname(),e.getDeptId(),e.getJob());
	    return e1;
	}  
	
	public Integer getMaxEmpId(){
		String query = "Select MAX(eid) from Employee";
		return jdbcTemplate.queryForObject(query, Integer.class);
		
	}
	
}
