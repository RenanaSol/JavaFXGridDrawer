import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Mmn11Q2Controller {

    @FXML
    private Canvas canv;
    private GraphicsContext gc;
    
    public void initialize() {
    	gc = canv.getGraphicsContext2D();
    }

    
    @FXML
    // Draws a 10x10 grid and fills 10 random cells in black when button is pressed
    void drawMatrixPressed(ActionEvent event) {
    	gc.clearRect(0, 0, canv.getWidth(),canv.getHeight());
    	Random r = new Random();
    	final int SIZE = 10;
    	final int RECT_SIZE = 10;
    	
    	gc.setStroke(Color.BLACK);
    	gc.setLineWidth(1);
    	
    	for (int i = 0; i <= SIZE; i++) {
            gc.strokeLine(i * RECT_SIZE, 0, i * RECT_SIZE, SIZE * RECT_SIZE);
        }
    	
    	for (int j = 0; j <= SIZE; j++) {
            gc.strokeLine(0, j * RECT_SIZE, SIZE * RECT_SIZE, j * RECT_SIZE);
        }
    	
    	boolean[][] filled = new boolean[SIZE][SIZE];
    	int filledCount = 0;
    	
    	while (filledCount < 10) { // Stop exactly at 10 filled squares
            int i = r.nextInt(SIZE);
            int j = r.nextInt(SIZE);
            if (!filled[i][j]) { // Only fill if not already filled
                filled[i][j] = true; // Mark as filled
                filledCount++; // Increase count

                gc.setFill(Color.BLACK);
                gc.fillRect(i * RECT_SIZE, j * RECT_SIZE, RECT_SIZE, RECT_SIZE);
            }
    	} 
    }

}