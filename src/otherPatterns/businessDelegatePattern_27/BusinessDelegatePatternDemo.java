package otherPatterns.businessDelegatePattern_27;

/**
 * (No. 27)
 * Business Delegate Pattern is used to decouple presentation tier and business tier. It is basically
 * used to reduce communication or remote lookup functionality to business tier code. In business tier
 * we have following entities:
 * Client - Presentation tier code may be JSP, servlet or UI Java code.
 * Business Delegate - A single entry point class for client entities to provide access to Business
 * Service methods.
 * LookUp Service - Lookup service object is responsible to get relative business implementation and
 * provide business delegate object.
 * Business Service - Business Service interface. Concrete classes implement this business service to
 * provide actual business implementation logic.
 *
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
