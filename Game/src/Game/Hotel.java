package Game;

public class Hotel extends Cell {
	String name="H";
	public String getName() {
		return name;
	}

	Player owner;
	boolean isSold;
	int price;
	int charge;
	public Hotel(int price, int charge) {
		super();
		this.price = price;
		this.charge = charge;
		this.isSold=false;
		this.owner=null;
	}
	
	public boolean visitHotel(Player player){
		if(!isSold&&player.getMoney()>=price)
		{
			this.owner=player;
			player.chargeMoney(price);
			isSold=true;
			player.addHotel(this);
			return true;
		}
		else
		{
			player.chargeMoney(charge);
			
			owner.addMoney(charge);
			return false;
	   
		}
	}

	@Override
	public void visit(Player p) {
		
		visitHotel(p);
	}
	

}
