package app.model.patterns;

public class TriangleAreaPattern extends Pattern{

    public TriangleAreaPattern() {
        props("a","h");
    }

    @Override
    public String evaluate() {
        try{
            double res;
            res = val("a") * val("h") / 2;
            return "" + res + "m^2";
        }catch (Exception e){
            return "Failed";
        }
    }

    @Override
    public String toString() {
        return "Pole trojkata";
    }

    @Override
    public String getHint() {
        return "P = (a * h) / 2";
    }
}
