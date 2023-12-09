//An abstract class ArithmeticExp that will declare an evaluate abstract method
abstract class ArithmeticExp {
    public abstract int evaluate(); // Abstract method to be implemented by subclasses
}
// Abstract class for Binary expressions
abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;
    // Constructor for binary expressions
    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}
// Class for number in arithmetic expressions
class Number extends ArithmeticExp {
    private int value;
    public Number(int value) {
        this.value = value;
    }
    // Implementation of evaluate method for Number class
    public int evaluate() {
        return value;
    }
}


//class for sum operation
class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }
    // Implementation of evaluate method for sum operation
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
//class for product operation
class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }
    // Implementation of evaluate method for product operation
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
// Main class for ArithmeticOperation
public class ArithmeticOperation {
    public static void main(String[] args) {
        // Constructing the expression 3 + 2 * 5
        ArithmeticExp term = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5))
        );

//output
        System.out.println("Output:" + term.evaluate()); // Evaluating the expression
    }
}
