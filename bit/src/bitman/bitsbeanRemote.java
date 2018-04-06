/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

import javax.ejb.Remote;

/**
 *
 * @author prasad
 */
@Remote
public interface bitsbeanRemote {

    int bits(int num);
    
}
