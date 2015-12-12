package cn.edu.xmu.artwork.service;

import java.sql.Date;
import java.util.ArrayList;

import cn.edu.xmu.artwork.entity.*;

public interface InformationService 
{
	public ArrayList<Advertorial> getAdvertorial();

    public Advertorial getAdvertorialById(String id);
    
    public boolean addAdvertorial(Editor author,String title,String topic,String content,Date begin,Date end,Short position);
}
