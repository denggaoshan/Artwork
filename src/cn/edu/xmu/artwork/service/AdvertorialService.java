package cn.edu.xmu.artwork.service;

import java.util.ArrayList;

import cn.edu.xmu.artwork.entity.Advertorial;


public interface AdvertorialService 
{
	public ArrayList<Advertorial> getAdvertorial();

    public Advertorial getAdvertorialById(String id);
}
