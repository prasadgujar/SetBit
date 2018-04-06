/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitman;

import javax.ejb.Stateless;

/**
 *
 * @author prasad
 */
@Stateless
public class bitsbean implements bitsbeanRemote {

    @Override
    public int bits(int num) {
        int res  = Integer.bitCount(num);
        return res;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
