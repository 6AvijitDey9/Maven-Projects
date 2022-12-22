package com.Vehicle.InheritanceJoin;

import com.Vehicle.daoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        DaoImpl dao = new DaoImpl();
        dao.addVehicle();
    }
}
