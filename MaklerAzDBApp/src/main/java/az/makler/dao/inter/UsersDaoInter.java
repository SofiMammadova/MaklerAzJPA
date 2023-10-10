/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.makler.dao.inter;

import az.makler.entity.Users;

/**
 *
 * @author sofiya.mammadova
 */
public interface UsersDaoInter {
    Users getUserByEmailAndPassword(String email, String password);
}
