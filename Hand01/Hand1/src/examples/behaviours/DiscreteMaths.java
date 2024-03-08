package examples.behaviours;

public class DiscreteMaths {
    public double sumX(double x[]){
        float totalX = 0;
        for(int i = 0; i < x.length; i++) totalX += x[i];
        return totalX;
    }

    public double sumY(double y[]){
        float totalY = 0;
        for(int i = 0; i < y.length; i++)
            totalY +=  y[i];
        return  totalY;
    }
    public double sumXY(double x[], double y[]){

        double totalXY = 0;
        for (int i = 0; i < x.length; i++)
            totalXY += (x[i] * y[i]);

        return totalXY;
    }
    public  double cuadro_x(double x[]){
        double total_X_2=0;
        for (int i=0;i<x.length;i++){
           total_X_2+=(x[i]*x[i]);

       }
        return  total_X_2;
    }

}
