package com.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.OneToMany.Entity.Cart;
import com.OneToMany.Entity.Items;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory s = new Configuration().configure().buildSessionFactory();
       Session session = s.openSession();
       Transaction t = session.beginTransaction();
       Items i = new Items();
       i.setItemname("Poteto");
       i.setPrice(38);
       i.setQuantity(2);
       
       Items i1 = new Items();
       i1.setItemname("Tometo");
       i1.setPrice(21);
       i1.setQuantity(3);
       
       Items i2 = new Items();
       i2.setItemname("Cabbage");
       i2.setPrice(24);
       i2.setQuantity(4);
       
       Items i3 = new Items();
       i3.setItemname("Carrot");
       i3.setPrice(12);
       i3.setQuantity(2);
       
       Items i4 = new Items();
       i4.setItemname("Onion");
       i4.setPrice(30);
       i4.setQuantity(4);
       
       Items i5 = new Items();
       i5.setItemname("Brinjal");
       i5.setPrice(38);
       i5.setQuantity(6);
       
       ArrayList<Items> al = new ArrayList<Items>();
       al.add(i);
       al.add(i1);
       al.add(i2);
       al.add(i3);
       al.add(i4);
       al.add(i5);
       
       Cart c = new Cart();
       c.setName("Avijit");
       c.setItem(al);
       session.save(c);
       t.commit();
       System.out.println("Inserted................");
       session.close();
    }
}
