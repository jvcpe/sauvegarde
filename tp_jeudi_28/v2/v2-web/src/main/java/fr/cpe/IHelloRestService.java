
package fr.cpe;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public interface IHelloRestService {
	@GET
	@Produces()
	@Path("/")
	String hello(@QueryParam("name") String name);
}
