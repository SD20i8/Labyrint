package solver;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main {

	int x, y;
	int gx, gy;
	map.Map map;
	ImageView iv2;
	AnimationTimer at;

	public Main(map.Map mapp) {
		map = mapp;

		x = map.getStartX();
		y = map.getStartY();

		Image image3 = new Image("Face.png");
		iv2 = new ImageView();
		iv2.setImage(image3);
		iv2.setFitWidth(25);
		iv2.setFitHeight(25);
		iv2.setPreserveRatio(false);
		iv2.setSmooth(true);
		iv2.setCache(true);
		iv2.setTranslateX(x * 25);
		iv2.setTranslateY(y * 25);
		map.getChildren().add(iv2);

		at = new AnimationTimer() {

			@Override
			public void handle(long now) {
				if (now == 50)
					if (gx == x && gy == y)
						at.stop();
					else if (Math.abs(gx - x) > Math.abs(gy - y)) {
						if(gx-x>0)
							x-=1;
					} else {

					}
			}

		};

	}

}
