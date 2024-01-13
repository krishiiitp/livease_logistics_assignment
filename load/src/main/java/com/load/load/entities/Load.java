package com.load.load.entities;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import org.hibernate.proxy.HibernateProxy;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "`load`")
public class Load {
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	private String comment;
	@Id
	private String shipperId;
	private String Date;
	@JsonIgnore
    private HibernateProxy hibernateLazyInitializer;
	public Load(String loadingPoint,String unloadingPoint,String productType,String truckType,String noOfTrucks,String weight,String comment,String Date) {
		super();
		this.loadingPoint=loadingPoint;
		this.unloadingPoint=unloadingPoint;
		this.productType=productType;
		this.truckType=truckType;
		this.noOfTrucks=noOfTrucks;
		this.weight=weight;
		this.comment=comment;
		this.Date=Date;
	}
	public Load(String loadingPoint,String unloadingPoint,String productType,String truckType,String noOfTrucks,String weight,String comment,String shipperId,String Date) {
		super();
		this.loadingPoint=loadingPoint;
		this.unloadingPoint=unloadingPoint;
		this.productType=productType;
		this.truckType=truckType;
		this.noOfTrucks=noOfTrucks;
		this.weight=weight;
		this.comment=comment;
		this.shipperId=shipperId;
		this.Date=Date;
	}
	public Load() {
		super();
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + comment + ", shipperId=" + shipperId + ", Date=" + Date + "]";
	}
}
