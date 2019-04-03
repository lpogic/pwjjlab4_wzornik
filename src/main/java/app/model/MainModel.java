package app.model;

import app.core.OpenModel;
import app.model.patterns.Pattern;
import javafx.beans.binding.Bindings;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainModel extends OpenModel {
    private List<ValueBox> data;
    private List<ResultBox> results;
    private List<Pattern> patterns;

    public MainModel() {
        data = new ArrayList<>();
        results = new ArrayList<>();
        patterns = Pattern.getListOfKnownPatterns();
    }

    public ValueBox newValueBox(){
        ValueBox box = new ValueBox();
        data.add(box);
        return box;
    }

    public void removeValueBox(ValueBox box){
        data.remove(box);
    }

    public ResultBox newResultBox(Pattern pattern){
        ResultBox box = new ResultBox(pattern);
        for(ValueBox it : data){
            pattern.setProp(it.getSymbol().getText(),it.getValue().textProperty());
            it.getValue().textProperty().addListener((o,n,y)->box.getResult().setText(pattern.evaluate()));
        }
        results.add(box);
        return box;
    }

    public List<Pattern> getResultOptions(){
        Set<String> units = new HashSet<>();
        for(ValueBox it : data){
            units.add(it.getSymbol().getText());
        }
        return patterns.stream().filter(e->e.testUnits(units)).collect(Collectors.toList());
    }

    public void removeResultBox(ResultBox box){
        results.remove(box);
    }
}
