package rest;

import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import webscraper.TagCounter;
import webscraper.Tester;
import webscraper.TagDTO;
import static webscraper.Tester.runParrallel;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("scrape")
public class WebScraperResource {
    @Context
    private UriInfo context;
    
    @Path("sequental")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTagsSequental() {
        long startTime = System.nanoTime();
        List<TagCounter> dataFeched = Tester.runSequental();
        long endTime = System.nanoTime()-startTime;
        return TagDTO.getTagsAsJson("Sequental fetching",dataFeched, endTime);
    }
    @Path("parallel")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTagsParrallel() throws NotImplementedException, InterruptedException, ExecutionException {
        long startTime = System.nanoTime();
        List<TagDTO> dataFeched = Tester.runParrallel();
        long endTime = System.nanoTime()-startTime;
        return TagDTO.getTagDTOsAsJson("Parrallel fetching",dataFeched, endTime);
    }
    
    
}
