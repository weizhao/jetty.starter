package jetty.group.server;

import org.eclipse.jetty.server.Server;

public class JettyServer {
	public static void main(String[] args) throws Exception
	{
	Server server = new Server(8080);
	server.setHandler(new HelloWorld());

	server.start();
	server.join();
	}
}
