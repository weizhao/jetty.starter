package jetty.group.webapp;

import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.JettyWebXmlConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.xml.XmlConfiguration;

public class Utils {
	 public static void setConfiguration(WebAppContext webapp,String fileName) throws Exception{
		 JettyWebXmlConfiguration configuration = new JettyWebXmlConfiguration();
         Resource test_xml = Resource.newSystemResource(fileName);
		 XmlConfiguration xmlConfiguration = new XmlConfiguration(test_xml.getInputStream());
	     webapp.setAttribute(JettyWebXmlConfiguration.XML_CONFIGURATION, xmlConfiguration);
         configuration.configure(webapp);
	 }

}
