/**
 * 
 */
package zeroc.client;

/**
 * @author zhongweng
 *
 */
public class PrinterClient {
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			//initialize the Ice run time
			ic = Ice.Util.initialize(args);
			// obtain a proxy for the remote printer
			System.out.println("---client---start");
			Ice.ObjectPrx base = ic
					.stringToProxy("SimplePrinter:default -p 1000");
			Demo.hello.PrinterPrx printer = Demo.hello.PrinterPrxHelper.checkedCast(base);
			if (printer == null)
				throw new Error("Invalid proxy");

			printer.printString("Hello World!");
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
