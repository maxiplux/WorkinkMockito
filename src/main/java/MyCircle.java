public class MyCircle implements IMyCircle {
    Double radio;

    MyCircle (Double radio) {
        this.radio=radio;
    }

    public double area() {
        return (this.radio*this.radio)*Math.PI*100;
    }


}
