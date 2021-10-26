package com.nttdata.hibernate1.inter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {
	
	@Autowired
	private EntityManager entity;
	@Override
	@Transactional
	public void insert(Client insClient) {
		// TODO Auto-generated method stub
		
	
		Session currentSession = entity.unwrap(Session.class);
		
		currentSession.save(insClient);
		
		currentSession.close();
		
	}

	
	@Override
	@Transactional
	public void delete(Client delClient) {
		Session currentSession = entity.unwrap(Session.class);
		
		currentSession.delete(delClient);;
		
		currentSession.close();
	}

	@Override
	@Transactional
	public void update(Client uptClient) {
		Session currentSession = entity.unwrap(Session.class);
		
		currentSession.update(uptClient);;;
		
		currentSession.close();

	}

	@Override
	@Transactional
	public Client searchById(Long clientId) {
		// TODO Auto-generated method stub
		
		Session currentSession = entity.unwrap(Session.class);
		
		Client result = currentSession.get(Client.class, clientId);
		
		currentSession.close();
		
		return result;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Client> searchAll() {
		Session currentSession = entity.unwrap(Session.class);
		
		List<Client> list = currentSession.createQuery("FROM Client").list();
		
		currentSession.close();
		
		return list;
	}

	@Override
	public List<Client> clientsearchByName(Client name, Client firstName, Client lastname) {
		Session currentSession = entity.unwrap(Session.class);
		
		List<Client> clientList = currentSession.createQuery("FROM Client WHERE name='" + name +"' first_name='" + firstName + "' second_name='" + lastname + "'").list();
		
		currentSession.close();
		
		return clientList;
	}

}
