/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author nanda
 */
@Path("produto")
@Stateless
public class ProdutoResource {
    
    @PersistenceContext
    private EntityManager em;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public Produto salvarProduto(Produto produto){
        em.persist(produto);
        return produto;
    }
    
    public void removeProduto(Produto produto){
        
    }
    
}
