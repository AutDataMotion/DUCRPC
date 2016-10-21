/**
 * 
 */
package zeroc.serv;

import Demo.hello._PrinterDisp;
import Ice.Current;

/**
 * @author zhongweng
 *
 */
public class PrinterImp extends _PrinterDisp{

	/* (non-Javadoc)
	 * @see Demo.hello._PrinterOperations#printString(java.lang.String, Ice.Current)
	 */
	@Override
	public void printString(String s, Current __current) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

}
