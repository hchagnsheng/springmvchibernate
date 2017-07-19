package com.hcs.base.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcs.base.dao.BaseDao;
import com.hcs.base.service.BaseService;

@Transactional
public class BaseServiceImpl<T> implements BaseService<T>{
	
	@Autowired
	private BaseDao<T> dao;

	public Serializable save(T o) {
		// TODO Auto-generated method stub
		return dao.save(o);
	}

	public void delete(T o) {
		// TODO Auto-generated method stub
		dao.delete(o);
	}

	public void update(T o) {
		// TODO Auto-generated method stub
		dao.update(o);
	}

	public void saveOrUpdate(T o) {
		// TODO Auto-generated method stub
		dao.saveOrUpdate(o);
	}

	public List<T> find(String hql) {
		// TODO Auto-generated method stub
		return dao.find(hql);
	}

	public List<T> findPart(String hql, int num) {
		// TODO Auto-generated method stub
		return dao.findPart(hql, num);
	}

	public List<T> find(String hql, Object[] param) {
		// TODO Auto-generated method stub
		return dao.find(hql, param);
	}

	public List<T> find(String hql, List<Object> param) {
		// TODO Auto-generated method stub
		return dao.find(hql, param);
	}

	public List<T> find(String hql, Object[] param, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return dao.find(hql, param, page, rows);
	}

	public List<T> find(String hql, List<Object> param, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return dao.find(hql, param, page, rows);
	}

	public T get(Class<T> c, Serializable id) {
		// TODO Auto-generated method stub
		return dao.get(c, id);
	}

	public T get(String hql, Object[] param) {
		// TODO Auto-generated method stub
		return dao.get(hql, param);
	}

	public T get(String hql, List<Object> param) {
		// TODO Auto-generated method stub
		return dao.get(hql, param);
	}

	public Long count(String hql) {
		// TODO Auto-generated method stub
		return dao.count(hql);
	}

	public Integer getCount(String hql) {
		// TODO Auto-generated method stub
		return dao.getCount(hql);
	}

	public Long count(String hql, Object[] param) {
		// TODO Auto-generated method stub
		return dao.count(hql, param);
	}

	public Long count(String hql, List<Object> param) {
		// TODO Auto-generated method stub
		return dao.count(hql, param);
	}

	public Integer executeHql(String hql) {
		// TODO Auto-generated method stub
		return dao.executeHql(hql);
	}

	public Integer executeHql(String hql, Object[] param) {
		// TODO Auto-generated method stub
		return dao.executeHql(hql, param);
	}

	public Integer executeHql(String hql, List<Object> param) {
		// TODO Auto-generated method stub
		return dao.executeHql(hql, param);
	}


}
