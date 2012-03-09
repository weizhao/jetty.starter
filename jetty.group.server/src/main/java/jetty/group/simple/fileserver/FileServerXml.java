package jetty.group.simple.fileserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.xml.XmlConfiguration;

public class FileServerXml {
	 public static void main(String[] args) throws Exception
	    {
	        Resource fileserver_xml = Resource.newSystemResource("fileserver.xml");
	        XmlConfiguration configuration = new XmlConfiguration(fileserver_xml.getInputStream());
	        Server server = (Server)configuration.configure();
	        server.start();
	        server.join();
	    }
}
