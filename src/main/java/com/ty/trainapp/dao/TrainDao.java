package com.ty.trainapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.trainapp.dto.Train;

@Repository
public class TrainDao {
	@Autowired
	private EntityManagerFactory factory;

	public Train saveTrain(Train train) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(train);
			transaction.commit();
			return train;

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return null;
		}
	}

	public Train searchTrain(int trainNumber) {

		EntityManager manager = factory.createEntityManager();

		return manager.find(Train.class, trainNumber);
	}



	public List<Train> getAllTrain(int offset, int limit) {
	    EntityManager manager = factory.createEntityManager();

	    Query query = manager.createQuery("FROM Train");
	    query.setFirstResult(offset);
	    query.setMaxResults(limit);

	    return query.getResultList();
	}


	public Train deleteTrain(Train getTrain) {
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			Train delete=manager.merge(getTrain);
			manager.remove(delete);
			tx.commit();
			return delete;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			return null;
		}
		
	}

	public Train getUpdateTrain(Train getTrain) {
		
		
EntityManager entityManager=factory.createEntityManager();
		
		EntityTransaction tx=entityManager.getTransaction();
		
		try {
			tx.begin();
			entityManager.merge(getTrain);
			tx.commit();
			return getTrain ;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		
		return null;
		}
	
	}

}
