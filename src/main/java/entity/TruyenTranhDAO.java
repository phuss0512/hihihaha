package entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entity.Truyentranh;
import entity.JpaUtil;

public class TruyenTranhDAO {
	private EntityManager em;

	public TruyenTranhDAO() {
		this.em = JpaUtil.getEntityManager();
	}

	public Truyentranh create(Truyentranh entity) throws Exception {
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();

			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	public Truyentranh update(Truyentranh entity) throws Exception {
		try {
			this.em.getTransaction().begin();
			this.em.merge(entity);
			this.em.getTransaction().commit();

			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	public Truyentranh delete(Truyentranh entity) throws Exception {
		try {
			this.em.getTransaction().begin();
			this.em.remove(entity);
			this.em.getTransaction().commit();

			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	public List<Truyentranh> all() {
		String jpql = "SELECT obj FROM truyentranh obj";
		TypedQuery<Truyentranh> query = this.em
				.createQuery(jpql, Truyentranh.class);

		List<Truyentranh> result = query.getResultList();
		return result;
	}
	
	
}
