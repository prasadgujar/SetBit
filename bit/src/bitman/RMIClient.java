/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author prasad
 */
public class RMIClient {
    RMI stub;

    public RMIClient() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 2001);
            this.stub = (RMI) reg.lookup("Server");
        } catch (Exception e) {
        }
    }
    
    public String getHelloWorld() throws RemoteException{
        return this.stub.helloWorld();
    }
    
    
}
