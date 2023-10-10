/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.dao.impl;

import static az.makler.config.Config.em;
import az.makler.dao.inter.UsersDaoInter;
import az.makler.entity.Users;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sofiya.mammadova
 */
public class UsersDaoImpl implements UsersDaoInter{

    @Override
    public Users getUserByEmailAndPassword(String email, String password) {
    EntityManager em = em();
        String jpql = "select u from Users u where u.email=:email and u.password=:password ";
        Query q = em.createQuery(jpql); //nash query(zapros) qotov 
        
        q.setParameter("email", email);
        q.setParameter("password", password);
        return (Users) q.getSingleResult(); //t.k. getSingleResult vozvrashaet Object, to pishem vnachale (Users)
    }
    
}
