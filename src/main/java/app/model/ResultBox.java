package app.model;

import app.model.patterns.Pattern;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;

public class ResultBox extends HBox {
    private Label label;
    private TextField result;

    public ResultBox(Pattern pattern) {
        label = new Label(pattern.toString() + ": ");
        label.setTooltip(new Tooltip(pattern.getHint()));
        result = new TextField();
        getChildren().addAll(label,result);
    }

    public TextField getResult() {
        return result;
    }
}
