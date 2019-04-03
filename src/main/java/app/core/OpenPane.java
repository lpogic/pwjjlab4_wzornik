package app.core;

import javafx.scene.layout.Pane;

public class OpenPane {
    private Pane pane;
    private OpenController controller;

    public OpenPane(Pane pane, OpenController controller) {
        this.pane = pane;
        this.controller = controller;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public OpenController getController() {
        return controller;
    }

    public void setController(OpenController controller) {
        this.controller = controller;
    }
}
