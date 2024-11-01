package org.example.by.rublevskaya.toystore.toy.extendToy;

import org.example.by.rublevskaya.toystore.toy.Toy;

public class CubeRubic extends Toy {

    public CubeRubic(String name) {
        super(name, 0);
    }

    @Override
    public String toString() {
        return "Кубик рубик {" +
                " имя ='" + name + '\'' +
                ", уровень заряда =" + batteryLevel+
                '}';
    }

    public void playCubic() {
        System.out.println("Ты играешь с кубиком");
    }
}