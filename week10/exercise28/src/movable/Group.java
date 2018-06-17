package movable;

import java.util.List;
import java.util.ArrayList;

public class Group implements Movable {

	private List<Movable> movableElements = new ArrayList<>();

	public String toString() {

		String singleOrganismPosition = "";
		for (Movable movable : this.movableElements) {
			singleOrganismPosition += movable.toString() + "\n";
		}
		return singleOrganismPosition;
	}

	public void addToGroup(Movable movable) {
		this.movableElements.add(movable);
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		for (Movable movable : this.movableElements) {
			movable.move(dx, dy);
		}
	}

}
