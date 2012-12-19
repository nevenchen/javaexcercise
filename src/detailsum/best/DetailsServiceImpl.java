package detailsum.best;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DetailsServiceImpl{
	
	private IDetails sumOf(final IDetails[] arr){   
		  return (IDetails)Proxy.newProxyInstance(   
		    getClass().getClassLoader(), new Class[]{IDetails.class}, new InvocationHandler(){   
		    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {   
		      double sum = 0;   
		      for(int i=0; i<arr.length; i++) {   
		        sum += ((Double)method.invoke(arr[i], args)).doubleValue();   
		      }   
		      return new Double(sum);   
		    }   
		  });   
		}  

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallBalance(detailsum.Details[])
	 */
	public double getOverallBalance(Details[] arr) {
		return this.sumOf(arr).getBalance();
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallFixed(detailsum.Details[])
	 */
	public double getOverallFixed(Details[] arr) {
		// TODO Auto-generated method stub
		return this.sumOf(arr).getFixed();
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
