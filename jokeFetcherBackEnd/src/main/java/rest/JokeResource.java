package rest;

import com.google.gson.Gson;
import dtos.ChuckNorrisDTO;
import dtos.DadJokeDTO;
import dtos.JokeDTO;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import utils.HttpUtils;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("jokes")
public class JokeResource {

    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws IOException {

        Gson gson = new Gson();
        String chuck = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
        ChuckNorrisDTO chuckDTO = gson.fromJson(chuck, ChuckNorrisDTO.class);

        String dad = HttpUtils.fetchData("https://icanhazdadjoke.com");
        DadJokeDTO dadDTO = gson.fromJson(dad, DadJokeDTO.class);

        JokeDTO jokeDTO = new JokeDTO(dadDTO, chuckDTO);

        String combinedJokes = gson.toJson(jokeDTO);
        return combinedJokes;
    }

}
