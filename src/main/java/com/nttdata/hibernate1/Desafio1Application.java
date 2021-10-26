package com.nttdata.hibernate1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.hibernate1.inter.Client;
import com.nttdata.hibernate1.service.ClientService;

@SpringBootApplication
public class Desafio1Application {
	
	ClientService clientManager;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	public void run(String... args) throws Exception{
		Client client1 = new Client();
		client1.setNum_doc("26526914W");
		client1.setName("Berna");
		client1.setFirst_name("Peña");
		client1.setLast_name("Serrano");
		
		clientManager.addClient(client1);
		
	}
}
