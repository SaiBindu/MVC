package com.cg.mvcspring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.mvcspring.dto.Mobile;
@Repository("mobiledao")
public class IMobileDaoImpl implements IMobileDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);
		em.flush();
		
		
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Mobile");
		List<Mobile>  myAll = query.getResultList();
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
