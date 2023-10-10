/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.dao.impl;

import az.makler.config.Config;
import az.makler.dao.inter.ElanDaoInter;
import az.makler.entity.Elan;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Perfect
 */
public class ElanDaoImpl extends Config implements ElanDaoInter {

    @Override
    public void insert(Elan elan) {
        EntityManager em = em();
        //nachalo tranzakcii
        em.getTransaction().begin();
        em.persist(elan);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public void update(Elan elan) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(elan);
        em.getTransaction().commit();
        closeEM(em);
    }

    @Override
    public void delete(int id) {
        EntityManager em = em();
        Elan e = em.find(Elan.class, id);
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        closeEM(em);

    }

    @Override
    public Elan getELanById(int id) {
        EntityManager em = em();
        Elan e = em.find(Elan.class, id);
        closeEM(em);
        return e;

    }

    @Override
    public List<Elan> getAllElan(String unvan, Integer sahe, String tip) {
        EntityManager em = em();
        String jpql = "select e from Elan e where 1=1 ";
        //zdes 1=1 obmanivayushiy manevr, chtobi vseqda vozvrashal TRUE
        //t.k esli search budet po oboim parametram, to zapros budet viqladet tak:
        //select e from Elan e where AND e.unvan like :unvan AND e.sahe=:sahe
        //t.k zapros ne mojet nachatsa s AND, stavim 1=1 , t.e true, t.e ono vseqda sobludaetsa
        //i perehod k sleduyushemu zaprosu, v celom ves zapros viqladit tak:
        //select e from Elan e where 1=1 AND e.unvan like :unvan AND e.sahe=:sahe
        //pri odinochnom searche toj ne budet problem
        //search po unvan: select e from Elan e where 1=1 AND e.unvan like :unvan
        //search po sahe: select e from Elan e where 1=1 AND e.sahe=:sahe

        if (unvan != null && !unvan.trim().isEmpty()) { //trim - boshluqalri kesende null deyilse
            jpql += " and e.unvan like :unvan"; //mi k zaprosu jpql dobavlaem noviy zapros
            //v otlichie ot JDBC , v JPA mi v zaprose vmesto ? pishem :peremennaya
        }
        if (sahe != null) { //if-i nuzhni dlya search'a
            //jpql += " where e.sahe=:sahe"; //zamenili where na and, t.k search mojet bit po oboim parametram
            jpql += " and e.sahe=:sahe";
        }
        if (tip != null && !tip.trim().isEmpty()) { //trim - boshluqalri kesende null deyilse
            jpql += " and e.tip like :tip"; //mi k zaprosu jpql dobavlaem noviy zapros
            //v otlichie ot JDBC , v JPA mi v zaprose vmesto ? pishem :peremennaya
        }
        Query q = em.createQuery(jpql); //nash query(zapros) qotov
//2oy etap proverki
//zanovo provaeraem na null i zatem uje prisvaivaem peremennie
        if (unvan != null && !unvan.trim().isEmpty()) {
            q.setParameter("unvan", "%" + unvan + "%");
        } //%unvan% oznachaet, chto eto slovo pod peremennoy unvan on budet iskat 
        //i v seredine, i v nachale, i v konce
        //naprimer, ya vvozhu genclik
        //a v db est varianti: Genclik metrosu, Supermarket Genclik i t d
        // blaqodara %unvan% on vivedet vse znachenia
        if (sahe != null) {
            q.setParameter("sahe", sahe);
        }
        if (tip != null && !tip.trim().isEmpty()) {
            q.setParameter("tip", "%" + tip + "%");
        }

        List<Elan> list = q.getResultList();
        closeEM(em);
        return list;
    }

}
