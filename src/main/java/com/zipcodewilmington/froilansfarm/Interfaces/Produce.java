package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public interface Produce extends EdibleObject { //classes implement interfaces, interfaces extend interfaces
    public EdibleObject Yield();

    Boolean fertilized = null;
    Boolean harvested = null;
}