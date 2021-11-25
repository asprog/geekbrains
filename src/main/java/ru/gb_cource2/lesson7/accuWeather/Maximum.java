package ru.gb_cource2.lesson7.accuWeather;

public class Maximum {

    private double Value;
    private String Unit;
    private int UnitType;
    public void setValue(double Value) {
        this.Value = Value;
    }
    public double getValue() {
        return Value;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }
    public String getUnit() {
        return Unit;
    }

    public void setUnitType(int UnitType) {
        this.UnitType = UnitType;
    }
    public int getUnitType() {
        return UnitType;
    }
}
