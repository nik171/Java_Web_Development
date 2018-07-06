package by.epam.task1chpta.entities;

import java.util.Arrays;

public class Cube {
    private double a;
    private Point3D[] pointsArray;

    public Cube(){}

    public Cube(double a, Point3D[] pointsArray){
        this.a = a;
        System.arraycopy(pointsArray, 0, this.pointsArray, 0, pointsArray.length);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Point3D[] getPointsArray() {
        return pointsArray;
    }

    public void setPointsArray(Point3D[] pointsArray) {
        this.pointsArray = pointsArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cube cube = (Cube) o;

        if (Double.compare(cube.a, a) != 0) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(pointsArray, cube.pointsArray);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + Arrays.hashCode(pointsArray);
        return result;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                ", pointsArray=" + Arrays.toString(pointsArray) +
                '}';
    }
}
