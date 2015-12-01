package service;

import java.util.ArrayList;

import entity.Advertorial;

public interface AdvertorialService 
{
	public ArrayList<Advertorial> getAdvertorial();

    public Advertorial getAdvertorialById(String id);
}
