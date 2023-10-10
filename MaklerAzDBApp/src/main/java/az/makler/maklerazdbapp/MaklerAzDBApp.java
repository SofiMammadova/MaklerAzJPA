/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package az.makler.maklerazdbapp;

import az.makler.config.Config;
import az.makler.config.Context;
import az.makler.dao.inter.ElanDaoInter;
import az.makler.dao.inter.UsersDaoInter;
import az.makler.entity.Agentlik;
import az.makler.entity.Elan;

/**
 *
 * @author sofiya.mammadova
 */
public class MaklerAzDBApp {

    public static void main(String[] args) {
    //    ElanDaoInter edao = Context.instanceElanDao();
        
 /*       Elan e = edao.getELanById(2);
        e.setAgentlik(new Agentlik(2));
        e.setElanId(6);
        edao.insert(e); */
      
     /*    System.out.println(edao.getAllElan("Sahil", null)); //dla proverki query iz db
        Config.closeEMF(); */
        //System.out.println(edao.getELanById(1));
        
        
        UsersDaoInter udao = Context.instanceUsersDao();
        System.out.println(udao.getUserByEmailAndPassword("soofiimva.s@gmail.com", "1234"));
        Config.closeEMF();
        
    }
}
