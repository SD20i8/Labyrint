package blocks;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ClosedBlock extends Block{

	public ClosedBlock() {
		Image image3 = new Image("stone.png");
		 ImageView iv2 = new ImageView();
        iv2.setImage(image3);
        iv2.setFitWidth(25);
        iv2.setFitHeight(25);
        iv2.setPreserveRatio(false);
        iv2.setSmooth(true);
        iv2.setCache(true);
        
      g = false;
		this.getChildren().add(iv2);
	}
	
}
