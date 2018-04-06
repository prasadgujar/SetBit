/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

/**
 *
 * @author prasad
 */
import java.lang.annotation.Annotation;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class RMIServer extends RMImpl{
    
    public RMIServer() throws RemoteException{
        super();
    }
    
    public static void main(String[] args) {
        try {
            // create on port 1099
            RMI stub = (RMI) UnicastRemoteObject.exportObject(new RMImpl(), 2001);
            Registry registry = LocateRegistry.createRegistry(2001);
             
            // create a new service named myMessage
            registry.rebind("Server", stub);
            System.out.println("system is ready");
        } catch (Exception e) {
            System.out.println(e);
//            e.printStackTrace();
        }     
        
    }
    

}
