package com.Vehicle.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Vehicle.config.HibernateUtil;
import com.Vehicle.dao.Dao;
import com.Vehicle.entity.FourWheels;
import com.Vehicle.entity.TwoWheels;

public class DaoImpl implements Dao {

	public void addVehicle() {
		Session session = HibernateUtil.activeSession();
		Transaction t = session.beginTransaction();
		TwoWheels tw = new TwoWheels();
		tw.setFuel("Petrol");
		tw.setEnginePower("500cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelname("Duke");
		tw.setModelno(255);
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("Sports Bike");
		
		FourWheels fw = new FourWheels();
		fw.setFuel("Electric");
		fw.setEnginePower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("Car");
		fw.setPrice(800000);
		fw.setModelname("Alto");
		fw.setModelno(320);
		fw.setMusicSystem(true);
		fw.setEtype("auto");
		fw.setAc(true);
		
		session.save(tw);
		session.save(fw);
		t.commit();
		System.out.println("Inserting and Joining done......");
		
	}
}
