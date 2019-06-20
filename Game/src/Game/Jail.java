package Game;

public class Jail extends Cell{

	String name="J";
	public String getName() {
		return name;
	}

	int bailAmount;

	public Jail(int bailAmount) {
		super();
		this.bailAmount = bailAmount;
	}

	@Override
	public void visit(Player p) {
	p.chargeMoney(bailAmount);
		
	}
	
	

}
