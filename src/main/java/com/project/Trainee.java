package com.project;
import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="EMP9")
@AttributeOverrides({
	@AttributeOverride(name="payperhour",column=@Column(name="payperhour")),
	@AttributeOverride(name="contractperiod",column=@Column(name="contractperiod"))
})
public class Trainee extends Employee{
	private float payperhour;
	private String contractperiod;
	
	public Trainee(String name, float payperhour, String contractperiod) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
}
