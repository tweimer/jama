package jama2.util;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Some math functions
 * 
 * @author The MathWorks, Inc. and the National Institute of Standards and
 *         Technology.
 * @version 2.0
 * @see <a href="http://tweimer.github.io/java-matrix/">java-matrix</a>
 */
public class Maths {
    /**
     * 
     */
    public final static double eps = Math.pow(2.0, -52.0);

    /**
     * sqrt(a^2 + b^2) without under/overflow.
     * 
     * @param a cathesus
     * @param b cathesus
     * @return hypot
     **/
    public static double hypot(final double a, final double b) {
        final double r;
        if (abs(a) > abs(b)) {
            r = b / a;
            return abs(a) * sqrt(1 + (r * r));
        } else if (b != 0) {
            r = a / b;
            return abs(b) * sqrt(1 + (r * r));
        } else {
            return 0D;
        }
    }

    /**
     * sqrt(p^2+q^2+r^2)
     * 
     * @param p cathesus
     * @param q cathesus
     * @param r cathesus
     * @return hypot
     */
    public static double hypot(final double p, final double q, final double r) {
        return sqrt((p * p) + (q * q) + (r * r));
    }

    /**
     * abs(p)+abs(q)+abs(r)
     * 
     * @param p cathesus
     * @param q cathesus
     * @param r cathesus
     * @return norm1
     */
    public static double norm1(final double p, final double q, final double r) {
        return abs(p) + abs(q) + abs(r);
    }
}
