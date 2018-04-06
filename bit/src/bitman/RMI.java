/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author prasad
 */
public interface RMI extends Remote{
    
    public String helloWorld() throws RemoteException;
    
}
