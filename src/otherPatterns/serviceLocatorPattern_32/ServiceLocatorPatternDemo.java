package otherPatterns.serviceLocatorPattern_32;

/**
 * (No. 32)
 * The service locator design pattern is used when we want to locate various services using
 * JNDI(Java Naming and Directory Service) lookup. Considering high cost of looking up JNDI
 * for a service, Service locator pattern makes use of caching technique. For the first time
 * a service is required, Service Locator looks up in JNDI and caches the service object.
 * Further lookup or same service via Service locator is done in its cache which improves the
 * performance of application to great extent. Following are the entities of this type of design
 * pattern:
 * - Service: Actual Service which will process the request. Reference of such service is to be
 * looked upon in JNDI server.
 * - Context/Initial Context: JNDI Context carries the reference to service used for lookup purpose.
 * - Service Locator: Service Locator is a single point of contact to get services by JNDI lookup
 * caching the services.
 * - Cache: Cache to store references of services to reuse them.
 * - Client: Client is the object that invokes the services via ServiceLocator.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
