package jetty.group.webapp;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

public class ManyContexts {
	 public static void main(String[] args) throws Exception
	    {
	        Server server = new Server(8080);
	 
	        ServletContextHandler context0 = new ServletContextHandler(ServletContextHandler.SESSIONS);
	        context0.setContextPath("/ctx0");
	        context0.addServlet(new ServletHolder(new ContextServlet()),"/*");
	        context0.addServlet(new ServletHolder(new ContextServlet("Buongiorno Mondo")),"/it/*");
	        context0.addServlet(new ServletHolder(new ContextServlet("Bonjour le Monde")),"/fr/*");
	 
	        WebAppContext webapp = new WebAppContext();
	        Utils.setConfiguration(webapp,"testCtx.xml");
	        
//	        webapp.setContextPath("/ctx1");
	        webapp.setWar("apps/test.war");
	 
	        ContextHandlerCollection contexts = new ContextHandlerCollection();
	        contexts.setHandlers(new Handler[] { context0, webapp });
	 
	        server.setHandler(contexts);
	 
	        server.start();
	        server.join();
	    }
}
