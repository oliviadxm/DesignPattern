package otherPatterns.frontControllerPattern_30;

/**
 * (No. 30)
 * The Front Controller design pattern is used to provide a centralized request handling mechanism so that all
 * requests will be handled by a single handler. This handler can do the authentication/authorization/logging
 * or tracking of request and then pass the requests to corresponding handler. Following are the entities of this
 * type of design pattern.
 * - Front Controller: Single handler for all kinds of requests coming to the application
 * - Dispatcher: Front Controller may use a dispatcher object which can dispatch the request to corresponding
 * specific handler.
 * - View: Views are the object for which the requests are made.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
