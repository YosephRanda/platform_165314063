/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import helper.UserHelper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import pojos.User;

/**
 * REST Web Service
 *
 * @author admin
 */
@Path("user")
public class UserResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of pasienResource
     */
    public UserResource() {
    }

    /**
     * Retrieves representation of an instance of service.pasienResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        UserHelper test = new UserHelper();
        List<User> list = test.getAllUser();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of pasienResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
//    @PUT
//    @Consumes("application/json")
//    public void putJson(String content) {
//    }
    @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(String data) {
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);
        UserHelper helper = new UserHelper();
        helper.getUser(user.getEmail(), user.getPassword());
        return Response
                .status(200)
                .entity(helper.getUser(user.getEmail(), user.getPassword()))
                .build();
    }
}