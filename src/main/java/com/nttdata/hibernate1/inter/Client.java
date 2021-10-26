package com.nttdata.hibernate1.inter;




import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "client")
public class Client implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long client_id;
	
	@Column(name = "name", columnDefinition = "VARCHAR(60)")
    private String name;
	
	@Column(name = "first_name", columnDefinition = "VARCHAR(60)")
    private String first_name;
	
	@Column(name = "last_name", columnDefinition = "VARCHAR(60)")
    private String last_name;
	
	
	@Column(name = "num_doc", columnDefinition = "VARCHAR(9)", nullable=false)
    private String num_doc;


	public Long getClient_id() {
		return client_id;
	}


	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getNum_doc() {
		return num_doc;
	}


	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}
	
	
}
