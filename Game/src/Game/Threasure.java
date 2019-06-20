package Game;

public class Threasure extends Cell{

	int tresureAmount;
	String name="T";

	public String getName() {
		return name;
	}

	public Threasure(int tresureAmount) {
		super();
		this.tresureAmount = tresureAmount;
	}

	@Override
	public void visit(Player p) {
		p.addMoney(tresureAmount);
		
	}
	
	
	
	

}
