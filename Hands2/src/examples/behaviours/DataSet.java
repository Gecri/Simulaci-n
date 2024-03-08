package examples.behaviours;
public class DataSet {
    private float[] x;
    private float[] y;

    private float[] z;
    private float[] w;

    private float[] indiasX;
    private float[] indiasY;


    public DataSet(){
        x = new float[]{18, 22, 23, 26, 28, 31, 33};
        y = new float[]{10000, 15000, 18000, 21000, 24000, 26500, 27000};

        z = new float[]{1.2f, 1.4f, 1.6f, 2.1f, 2.3f, 3.0f, 3.1f, 3.3f, 3.3f, 3.8f, 4.0f, 4.1f, 4.1f, 4.2f, 4.6f, 5.0f, 5.2f, 5.4f, 6.0f, 6.1f, 6.9f,
                7.2f, 8.0f, 8.3f, 8.8f, 9.1f, 9.6f, 9.7f, 10.4f, 10.6f};
        w = new float[]{39344.0f, 46206.0f, 37732.0f, 43526.0f, 39892.0f, 56643.0f, 60151.0f, 54446.0f, 64446.0f, 57190.0f, 63219.0f, 55795.0f, 56958.0f, 57082.0f,
                61112.0f, 67939.0f, 66030.0f, 83089.0f, 81364.0f, 93941.0f, 91739.0f, 98274.0f, 101383.0f, 113813.0f, 109432.0f, 105583.0f, 116970.0f, 112636.0f, 122392.0f,
                121873.0f};

        indiasY = new float[]{3711367f, 5585537f, 7793541f, 10016298f, 11726140f, 130081447f, 13979396f, 13775474f, 13965495f, 14159536f, 14364846f, 15174247f, 17334249f,
                18206876f, 18530592f, 18128958f, 17783558f, 17081433f, 15169899f, 13582621f, 11213294f, 9715129f, 8133417f, 6711079f};
        indiasX = new float[]{2050f, 2045f, 2040f, 2035f, 2038f, 2025f, 2028f, 2019f, 2018f, 2017f, 2016f, 2015f, 2018f, 2005f, 2008f, 1998f,
                1990f, 1985f, 1980f, 1975f, 1970f, 1965f, 1960f, 1955f};
    }

    public DataSet(float[] x, float[] y, float[] z, float [] w, float[] indiasX, float[] indiasY){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.indiasX = indiasX;
        this.indiasY = indiasY;

    }

    public float[] getX() {
        return x;
    }

    public float[] getY() {
        return y;
    }

    public float[] getZ() {
        return z;
    }

    public float[] getW() {
        return w;
    }

    public float[] getIndiasX() {
        return indiasX;
    }

    public float[] getIndiasY() {
        return indiasY;
    }

}
