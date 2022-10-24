package at.fhtw.swen3.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.events.jpa");
        } catch (Throwable e) {
            System.err.println("Cannot create EntityManagerFactory");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void close() {
        entityManagerFactory.close();
    }
}
