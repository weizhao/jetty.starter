package jetty.group.webapp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.JettyWebXmlConfiguration;
import org.eclipse.jetty.xml.XmlConfiguration;

public class OneWebApp {
	 public static void main(String[] args) throws Exception
	    {
	        Server server = new Server(8080);
	 
	        WebAppContext webapp = new WebAppContext();
	        Utils.setConfiguration(webapp,"test.xml");
	        
	        webapp.setWar("apps/test.war");
	        server.setHandler(webapp);
	 
	        server.start();
	        server.join();
	    }
	 
}
