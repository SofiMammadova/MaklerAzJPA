/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.config;

import az.makler.dao.impl.ElanDaoImpl;
import az.makler.dao.impl.UsersDaoImpl;
import az.makler.dao.inter.ElanDaoInter;
import az.makler.dao.inter.UsersDaoInter;

/**
 *
 * @author Perfect
 */
public class Context {
    
    
        public static ElanDaoInter instanceElanDao(){
        return new ElanDaoImpl();
    }
        
    public static UsersDaoInter instanceUsersDao(){
        return new UsersDaoImpl();
    }
}
