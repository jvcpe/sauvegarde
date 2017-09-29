
package fr.cpe;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/add")
public interface IAddRestService {
	@GET
	@Produces()
	@Path("/")
	String add(@QueryParam("a") float[] tab);
}
