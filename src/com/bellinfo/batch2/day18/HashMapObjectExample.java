package com.bellinfo.batch2.day18;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapObjectExample {

	public static void main(String[] args) {
		HashMap<String, WebSite> webSitehm = new HashMap<>();
		WebSite ws1 = new WebSite();
		WebSite ws2 = new WebSite();
		WebSite ws3 = new WebSite();
		WebSite ws4 = new WebSite();
		WebSite ws5 = new WebSite();
		ws1.setName("google");
		ws1.setUri("google.com");
		ws1.setCost(1000);
		ws2.setName("facebook");
		ws2.setUri("facebook.com");
		ws2.setCost(1500);
		ws3.setName("twitter");
		ws3.setUri("Twitter.com");
		ws3.setCost(100);
		ws4.setName("cnn");
		ws4.setUri("cnn.com");
		ws4.setCost(10);
		ws5.setName("cnn");
		ws5.setUri("cnn.com");
		ws5.setCost(100);
		
		webSitehm.put("google", ws1);
		webSitehm.put("facebook", ws2);
		webSitehm.put(ws3.getName(), ws3);
		webSitehm.put(ws4.getName(), ws4);
		webSitehm.put(ws4.getName(), ws4);
		
		Iterator<String> itr1 = webSitehm.keySet().iterator();
		
		while(itr1.hasNext()){
			String key = itr1.next();
			WebSite webSite = webSitehm.get(key);
			//System.out.println(webSite);
		}
		
		/* ---------------  */
		HashMap<WebSite,Integer> hmObject = new HashMap<WebSite, Integer>();
		hmObject.put(ws1, 1);
		hmObject.put(ws2, 3);
		hmObject.put(ws3, 2);
		hmObject.put(ws4, 4);
		hmObject.put(ws5, 6);		
		Iterator<WebSite> itr2 = hmObject.keySet().iterator();
		
		while(itr2.hasNext()){
			WebSite key = itr2.next();
			int rank = hmObject.get(key);
			System.out.println(key + " Rank: "+ rank);
		}
		

	}

}

class WebSite implements Serializable{
	
	private String name;
	private String uri;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	public int hashCode(){
		int x= 7;
		return x*21+ getCost();
		
	}
	public boolean equals(Object o){
		if(o instanceof WebSite)
		{
			WebSite ws =(WebSite) o;
			if(this.getName().equals(ws.getName())){
				return true;
			}
		}
		return false;
		
	}
	
	public String toString(){
		return "Name: " + getName() +" Cost: " +cost + " uri: " + uri ;
	}
	
}