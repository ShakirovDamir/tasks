package alishev.day6;

public class Car {

    private int year;
    private String model;
    private String color;

    public Car(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yeardiff(int inputYear){
         return Math.abs(inputYear - year);
    }
}
