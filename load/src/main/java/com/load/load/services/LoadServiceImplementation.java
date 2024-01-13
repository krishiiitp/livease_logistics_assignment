package com.load.load.services;
import java.util.List;
import com.load.load.entities.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.load.load.dao.LoadDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
@Service 
public class LoadServiceImplementation implements LoadService {
	@PersistenceContext
    private EntityManager entityManager;
	@Autowired
	private LoadDao loadDao;
	@Override
	public List<Load> getLoads() {
		return loadDao.findAll();
	}
	@Override
	public Load getLoad(String shipperId) {
		return loadDao.getReferenceById(shipperId);
	}
	@Override
	public Load addLoad(Load load) {
		loadDao.save(load);
		return load;
	}
	@Override
	public Load updateLoad(String shipperId,Load load) {
		Load entity=entityManager.find(Load.class, shipperId);
		loadDao.delete(entity);
		entity.setLoadingPoint(load.getLoadingPoint());
		entity.setUnloadingPoint(load.getUnloadingPoint());
		entity.setProductType(load.getProductType());
		entity.setTruckType(load.getTruckType());
		entity.setNoOfTrucks(load.getNoOfTrucks());
		entity.setWeight(load.getWeight());
		entity.setComment(load.getComment());
		entity.setDate(load.getDate());
		loadDao.save(entity);
		return entity;
	}
	@Override
	public void deleteLoad(String shipperId) {
		Load entity=entityManager.find(Load.class, shipperId);
	    if(entity==null) {
	        throw new EntityNotFoundException("Load with shipperId " + shipperId + " not found");
	    }else {
	    	loadDao.delete(entity);
	    }
	}
}
