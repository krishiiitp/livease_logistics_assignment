package com.load.load.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.load.load.entities.Load;
public interface LoadDao extends JpaRepository<Load,String> {
	
}
