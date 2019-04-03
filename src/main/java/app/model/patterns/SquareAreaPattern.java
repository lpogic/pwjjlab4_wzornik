package app.model.patterns;

public class SquareAreaPattern extends Pattern{

    public SquareAreaPattern() {
        props("a");
    }

    @Override
    public String evaluate() {
        try{
            double res;
            res = val("a") * val("a");
            return "" + res + "m^2";
        }catch (Exception e){
            return "Failed";
        }
    }

    @Override
    public String toString() {
        return "Pole kwadratu";
    }

    @Override
    public String getHint() {
        return "P = a * a";
    }
}
