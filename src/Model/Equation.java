package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamm
 */
public class Equation {

    protected Double a, b, c = null;
    protected Double x1, x2 = null;

    public Equation(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Equation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public List<Double> getEvenNumbers() {
//        TODO: Check for X1 and X2
        List<Double> res = new ArrayList<>();
        if (a % 2 == 0) {
            res.add(a);
        }
        if (b % 2 == 0) {
            res.add(b);
        }
        if (c != null) {
            if (c % 2 == 0) res.add(c);
        }
        return res;
    }

    public List<Double> getOddNumbers() {
        //        TODO: Check for X1 and X2

        List<Double> res = new ArrayList<>();
        if (a % 2 != 0) {
            res.add(a);
        }
        if (b % 2 != 0) {
            res.add(b);
        }
        if (c != null) {
            if (c % 2 != 0) res.add(c);
        }
        return res;
    }

    public List<Double> getPerfectSquare() {
        //        TODO: Check for X1 and X2
        List<Double> res = new ArrayList<>();
        if (isPerfectSquare(a)) {
            res.add(a);
        }
        if (isPerfectSquare(b)) {
            res.add(b);
        }
        if (c != null) {
            if (isPerfectSquare(c)) res.add(c);
        }
        return res;
    }

    private boolean isPerfectSquare(Double num) {
        Double temp = Math.sqrt(num);
        return temp * temp == num;
    }

}
