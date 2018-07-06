package by.epam.task1chpta.creator;

import by.epam.task1chpta.entities.Cube;

public class CubeFactory extends AbstractFactory<Cube>{
    @Override
    public Cube createInstance() {
        return new Cube();
    }
}
