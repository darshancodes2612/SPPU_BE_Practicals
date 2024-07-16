import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Fibonacci{
    private void generateSeriesNonRecursive(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than zero");
        }
    
        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) {
            series[1] = 1;
        }
    
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
    
        for (int i = 0; i < series.length; i++) {
            System.out.print(series[i]+" ");
        }
        System.out.println();
    }

    private int generateSeriesRecursive(int n){
        if (n<=1) {
            return n;
        }
        return (generateSeriesRecursive(n-1)+ generateSeriesRecursive(n-2));
    }

    public static void main(String[] args){
        
        Fibonacci obj = new Fibonacci();
        
        Instant start = Instant.now();
        System.out.println("Start time is - "+start);
        System.out.println("Series without using recursion");
        obj.generateSeriesNonRecursive(2);
        Instant end = Instant.now();
        System.out.println("End time is = "+end);
        Duration elapsedTime = Duration.between(start, end);
        System.out.println("Elapsed time without using recursion"+" "+elapsedTime);

        Instant startRecursive = Instant.now();
        System.out.println("Start time is - "+startRecursive);
        System.out.println("Recursive series"+obj.generateSeriesRecursive(2));
        Instant endRecursive = Instant.now();
        System.out.println("End time is = "+" "+endRecursive);
        Duration elapsedTimeRecursive = Duration.between(startRecursive, endRecursive);
        System.out.println("Elapsed time by using recursion"+elapsedTimeRecursive);
    
    }
}