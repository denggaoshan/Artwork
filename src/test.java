import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.RoleDAO;
import entity.Role;

public class test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Role role=new Role();
        role.setCount(100);
        role.setDescription("test");
        role.setGuid("100");
        role.setName("test");
        
        RoleDAO roleDao=new RoleDAO();
        
        Session s=roleDao.getSession();
        Transaction tx=s.beginTransaction();
        roleDao.save(role);
        tx.commit();
	}

}
