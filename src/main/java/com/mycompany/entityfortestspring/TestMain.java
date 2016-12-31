/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entityfortestspring;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO PC
 */
public class TestMain {   
    
    public static void main(String[] args) {        
        try {
            JavaDBServerManager.runDBServerLocally();
            JavaConfigTester.init();
            JavaDBServerManager.shutDownServer();
        } catch (Exception ex) {
            Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
