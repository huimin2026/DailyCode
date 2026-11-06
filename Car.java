package com.itheima.a01innerclassdemo1;

public class Car {
    String carBrand;
    int carAge;
    String carColor;

    class Engine{
        String engineBrand;
        int engineAge;

        public Engine(){

        }
        public Engine(String engineBrand, int engineAge){
            this.engineBrand = engineBrand;
            this.engineAge = engineAge;
        }

        public String getEngineBrand(){
            return engineBrand;
        }
        public void setEngineBrand(String engineBrand){
            this.engineBrand = engineBrand;
        }
        public int getEngineAge(){
            return engineAge;
        }
        public void setEngineAge(int engineAge){
            this.engineAge = engineAge;
        }
    }
    public Car(){

    }
    public Car(String carBrand, int carAge, String carColor){
        this.carBrand = carBrand;
        this.carAge = carAge;
        this.carColor = carColor;
    }
    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }
    public int getCarAge(){
        return carAge;
    }
    public void setCarAge(int carAge){
        this.carAge = carAge;
    }
    public String getCarColor(){
        return carColor;
    }
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
    public Engine getEngine(){
        return new Engine();
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    Engine engine;
}
