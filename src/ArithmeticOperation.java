//An abstract class ArithmeticExp that will declare an evaluate abstract method
abstract class ArithmeticExp {
    public abstract int evaluate();
}
// Abstract class for Binary expressions
abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;
    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}
// Class representing a number in an arithmetic expressions
class Number extends ArithmeticExp {
    private int value;
    public Number(int value) {
        this.value = value;
    }
    public int evaluate() {
        return value;
    }
}


//class for sum
class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
//class for product
class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
//class for ArithmeticOperation
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
