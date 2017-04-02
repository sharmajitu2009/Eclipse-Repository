package com.my.app.Hello;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Jitendra Sharma!";
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Integer test1() {
        return 10;
    }
    
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public Integer test2() {
        return 20;
    }
    
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public Integer test3() {
        return 20;
    }
}
