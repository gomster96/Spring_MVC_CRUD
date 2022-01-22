package com.example.crud.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.beans.*;
import com.example.crud.dao.EmpDao;
import com.example.crud.service.*;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao empDao;
	
	@Override
	public Emp getEmpById(int id) {
		return empDao.getEmpById(id);
	}

	@Override
	public List<Emp> getEmpList() {
		return empDao.getEmpList();
	}

	@Override
	public int saveEmp(Emp p) {
		return empDao.saveEmp(p);
	}

	@Override
	public int updateEmp(Emp p) {
		return empDao.updateEmp(p);
	}

	@Override
	public int deleteEmp(int id) {
		return empDao.deleteEmp(id);
	}
	
}