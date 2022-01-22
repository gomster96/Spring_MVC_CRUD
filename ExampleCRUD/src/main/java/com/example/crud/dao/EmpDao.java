package com.example.crud.dao;    
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;
import com.example.crud.beans.Emp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;    

 
@Repository
public class EmpDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public Emp getEmpById(int id) {
		Emp emp = sqlSession.selectOne("mapper.selectEmpById", id);
		return emp;
	}
	
	public List<Emp> getEmpList(){
		// selectList를하면 list를반영
		List<Emp> empList = sqlSession.selectList("mapper.selectEmps");
		return empList;
	}
	public int saveEmp(Emp p) {
		return sqlSession.insert("mapper.saveEmp", p);
	}
	public int updateEmp(Emp p){
		return sqlSession.update("mapper.updateEmp", p);
	}
	public int deleteEmp(int id) {
		return sqlSession.delete("mapper.deleteEmp", id);
	}
	
	
//JdbcTemplate template;    
//    
//public void setTemplate(JdbcTemplate template) {    
//    this.template = template;    
//}    
//public int save(Emp p){    
//    String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
//    return template.update(sql);    
//}    
//public int update(Emp p){    
//    String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
//    return template.update(sql);    
//}    
//public int delete(int id){    
//    String sql="delete from Emp99 where id="+id+"";    
//    return template.update(sql);    
//}    
//public Emp getEmpById(int id){    
//    String sql="select * from Emp99 where id=?";    
//    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
//}    
//public List<Emp> getEmployees(){    
//    return template.query("select * from Emp99",new RowMapper<Emp>(){    
//        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
//            Emp e=new Emp();    
//            e.setId(rs.getInt(1));    
//            e.setName(rs.getString(2));    
//            e.setSalary(rs.getFloat(3));    
//            e.setDesignation(rs.getString(4));    
//            return e;    
//        }    
//    });
//	}
}   