package pack1;
public class C1 {
    public int sum(int a, int b) {
        return a + b;
}
 public int sub(int a, int b) {
        return a - b;
    }
}

package pack1;
public interface I1 {
   int division(int a, int b);
}
package pack2;
import pack1.C1;
import pack1.I1;
public class C2 implements I1 {
    private C1 obj;

    public C2() {
        obj = new C1();
    }
        public void performOperations(int a, int b) {
        int sumResult = obj.sum(a, b);
        int subResult = obj.sub(a, b);
        int divResult = division(a, b);

        System.out.println("Sum: " + sumResult);
        System.out.println("Subtraction: " + subResult);
        System.out.println("Division: " + divResult);
    }

    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero not allowed.");
        }
    }
    public class Exttend {
        public static void main(String[] args) {
            C2 obj1 = new C2();
            obj1.performOperations(10, 5);
        }
    }
}

