package service.imp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionContext;

import service.Service;


import entity.Commodity;
import entity.User;

public class ServiceImp implements Service{

	@Override
	public void login(String username, String password) {
		if(username.equals("denggaoshan") && password.equals("123")){
			ActionContext ctx = ActionContext.getContext();
	    	 HttpServletRequest request =(HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);
	    	 HttpSession session = request.getSession();
	    	 User user = new User();
	    	 user.setNickname("µË¸ßÉ½");
	    	 session.setAttribute("currentUser", user);
		}
	}

	@Override
	public void register(String username, String password) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
	
		session.beginTransaction();  
        
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
        session.save(user);  
        session.getTransaction().commit();      
	}

	@Override
	public void addCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Commodity> getCommodities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity getCommdity(String commodityId) {
		// TODO Auto-generated method stub
		return null;
	}


}
