package examples.behaviours;
import java.util.Random;
public class DiscreteMaths {
    Random rand = new Random();

    public float sumaX(float[] x){
        float totalsumX = 0;
        for (int i = 0; i < x.length; i++){
            totalsumX += x[i];
        }
        return totalsumX;
    }

    public float sumaY(float[] y){
        float totalsumY = 0;
        for (int i = 0; i < y.length; i++){
            totalsumY += y[i];
        }
        return totalsumY;
    }

    public float sumatoriaXY(float[] x, float[] y){
        float totalXY = 0;
        for (int i = 0; i < x.length; i++){
            totalXY += (x[i] * y[i]);
        }
        return totalXY;
    }

    public float sumatoriaCuadradeX(float[] x){
        float totalX = 0;
        for (int i = 0; i < x.length; i++){
            totalX += ((float)Math.pow(x[i], 2));
        }
        return  totalX;
    }

    public float B1(float[] x, float[] y){
        int n = x.length;
        float sumX = sumaX(x);
        float sumY = sumaY(y);
        float sumatoriaXY = sumatoriaXY(x, y);
        float cuadradoX = sumatoriaCuadradeX(x);

        return (n * sumatoriaXY - sumX * sumY) / (n * cuadradoX - sumX * sumX);
    }

    public float promedioX(float[] x){
        int n = x.length;
        float promedio = 0;
        for (int i = 0; i < x.length; i++){
            promedio += (x[i] / n);
        }
        return promedio;
    }

    public float promedioY(float[] y){
        int n = y.length;
        float promedio = 0;
        for (int i = 0; i < y.length; i++){
            promedio += (y[i] / n);
        }
        return promedio;
    }

    public float B0(float[]x, float[] y, float b1){
        float promedioX = promedioX(x);
        float promedioY = promedioY(y);

        return promedioY - b1 * promedioX;
    }

    public float SLR(float b1, float b0){
        int x = rand.nextInt(20) + 1;
        return b0 + b1 * x;
    }
}
