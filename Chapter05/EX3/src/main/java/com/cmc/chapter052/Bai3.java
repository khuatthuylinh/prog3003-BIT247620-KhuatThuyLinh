package com.cmc.chapter052;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Bai3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Product product = new Product("Laptop", 1500);

        session.persist(product);

        tx.commit();

        System.out.println("Đã lưu");

        session.close();
        factory.close();
    }
}