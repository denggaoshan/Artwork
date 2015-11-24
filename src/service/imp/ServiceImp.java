package service.imp;

import hibernate.SessionFactory;

import org.hibernate.Transaction;

import dao.RoleDAO;
import dao.UserDAO;
import entity.Role;
import entity.User;
import service.Service;

public class ServiceImp implements Service{

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void register(String username, String password) {
		
		Transaction transaction= SessionFactory.getSession().beginTransaction();
		 
		RoleDAO roleDao = new RoleDAO();
		Role role = new Role();
		role.setCount(0);
		role.setDescription("haha");
		role.setGuid("899f4558-87ca-4e66-9b7a-d6a8b92eed1c");
		role.setName("Fucker");
		roleDao.merge(role);
		
		transaction.commit();
	}

}
