package app.model;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ValueBox extends HBox{
    private TextField symbol;
    private TextField value;
    private TextField unit;

    public ValueBox(){
        symbol = new TextField();
        symbol.setPromptText("symbol");
        symbol.setMaxWidth(70.0);
        symbol.setAlignment(Pos.CENTER_RIGHT);
        value = new TextField();
        value.setPromptText("value");
        value.setMaxWidth(70.0);
        value.setAlignment(Pos.CENTER_RIGHT);
        unit = new TextField();
        unit.setPromptText("unit");
        unit.setMaxWidth(70.0);
        getChildren().addAll(symbol,new Label("="),value,unit);
    }

    public TextField getSymbol(){
        return symbol;
    }

    public TextField getValue() {
        return value;
    }
}
