/**
 * 
 */
package zeroc.client;

import java.util.HashMap;
import java.util.Map;

import RPCImgRecong.WordWiki;
import RPCRice.Classify;
import RPCRice.DirArgsHolder;
import RPCRice.Drought;
import RPCRice.Yield;


/**
 * @author zhongweng
 *
 */

public class ThariceClient {
	public final  static String serverAddr = "tharice:default -h 10.2.3.119 -p 9999";
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			//initialize the Ice run time
			ic = Ice.Util.initialize(args);
			// obtain a proxy for the remote printer
			System.out.println("---client---start");
			Ice.ObjectPrx base = ic.stringToProxy(serverAddr);
			RPCRice.InfRicePrx proxy = RPCRice.InfRicePrxHelper.checkedCast(base);
			if (proxy == null)
				throw new Error("Invalid proxy");

			// ==============classify
			Classify inputclass = new Classify();
			inputclass.id = 1;
			inputclass.imagePath = "";
			Map<String, String> mapArgs = new HashMap<String, String>(){{
				put("argKey1", "value1");
				put("argKey2", "value2");
			}};
			
			String maxlikehood = proxy.maxlikehood(inputclass, mapArgs);
			System.out.println("RPC Res maxlikehood:"+maxlikehood);
			
			// ==============Yield
			Yield inputyield  = new Yield();
			inputyield.id  = 2;
			String landyield = proxy.landyield(inputyield, mapArgs);
			System.out.println("RPC Res landyield:"+landyield);
			
			// ==============Drought
			Drought inputdrought = new Drought();
			inputdrought.id = 3;
			String landdrought = proxy.landdrought(inputdrought, mapArgs);
			System.out.println("RPC Res landdrought:"+landdrought);
			
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
