package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

	List<Cell> board;
	List<Player> players;

	public Game() {
		super();

	}

	public List<Cell> getBoard() {
		return board;
	}

	public void setBoard(List<Cell> board) {
		this.board = board;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void play(Player player) {
		int index = getDiceNumber();
		int newIndex = (player.getIndex() + index) % board.size();
		player.setIndex(newIndex);
		Cell cell = null;
		switch (board.get(newIndex).getName()) {
		case "E":
			cell = new Empty();
			break;
		case "H":
			cell = new Hotel(200, 50);
			break;
		case "J":
			cell = new Jail(50);
			break;
		case "T":
			cell = new Threasure(100);
			break;

		}

		cell.visit(player);

	}

	public int getDiceNumber() {
		Random rand = new Random();

		return rand.nextInt(5);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		List<Cell> l = new ArrayList<>();
		l.add(new Empty());
		l.add(new Empty());
		l.add(new Empty());
		l.add(new Threasure(100));
		l.add(new Empty());
		l.add(new Jail(50));
		l.add(new Empty());
		l.add(new Threasure(100));
		l.add(new Hotel(500, 50));
		l.add(new Empty());
		l.add(new Jail(50));
		l.add(new Empty());
		l.add(new Threasure(100));
		l.add(new Empty());
		l.add(new Empty());
		l.add(new Jail(50));
		l.add(new Empty());
		l.add(new Threasure(100));
		l.add(new Empty());
		l.add(new Hotel(500, 50));

		Player p1 = new Player("A", 1000);
		Player p2 = new Player("B", 1000);
		Player p3 = new Player("C", 1000);
		List<Player> p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);

		game.setBoard(l);
		game.setPlayers(p);

		for (int i = 0; i < 20; i++) {
			for (Player player : game.players) {

				game.play(player);
				System.out.print("Name " + player.getName() + " Index " + player.getIndex() + " Money "
						+ player.getMoney() + " Hotel " + player.hotels.size());
				System.out.println();
			}
		}
	}

}
