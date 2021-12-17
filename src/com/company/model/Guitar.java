package com.company.model;

public class Guitar
{
    private final String manufacturer;
    private final String model;
    private final String type;
    private final int numberOfStrings;

    Guitar(final GuitarBuilder guitarBuilder)
    {
        this.manufacturer = guitarBuilder.getManufacturer();
        this.model = guitarBuilder.getModel();
        this.type = guitarBuilder.getType();
        this.numberOfStrings = guitarBuilder.getNumberOfStrings();
    }
}