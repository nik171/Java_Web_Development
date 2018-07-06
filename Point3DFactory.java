package by.epam.task1chpta.creator;

import by.epam.task1chpta.entities.Point3D;

public class Point3DFactory extends AbstractFactory<Point3D> {
    @Override
    public Point3D createInstance() {
        return new Point3D();
    }
}
