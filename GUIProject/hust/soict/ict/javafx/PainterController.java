package GUIProject.hust.soict.ict.javafx;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import jvafx.scene.layout.Pane;

public class PainterController {
    @FXML    
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event){
        drawingAreaPane.getChildren().clear();
    }

    @FXML 
    void drawingAreaMouseDragged(Mouse event){
        Circle newCircle new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
