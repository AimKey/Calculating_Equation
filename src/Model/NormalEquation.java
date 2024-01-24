package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamm
 */
public class NormalEquation extends Equation {

    public NormalEquation(Double a, Double b) {
        super(a, b);
    }
//    Ax + B = 0

    public List<Double> getSolutions() {
        List<Double> res = new ArrayList<>();
        Double result;
        if (a == 0 && b != 0) {
            if (a != 0) {
                result = -b / a;
                x1 = result;
                res.add(result);
            }
        }
        return res;
    }
}
