package com.company.model;

public class GuitarBuilder
{
    private String manufacturer;
    private String model;
    private String type;
    private int numberOfStrings;

    public GuitarBuilder manufacturer(final String manufacturer)
    {
        this.manufacturer = manufacturer;
        return this;
    }

    public GuitarBuilder model(final String model)
    {
        this.model = model;
        return this;
    }

    public GuitarBuilder type(final String type)
    {
        this.type = type;
        return this;
    }

    public GuitarBuilder numberOfStrings(final int numberOfStrings)
    {
        this.numberOfStrings = numberOfStrings;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public Guitar build()
    {
        return new Guitar(this);
    }
}