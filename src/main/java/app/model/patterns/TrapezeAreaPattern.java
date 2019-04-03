package app.model.patterns;

public class TrapezeAreaPattern extends Pattern {

    public TrapezeAreaPattern() {
        props("a","b","h");
    }

    @Override
    public String evaluate() {
        try{
            double res;
            res = (val("a") + val("b")) * val("h") / 2;
            return "" + res + "m^2";
        }catch (Exception e){
            return "Failed";
        }
    }

    @Override
    public String toString() {
        return "Pole trapezu";
    }

    @Override
    public String getHint() {
        return "P = (a + b)*h/2";
    }
}
