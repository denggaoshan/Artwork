package cn.edu.xmu.artwork.entity;

public class Advertisement extends Information{
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getToUrl() {
		return toUrl;
	}

	public void setToUrl(String toUrl) {
		this.toUrl = toUrl;
	}

	private Artist artist;//发布广告的人
	
	//private Commodity commodity;  //广告对应的商品
	
	//private Store store;
	private String toUrl; //点击广告之后访问的地址
}
