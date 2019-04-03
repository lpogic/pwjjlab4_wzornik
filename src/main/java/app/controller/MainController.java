package app.controller;

import app.core.OpenController;
import app.core.OpenModel;
import app.model.MainModel;
import app.model.ResultBox;
import app.model.ValueBox;
import app.model.patterns.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainController extends OpenController {

    private MainModel mainModel;

    @FXML
    private VBox data;

    @FXML
    private Button addData;

    @FXML
    private VBox result;

    @FXML
    private Button addResult;

    @FXML
    private ComboBox<Pattern> pickResult;

    @Override
    public void init(OpenModel model){
        if(model instanceof MainModel) {
            mainModel = (MainModel) model;

            addData.setOnAction((e) -> {
                ValueBox box = mainModel.newValueBox();
                box.getSymbol().textProperty().addListener((o,n,x)->
                    pickResult.getItems().setAll(mainModel.getResultOptions()));
                Button removeButton = new Button("-");
                removeButton.setMaxWidth(Double.MAX_VALUE);
                removeButton.setOnAction((e1) -> {
                    data.getChildren().remove(box);
                    mainModel.removeValueBox(box);
                });
                box.getChildren().addAll(removeButton);
                data.getChildren().add(data.getChildren().size() - 1, box);
            });

            addResult.setOnAction((e)->{
                Pattern pattern = pickResult.getSelectionModel().getSelectedItem();
                if(pattern == null)return;
                ResultBox box = mainModel.newResultBox(pattern);
                Button removeButton = new Button("-");
                removeButton.setMaxWidth(Double.MAX_VALUE);
                removeButton.setOnAction((e1) -> {
                    result.getChildren().remove(box);
                    mainModel.removeResultBox(box);
                });
                box.getChildren().addAll(removeButton);
                result.getChildren().add(result.getChildren().size() - 1, box);
            });

        }
    }

    @FXML
    public void exitAction(ActionEvent event){
        getPaneHost().popMainPane();
    }
}
