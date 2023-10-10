/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Perfect
 */
public abstract class Config {

    public static EntityManagerFactory emf = null;

    public static EntityManager em() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("MaklerAzPU");
        }
        return emf.createEntityManager();
    }

    public static void closeEM(EntityManager em) {
        em.close();
    }

    public static void closeEMF() {
        emf.close();
    }

}
