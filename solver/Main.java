package solver;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main {

	int x, y;
	int gx, gy;
	map.Map mainMap;
	ImageView iv2;
	public AnimationTimer at;
	static int time = 0;

	public Main(map.Map mapp) {
		mainMap = mapp;

		x = mainMap.getStartX();
		y = mainMap.getStartY();
		gx = mainMap.goalX;
		gy = mainMap.goalY;

		Image image3 = new Image("Face.png");
		iv2 = new ImageView();
		iv2.setImage(image3);
		iv2.setFitWidth(25);
		iv2.setFitHeight(25);
		iv2.setPreserveRatio(false);
		iv2.setSmooth(true);
		iv2.setCache(true);
		update();
		mainMap.getChildren().add(iv2);
		
		
		at = new AnimationTimer() {

			@Override
			public void handle(long now) {
				time++;
				if (time>40) {
					time = 0;
					if (gx == x && gy == y)
						at.stop();
					else if (Math.abs(gx - x) >= Math.abs(gy - y)) {
						Rectangle rect = new Rectangle(25,25);
						rect.setTranslateX(x*25);
						rect.setTranslateY(y*25);
						rect.setFill(Color.WHITE);
						mainMap.getChildren().add(rect);
						if (gx - x > 0)
							x += 1;
						else
							x -= 1;
					} else {
						Rectangle rect = new Rectangle(25,25);
						rect.setTranslateX(x*25);
						rect.setTranslateY(y*25);
						rect.setFill(Color.WHITE);
						mainMap.getChildren().add(rect);
						if (gy - y > 0)
							y += 1;
						else
							y -= 1;
					}
				update();
				
				}
			}

		};

	}

	private void update() {
		iv2.setTranslateX(x * 25);
		iv2.setTranslateY(y * 25);
	}
}
