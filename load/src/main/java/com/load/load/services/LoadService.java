package com.load.load.services;
import java.util.List;
import com.load.load.entities.Load;
public interface LoadService {
	public List<Load> getLoads();
	public Load getLoad(String shipperId);
	public Load addLoad(Load load);
	public Load updateLoad(String shipperId,Load load);
	public void deleteLoad(String shipperId);
}
