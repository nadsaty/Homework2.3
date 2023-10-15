package transports;

import service.Serviceable;

public abstract class Transport implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Transport (String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    //Геттеры
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
}