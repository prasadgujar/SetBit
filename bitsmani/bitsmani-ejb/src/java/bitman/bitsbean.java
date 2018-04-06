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
        
        /*Uncomment This Part of the code to find no of setbits in the no.
        int res  = Integer.bitCount(num);
        return res;
        */
        /*##comment This Part of the code to find no of setbits in the no.##*/
        /* this is code is used to count the no of prime factor of given no */
        	// Print the number of 2s that divide n
		int cn  = 0;
		while (num%2==0)
		{
			//System.out.print(2 + " ");
			num /= 2;
			cn++;
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(num); i+= 2)
		{
			// While i divides n, print i and divide n
			while (num%i == 0)
			{
				//System.out.print(i + " ");
				num /= i;
			}
			cn++;
		}

		// This condition is to handle the case whien
		// n is a prime number greater than 2
		if (num > 2)
			System.out.print(num);
			cn++;
		//System.out.print("\n");
		//System.out.print(cn);
                return cn;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
