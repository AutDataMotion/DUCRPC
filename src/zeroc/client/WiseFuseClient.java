/**
 * 
 */
package zeroc.client;

import java.util.HashMap;
import java.util.Map;

import RPCWiseFuse.FusionInf;

/**
 * @author zhongweng
 *
 */

public class WiseFuseClient {
	public static String addr1 = "ImageRpc:default -h 10.2.3.119 -p 9999";
	public static String addr2 = "WISEFUSION:default -h 192.168.199.173 -p 9999";
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			//initialize the Ice run time
			ic = Ice.Util.initialize(args);
			// obtain a proxy for the remote printer
			System.out.println("---client---start");
			Ice.ObjectPrx base = ic
					.stringToProxy(addr2);
			RPCWiseFuse.WiseFusionInfPrx wisefusePrx = RPCWiseFuse.WiseFusionInfPrxHelper.checkedCast(base);
			if (wisefusePrx == null)
				throw new Error("Invalid proxy");
			Map<String, String> mapArgs = new HashMap<String, String>();
			//wordGetKnowledge
			FusionInf fuseinfo = wisefusePrx.fuseSyn(mapArgs);

			//wordSearch
			
			//wordSearchImg
			
			//imgSearch
			
		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
		if (ic != null) {
			// Clean up
			//
			try {
				ic.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				status = 1;
			}
		}
		System.exit(status);
	}
}
