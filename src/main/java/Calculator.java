public class Calculator {
    private double firstNumber;
    private double secondNumber;


    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double canAdd() { return this.firstNumber + this.secondNumber; }

    public double canSubtrack() { return this.firstNumber - this.secondNumber; }

    public double canMultiply() { return this.firstNumber * this.secondNumber;}

    public double canDivide() { return this.firstNumber / this.secondNumber; }



}