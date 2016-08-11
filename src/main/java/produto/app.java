/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author nanda
 */
public class app {
    
    public static void main(String[] args) {
        
        String uri = "http://localhost:8080/pos-atividade-rest/api";
        
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(uri);
        
        String produto ="<produto> "
                + "<id>1</id> "
                + "<descricao>Bolo</descricao> "
                + "<valor>50.0</valor>"
                + "</produto";
        
        Response post = webTarget.path("produto")
                .request()
                .post(Entity.json(produto));    
        
        System.out.println(post.readEntity(String.class));
                
        }
}
