package rest;

import dao.UserDao;
import rest.api.AbstractEntityRest;
import rolo.User;

import javax.ejb.Stateless;
import javax.ws.rs.*;

import java.util.List;

import static rest.api.IRestApiMediaType.JSON_UTF8;
import static rest.api.IRestApiMediaType.TEXT_UTF8;

@Path("/user")
@Consumes(JSON_UTF8)
@Produces(JSON_UTF8)
@Stateless
public class UserRest extends AbstractEntityRest<Long, User, UserDao> {

    public UserRest() {
        super(User.class);
    }

    @GET
    @Path("/echo")
    @Produces(TEXT_UTF8)
    public String echo(){ return super.echo(); }

    @GET
    public List<User> list(@QueryParam("offset") Integer offset,
                       @QueryParam("length") Integer length){
        return super.list(offset,length);
    }
    @POST
    public void create(User user){
        super.create(user);
    }
}
