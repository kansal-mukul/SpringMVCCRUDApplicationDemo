package com.hcl.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  

import com.hcl.beans.Employee;  
  
public class EmployeeDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Employee p){  
    String sql="insert into Employee(firstname,lastname,designation) values('"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getDesignation()+"')";  
    return template.update(sql);  
}  
public int update(Employee p){  
    String sql="update Employee set firstname='"+p.getFirstName()+"', lastname='"+p.getLastName()+"', designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from Employee where id="+id+"";  
    return template.update(sql);  
}  
public Employee getEmployeeById(int id){  
    String sql="select * from Employee where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
}  
public List<Employee> getEmployees(){  
    return template.query("select * from Employee",new RowMapper<Employee>(){  
        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
        	Employee e=new Employee();  
            e.setId(rs.getInt(1));  
            e.setFirstName(rs.getString(2));  
            e.setLastName(rs.getString(3));  
            e.setDesignation(rs.getString(4));  
            return e;  
        }  
    });  
}  
}  

