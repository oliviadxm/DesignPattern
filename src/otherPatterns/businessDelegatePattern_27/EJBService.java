package otherPatterns.businessDelegatePattern_27;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service.");
    }
}
