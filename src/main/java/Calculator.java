public class Calculator implements ICalculator {
    public Integer sum(int a, int b) {return a+b;}
    public Double sqr(Double a) {return Math.sqrt(a);}
    public Integer div(int a, int b) { return b==0 ? null: a/b;}

}
