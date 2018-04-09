package abst2;

import java.util.ArrayList;

public class main {
	static ArrayList<Unit> list = new ArrayList<Unit>();
	public static void main(String[] args) {
		
//		Unit[] group = new Unit[7];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Marine();
//		group[3] = new Dropship();
//		group[4] = new Dropship();
//		group[5] = new Dropship();
//		group[6] = new Dropship();
//		
//		for(int i = 0; i<group.length; i++) {
//			group[i].move(100, 500);
//			System.out.printf("%d, %d 좌표로 이동\n", 100, 500);
//		}
		
		list.add(new Marine());
		list.add(new Marine());
		list.add(new Marine());
		list.add(new Marine());
		list.add(new Marine());
		list.add(new Tank());
		list.add(new Tank());
		list.add(new Tank());
		list.add(new Dropship());
		
		for(Unit u : list) {
			u.move(200,  300);
		}
	}
	private static void addUnits(Unit u) {
		if(list.size() <= 12) {
			
		}
	}
}
