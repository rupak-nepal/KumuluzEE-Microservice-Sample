package np.com.rupak.kumuluzee.microprofile.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import np.com.rupak.kumuluzee.microprofile.Test;

/**
 *
 * @author rupak
 */
@Path("ping")
public class PingResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response pingServer() {
        return Response.ok(new Test("Ok Server is running.")).build();
    }

}
