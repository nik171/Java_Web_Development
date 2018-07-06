package by.epam.task1chpta.action;

import by.epam.task1chpta.entities.*;

public class CubeLogic {
    public static double calcSquareOfCube(Cube cube){
        return 6 * cube.getA() * cube.getA();
    }

    public static double calcVolumeOfCube(Cube cube){
        return cube.getA() * cube.getA() * cube.getA();
    }
    public static boolean isOnCoordinatePlane(Cube cube){
        for(Point3D i : cube.getPointsArray()){
            if((i.getX() == 0 &&  i.getY() == 0) || (i.getX() == 0 && i.getZ() == 0)
                    || (i.getY() == 0 && i.getZ() == 0)){
                return true;
            }
        }

        return false;
    }

    public static boolean isCube(Cube cube){
        double a = cube.getPointsArray()[0].getX() - cube.getPointsArray()[1].getX();
        double b= cube.getPointsArray()[0].getY() - cube.getPointsArray()[1].getY();
        double c = cube.getPointsArray()[0].getZ() - cube.getPointsArray()[1].getZ();

        if((a == b) && (a == c) && (b == c) && (a != 0)){
            return true;
        }

        return false;
    }

    public static double calculateVolumeRatio(Cube cube){
        double a = cube.getPointsArray()[0].getX() - cube.getPointsArray()[1].getX();
        double v1 = 0;
        double v2 = 0;

        if((cube.getPointsArray()[0].getZ() * cube.getPointsArray()[1].getZ()) < 0){
            v1 = Math.abs(cube.getPointsArray()[0].getZ() * a * a);
            v2 = Math.abs(cube.getPointsArray()[1].getZ() * a * a);

            return v1 / v2;
        }

        return 0;
    }
}
