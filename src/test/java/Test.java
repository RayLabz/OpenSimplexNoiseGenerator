import com.raylabz.opensimplex.OpenSimplexNoise;
import com.raylabz.opensimplex.Range;
import com.raylabz.opensimplex.RangedValue;

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        OpenSimplexNoise noise = new OpenSimplexNoise(new Random().nextLong());
        RangedValue value = noise.getNoise2D(0, 0);
        final RangedValue[][] noise2DArray = noise.getNoise2DArray(0, 0, 2500, 2500);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (RangedValue[] arr : noise2DArray) {
            for (RangedValue d : arr) {
                double v = d.getValue(new Range(-255, 255));
                if (v > max) max = v;
                if (v < min) min = v;
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);


        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime));
    }

}
