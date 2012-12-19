package detailsum.best2;

import java.lang.reflect.Method;

import detailsum.Details;
import detailsum.DetailsService;


public class DetailsServiceImpl implements DetailsService{
	
	public static double sumOf(Details[] arr,String name)throws Throwable{   
        Method m =Details.class.getMethod(name);   
        double sum =0;   
        for(Details d:arr) sum +=(Double)m.invoke(d);   
        return sum;         
    }  

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallBalance(detailsum.Details[])
	 */
	public double getOverallBalance(Details[] arr) {
		try {
			return sumOf(arr,"getBalance");
		}
		catch (Throwable e) {
			return 0;
		}  
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallFixed(detailsum.Details[])
	 */
	public double getOverallFixed(Details[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallSpendDown(detailsum.Details[])
	 */
	public double getOverallSpendDown(Details[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallVarable(detailsum.Details[])
	 */
	public double getOverallVarable(Details[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
