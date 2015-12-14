package cn.edu.xmu.artwork.service.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.xmu.artwork.dao.ArtistDao;
import cn.edu.xmu.artwork.dao.ChiefEditorDao;
import cn.edu.xmu.artwork.dao.EditorDao;
import cn.edu.xmu.artwork.dao.UserDao;
import cn.edu.xmu.artwork.entity.Artist;
import cn.edu.xmu.artwork.entity.ChiefEditor;
import cn.edu.xmu.artwork.entity.Editor;
import cn.edu.xmu.artwork.entity.User;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

public class UserServiceImp implements UserService
{
    private UserDao userDao;
    /*
    private ArtistDao artistDao;
    
    private EditorDao editorDao;
    
	private ChiefEditorDao chiefEditorDao;
    
    public ArtistDao getArtistDao() 
    {
		return artistDao;
	}

	public void setArtistDao(ArtistDao artistDao) 
	{
		this.artistDao = artistDao;
	}

	public EditorDao getEditorDao() 
	{
		return editorDao;
	}

	public void setEditorDao(EditorDao editorDao)
	{
		this.editorDao = editorDao;
	}

	public ChiefEditorDao getChiefEditorDao()
	{
		return chiefEditorDao;
	}

	public void setChiefEditorDao(ChiefEditorDao chiefEditorDao) 
	{
		this.chiefEditorDao = chiefEditorDao;
	}*/
    
    public void setUserDao(UserDao userDao)
    {
    	this.userDao = userDao;
    }
    
    public UserDao getUserDao()
    {
    	return userDao;
    }

	@Override
	public boolean register(String phone, String password, String nickName)
	{	
		Session s=getUserDao().getSession();
		Transaction tx=s.beginTransaction();
		
		User user = new User();
		user.setId(Utils.createGUID());
		user.setPhone(phone);
		user.setPassword(Utils.MD5(password));
		user.setAvatar("/uploadImg/Avatar/default.png");
		user.setNickName(nickName);
		user.setBalance(0.0);
		user.setIsDisable(false);
		
		getUserDao().save(user);
		
		tx.commit();
		
		return true;
	}

	@Override
	public boolean login(String phone, String password) 
	{
        String md5Tmp=Utils.MD5(password);	
		
		List<User> users= getUserDao().findByPhone(phone);
		
		if(users.size()>0 && users.get(0).getPassword().equals(md5Tmp)) 
		{
			//System.out.print(users.get(0).getNickName()+"--------------");
			Utils.setCurrentUser(users.get(0));
			getUserDao().getSession().clear();
			return true;
		}
		
		return false;
	}

	@Override
	public boolean userExists(String phone) 
	{
		List<User> ret = getUserDao().findByPhone(phone);
	    return !ret.isEmpty();
	}

	@Override
	public List<Artist> getAllArtists() 
	{	
		List<Artist> ret = getUserDao().findAllByClassName("Artist");
		return ret;
	}

	@Override
	public List<User> getAllUsers() 
	{
		List<User> ret = getUserDao().findAllByClassName("User");
		return ret;
	}

	@Override
	public List<Editor> getAllEditors() 
	{
		List<Editor> ret = getUserDao().findAllByClassName("Editor");
	    return ret;
	}

	@Override
	public List<ChiefEditor> getAllChiefEditors() 
	{
		List<ChiefEditor> ret = getUserDao().findAllByClassName("ChiefEditor");
	    return ret;
	}
}
