package examples.behaviours;

public class SLR {
    private double beta0;
    private double beta1;
    private DataSet dataSet;
    private DiscreteMaths discreteMaths;
    private double predict_Y=0;
    private int n=9;
    public SLR(DataSet dataSet, DiscreteMaths discreteMaths){
        beta0 = 0;
        beta1 = 0;

        this.dataSet = dataSet;
        this.discreteMaths = discreteMaths;
    }



    public void calculateIntersection(){

        System.out.println("B1: "+ pendiente());
        System.out.println("B0: "+ punto_intercetion());

    }
    public void predict_screen_x(int x){
        double vTemp=(beta1+(beta0*x));
        System.out.println("Predict: "+ vTemp);

    }
    private double pendiente(){
        beta0 = (n*(discreteMaths.sumXY(dataSet.getX(), dataSet.getY()))-(discreteMaths.sumX(dataSet.getX()))*(discreteMaths.sumY(dataSet.getY())))/(n*(discreteMaths.cuadro_x(dataSet.getX()))-(discreteMaths.sumX(dataSet.getX())*discreteMaths.sumX(dataSet.getX())));
        return  beta0;
    }
    private double  punto_intercetion(){
        beta1 =(discreteMaths.sumY(dataSet.getY())-(beta0* discreteMaths.sumX(dataSet.getX())))/n;
        return beta1;
    }


}
