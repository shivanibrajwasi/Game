package Game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int index;
	private int money;
	List<Hotel> hotels;
	
	
	
	public Player(String name, int money) {
		super();
		this.name = name;
		this.money = money;
		this.hotels=new ArrayList<>();
		this.index=0;
	}
	public void addHotel(Hotel hotel){
		hotels.add(hotel);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void addMoney(int money){
		this.money+=money;
	}
	public void chargeMoney(int money){
		this.money-=money;
	}
	
	
	
}
