package detailsum.bad;

import detailsum.Details;
import detailsum.DetailsService;


/**
 * @Class name:
 * @Description: 对于每个getOverallXXX（）方法来说，逻辑相同，不同的只是具体的对象，逻辑上很大的重复，
 * 如果出现更多的此类逻辑，一味的重复代码显得死板无聊。
 * TODO: 
 *
 * @author   name : neven
 * @Date	 31 Aug 2010 14:31:20
 *Revision record:
 *
 * @see 	 
 */
public class DetailsServiceImpl implements DetailsService{

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallBalance(detailsum.Details[])
	 */
	public double getOverallBalance(Details[] arr) {  
		  double sum = 0;   
		  for(int i=0; i<arr.length; i++) {   
		    sum += arr[i].getBalance();   
		  }   
		  return sum;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallFixed(detailsum.Details[])
	 */
	public double getOverallFixed(Details[] arr) {  
		  double sum = 0;   
		  for(int i=0; i<arr.length; i++) {   
		    sum += arr[i].getFixed();   
		  }   
		  return sum;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallSpendDown(detailsum.Details[])
	 */
	public double getOverallSpendDown(Details[] arr) {  
		  double sum = 0;   
		  for(int i=0; i<arr.length; i++) {   
		    sum += arr[i].getSpendDown();
		  }   
		  return sum;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallVarable(detailsum.Details[])
	 */
	public double getOverallVarable(Details[] arr) {  
		  double sum = 0;   
		  for(int i=0; i<arr.length; i++) {   
		    sum += arr[i].getVariable();
		  }   
		  return sum;
	}
	
}
