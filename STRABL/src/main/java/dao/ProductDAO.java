package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Product;

@Transactional
@Repository
public class ProductDAO {

	@PersistenceContext	
	private EntityManager entityManager;
	
	public void addProduct(Product p) {
//		String hql = ""
	}
	
	public List<Product> getAllProductsDesc() {
		String hql = "FROM Product as pr ORDER BY pr.Id desc";
		return (List<Product>) entityManager.createQuery(hql).getResultList();
	}
	
}
