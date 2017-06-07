package com.icss.test.homework3;

/**
 * Created by 29185 on 2017/5/24.
 */
public class JieMu {
    private int X;
    private int W;
    private int D;
    private int Z;
    JieMu(){}
    JieMu(int X,int W,int D,int Z){
        this.X = X;
        this.W = W;
        this.D = D;
        this.Z = Z;
    }

    public int getD() {
        return D;
    }

    public int getW() {
        return W;
    }

    public int getX() {
        return X;
    }

    public int getZ() {
        return Z;
    }

    public void setD(int d) {
        D += d;
    }

    public void setW(int w) {
        W += w;
    }

    public void setX(int x) {
        X += x;
    }

    public void setZ(int z) {
        Z += z;
    }
}
