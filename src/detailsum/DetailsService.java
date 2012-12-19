package detailsum;


public interface DetailsService {
	double getOverallFixed(Details[] arr);
	double getOverallBalance(Details[] arr);
	double getOverallVarable(Details[] arr);
	double getOverallSpendDown(Details[] arr);
}
