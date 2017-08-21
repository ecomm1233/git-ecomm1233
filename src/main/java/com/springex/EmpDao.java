package com.springex;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmpDao {

		NamedParameterJdbcTemplate template;
		
		public EmpDao(NamedParameterJdbcTemplate template) {
			
			this.template = template;
		}
		
		public void save(Employee e){
			String query="insert into employee values (:id,:name,:deptId,:job)";
			
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("id",e.getId());
			map.put("name", e.getName());
			map.put("deptId", e.getDeptId());
			map.put("job", e.getJob());
			
			template.execute(query,map,new PreparedStatementCallback() {
				public Object doInPreparedStatement(PreparedStatement ps) 
						throws SQLException, DataAccessException {
					
					return ps.executeUpdate();
				}
			});
		}
		
		public int updateEmp(Employee e){
			String query="update employee set job=:job where eid=:id";
			
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("id",e.getId());
			map.put("job", e.getJob());
			return template.update(query, map);			
		}
		
		
}
