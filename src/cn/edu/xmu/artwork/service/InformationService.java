package cn.edu.xmu.artwork.service;

import java.util.ArrayList;

import cn.edu.xmu.artwork.entity.*;

public interface InformationService 
{
	public ArrayList<Advertorial> getAdvertorial();

    public Advertorial getAdvertorialById(String id);
}
