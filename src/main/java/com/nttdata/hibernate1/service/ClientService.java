package com.nttdata.hibernate1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.hibernate1.inter.Client;
import com.nttdata.hibernate1.inter.ClientDaoImpl;

@Service
public class ClientService {
	
	@Autowired
	private ClientDaoImpl clientDao;
	
	
	public void addClient(Client client) {
		clientDao.insert(client);
		
	}
	
	public void deleteClient(Client client) {
		clientDao.delete(client);
	}
	

	
}
