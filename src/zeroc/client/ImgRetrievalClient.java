/**
 * 
 */
package zeroc.client;

import RPCImgRecong.WordWiki;


/**
 * @author zhongweng
 *
 */

public class ImgRetrievalClient {
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
					.stringToProxy("ImageRpc:default -h 10.2.3.119 -p 9999");
			RPCImgRecong.ImgRetrievalPrx imgRetievaPrx = RPCImgRecong.ImgRetrievalPrxHelper.checkedCast(base);
			if (imgRetievaPrx == null)
				throw new Error("Invalid proxy");

			//wordGetKnowledge
			WordWiki wordWiki = imgRetievaPrx.wordGetKnowledge("asd");
			System.out.println(wordWiki.key+wordWiki.abstr+wordWiki.descr);
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
