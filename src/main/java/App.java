
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciana
 */
public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8080/pos-atividade-rest/api";
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(url);
        
        String cliente = ("<cliente>");
        
        Response post = webTarget.path("cliente")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.json(cliente));
        
        System.out.println(post.readEntity(String.class));
    }
}
