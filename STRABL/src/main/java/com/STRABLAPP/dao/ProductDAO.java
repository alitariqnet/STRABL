package com.STRABLAPP.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.STRABLAPP.entity.Product;

@Transactional
@Repository
public class ProductDAO {

//	@PersistenceContext	
	private EntityManager entityManager;
//	private SessionFactory sessionFactory;
	
	public void addProduct(Product p) {
//		String hql = ""
	}
	
	public List<Product> getAllProductsDesc() {
		String hql = "FROM products as prd ORDER BY prd.Id desc";
//		Session session = sessionFactory.getCurrentSession();
//		List<Product> list = session.createQuery(hql).getResultList();
//		session
		entityManager.createQuery(hql);
		List<Product> list = ((Query) entityManager).getResultList();
		System.out.println(list.toString());
		return list;
	}
	
}
