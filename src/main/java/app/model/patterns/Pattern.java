package app.model.patterns;

import javafx.beans.property.StringProperty;

import java.util.*;

public abstract class Pattern {
    private Map<String, StringProperty> values;

    public Pattern() {
        values = new HashMap<>();
    }

    public boolean testUnits(Set<String> units){
//        if(units.size() != values.keySet().size())return false; // Identycznosc
        for(String it : values.keySet()){
            if(!units.contains(it))return false;
        }
        return true;
    }

    public abstract String evaluate();

    public abstract String getHint();

    public static List<Pattern> getListOfKnownPatterns(){
        List<Pattern> ret = new ArrayList<>();

        ret.add(new RectangleAreaPattern());
        ret.add(new TriangleAreaPattern());
        ret.add(new SquareAreaPattern());
        ret.add(new TrapezeAreaPattern());

        return ret;
    }

    protected double val(String prop){
        return Double.parseDouble(values.get(prop).getValue());
    }

    public void setProp(String key, StringProperty value){values.put(key,value);}

    protected void props(String ... props){
        for(String it : props){
            values.put(it,null);
        }
    }

}
