/**
 * 
 */
package zeroc.client;


/**
 * @author zhongweng
 *
 */

public class T2DataStoreClient {
	public static String addr1 = "t2StoreImgProc:default -h 192.168.199.204 -p 8888";
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			//initialize the Ice run time
			ic = Ice.Util.initialize(args);
			// obtain a proxy for the remote printer
			System.out.println("---client---start");
			Ice.ObjectPrx base = ic.stringToProxy(addr1);
			RPCTG2DataStore.T2ImgProcPrx prox = RPCTG2DataStore.T2ImgProcPrxHelper.checkedCast(base);
			if (prox == null)
				throw new Error("Invalid proxy");
			//调用远程算法
			
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
