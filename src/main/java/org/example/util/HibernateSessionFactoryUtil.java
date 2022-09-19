package org.example.util;

import org.example.model.Car;
import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            try {
                //начало конфигурации
                Configuration configuration = new Configuration().configure();

                //указываем классы для hibernate регулирования
                configuration.addAnnotatedClass(Car.class);
                configuration.addAnnotatedClass(User.class);
//
                //создание настроек для сессии
                StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory=configuration.buildSessionFactory(builder.build());//патерн билдер
            }catch (Exception e){

            }
        }
        return sessionFactory;
    }

}
