package jetty.example.unassembled;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class OneWebAppUnassembled {
	public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
 
        WebAppContext context = new WebAppContext();
        Utils.setConfiguration(context, "untest.xml");
        String webapp = "src/main/webapp";
        context.setDescriptor(webapp+"/WEB-INF/web.xml");
        context.setResourceBase(webapp);
        context.setParentLoaderPriority(true);
 
        server.setHandler(context);
 
        server.start();
        server.join();
    }
}
