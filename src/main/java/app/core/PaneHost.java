package app.core;

import javafx.stage.Stage;

public interface PaneHost {
    OpenPane openPane(String key);
    OpenPane openPane(String key, boolean read, boolean save);
    OpenPane openPane(String key, OpenModel model);
    OpenPane openPane(String key, OpenModel model, boolean read, boolean save);
    void setMainPane(String key);
    void setMainPane(String key, OpenModel model);
    void setMainPane(OpenPane openPane, boolean stackRecord);
    void popMainPane();
    Stage getStage();
}
