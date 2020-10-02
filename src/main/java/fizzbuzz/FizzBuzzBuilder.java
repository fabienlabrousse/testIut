package fizzbuzz;

public class FizzBuzzBuilder {
    private String a;
    private String b;
    private String c;

    public FizzBuzzBuilder setA(String a) {
        this.a = a;
        return this;
    }

    public FizzBuzzBuilder setB(String b) {
        this.b = b;
        return this;
    }

    public FizzBuzzBuilder setC(String c) {
        this.c = c;
        return this;
    }

    public FizzBuzz build() {
        return new FizzBuzz(a, b, c);
    }
}