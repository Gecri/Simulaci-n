package examples.behaviours;
public class Correlation extends  DiscreteMaths{
    public float sumatoriaCuadradeY(float[] y){
        float totalY = 0;
        for (int i = 0; i < y.length; i++){
            totalY += ((float)Math.pow(y[i], 2));
        }
        return  totalY;
    }

    public float coeficienteCorrelacion(float[] x, float[] y){
        int n = x.length;
        float sumX = sumaX(x);
        float sumY = sumaY(y);
        float sumXY = sumatoriaXY(x, y);
        float cuadradoX = sumatoriaCuadradeX(x);
        float cuadradoY = sumatoriaCuadradeY(y);

        float numerador = n * sumXY - sumX * sumY;
        float denominador = (float) Math.sqrt((n * cuadradoX - Math.pow(sumX, 2)) * (n * cuadradoY - Math.pow(sumY, 2)));

        return numerador / denominador;
    }

    public float coeficienteDeterminacion(float[] x, float[] y, float correla){
        return (float) Math.pow(correla, 2);
    }

}
