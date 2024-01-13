package com.load.load.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.load.load.entities.Load;
import com.load.load.services.LoadService;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoadController {
	@Autowired
	private LoadService loadService;
	@GetMapping("/load")
	public List<Load> getLoads(){
		return this.loadService.getLoads();
	}
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(loadId);
	}
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		return this.loadService.addLoad(load);
	}
	@PutMapping("/load/{loadId}")
	public Load updateLoad(@PathVariable String loadId,@RequestBody Load load) {
		return this.loadService.updateLoad(loadId,load);
	}
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId) {
		this.loadService.deleteLoad(loadId);
	}
}
