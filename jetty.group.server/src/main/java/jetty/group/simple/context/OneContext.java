package jetty.group.simple.context;

import jetty.group.simple.server.HelloHandler;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

public class OneContext {
	public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
 
        ContextHandler context = new ContextHandler();
        context.setContextPath("/hello");
        context.setResourceBase(".");
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        server.setHandler(context);
 
        context.setHandler(new HelloHandler());
 
        server.start();
        server.join();
    }
}
