/**
 * 
 */
package zeroc.serv;

/**
 * @author zhongweng
 *
 */
public class PrinterServ {

	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			// initialize the Ice run time 
			ic = Ice.Util.initialize(args);
			// create an object adapter
			//using the default protocol (TCP/IP) at port number 10000
			Ice.ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints(
					"SimplePrinterAdapter", "default -p 1000");
			// server-side run time is initialized 
			// we create a servant for our Printer interface by instantiating a PrinterI object.
			Ice.Object object = new PrinterImp();
			// inform the object adapter of the presence of a new servant by calling add on the adapter
			adapter.add(object, ic.stringToIdentity("SimplePrinter"));
			// activate the adapter 
			adapter.activate();
			System.out.println("---server---start");
			//
			ic.waitForShutdown();
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
