/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

import java.rmi.RemoteException;

/**
 *
 * @author prasad
 */
public class RMImpl implements RMI{

    @Override
    public String helloWorld() throws RemoteException {
        return "5";
    }
    
}
