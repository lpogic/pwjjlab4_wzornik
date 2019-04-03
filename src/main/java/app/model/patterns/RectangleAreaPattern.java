package app.model.patterns;

public class RectangleAreaPattern extends Pattern{

    public RectangleAreaPattern() {
        props("a","b");
    }

    @Override
    public String evaluate() {
        try{
            double res;
            res = val("a") * val("b");
            return "" + res + "m^2";
        }catch (Exception e){
            return "Failed";
        }
    }

    @Override
    public String toString() {
        return "Pole prostokata";
    }

    @Override
    public String getHint() {
        return "P = a * b";
    }
}
