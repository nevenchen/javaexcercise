package detailsum.better;

import detailsum.Details;
import detailsum.DetailsService;


/**
 * @Class name:
 * @Description:相对于detailsum.bad包中的实现，很好的避免了逻辑的重复，代码优雅美观，
 * 不过代码量变没有实质性的减少。
 * TODO: 
 *
 * @author   name : neven
 * @Date	 31 Aug 2010 14:55:23
 *Revision record:
 *
 * @see 	 
 */
public class DetailsServiceImpl implements DetailsService{
	
	private double detailsFiledSum(Details[] arr,DetailsGetter getter){
		  double sum = 0;   
		  for(int i=0; i<arr.length; i++) {   
		    sum += getter.get(arr[i]);   
		  }   
		  return sum;
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallBalance(detailsum.Details[])
	 */
	public double getOverallBalance(Details[] arr) {
		return this.detailsFiledSum(arr, new DetailsGetter(){
			public double get(Details details){   
			    return details.getBalance();   
			  }   
		});
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallFixed(detailsum.Details[])
	 */
	public double getOverallFixed(Details[] arr) {
		return this.detailsFiledSum(arr, new DetailsGetter(){
			public double get(Details details){   
			    return details.getFixed();   
			  }   
		});
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallSpendDown(detailsum.Details[])
	 */
	public double getOverallSpendDown(Details[] arr) {
		return this.detailsFiledSum(arr, new DetailsGetter(){
			public double get(Details details){   
			    return details.getSpendDown();   
			  }   
		});
	}

	/* (non-Javadoc)
	 * @see detailsum.DetailsService#getOverallVarable(detailsum.Details[])
	 */
	public double getOverallVarable(Details[] arr) {
		return this.detailsFiledSum(arr, new DetailsGetter(){
			public double get(Details details){   
			    return details.getVariable();   
			  }   
		});
	}
}
