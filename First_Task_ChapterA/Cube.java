package by.epam.task1chpta.entities;

import java.util.Arrays;

public class Cube {
    private Point3D[] pointsArray;

    public Cube(){}

    public Cube(double a, Point3D[] pointsArray){
        System.arraycopy(pointsArray, 0, this.pointsArray, 0, pointsArray.length);
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
        
        return Arrays.equals(pointsArray, cube.pointsArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pointsArray);
    }

    @Override
    public String toString() {
        return "Cube{" +
                ", pointsArray=" + Arrays.toString(pointsArray) +
                '}';
    }
}
