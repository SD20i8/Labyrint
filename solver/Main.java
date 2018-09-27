package solver;

import javafx.animation.AnimationTimer;

public class Main {
	
		int x, y, dir;
		
		map.Map map;
	public Main(map.Map mapIn) {
		
		map = mapIn;
		 x = map.getStartX();
		 y = map.getStartY();
		 dir = 1;

		new AnimationTimer() {

			@Override
			public void handle(long now) {

				next(x, y);

			}
		}.start();
	}

	public void next(int x, int y) {
		
		if()

		for (int i = 0; i < 4; i++)
			if (!(i == dir)) {
				
				
			}
	}
}
