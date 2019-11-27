/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage.service;

import caloriepackage.Reporttable;
import caloriepackage.TotalCaloriesConsumed;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Y500
 */
@Stateless
@Path("caloriepackage.reporttable")
public class ReporttableFacadeREST extends AbstractFacade<Reporttable> {

    @PersistenceContext(unitName = "CalorieTrackerApplicationPU")
    private EntityManager em;

    public ReporttableFacadeREST() {
        super(Reporttable.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Reporttable entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Reporttable entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
    
    @GET
    @Path("findByUserid/{userid}")
    @Produces({"application/json"})
    public List<Reporttable> findByUserid(@PathParam("userid") Integer userid) {
        TypedQuery<Reporttable> q = em.createQuery("SELECT r FROM Reporttable r WHERE r.userid.userid = :userid", Reporttable.class);
        q.setParameter("userid", userid);
        return q.getResultList();
    }
    
    @GET
    @Path("findByDate/{date}")
    @Produces({"application/json"})
    public List<Reporttable> findByDate(@PathParam("date") String date) throws ParseException {
        Query query = em.createNamedQuery("Reporttable.findByDate");
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        query.setParameter("date", d1);
        return query.getResultList();
    }
    
    @GET
    @Path("findByTotalcaloriesconsumed/{totalcaloriesconsumed}")
    @Produces({"application/json"})
    public List<Reporttable> findByTotalcaloriesconsumed(@PathParam("totalcaloriesconsumed") Integer totalcaloriesconsumed) {
        Query query = em.createNamedQuery("Reporttable.findByTotalcaloriesconsumed");
        query.setParameter("totalcaloriesconsumed", totalcaloriesconsumed);
        return query.getResultList();
    }
    
    @GET
    @Path("findByTotalcaloriesburned/{totalcaloriesburned}")
    @Produces({"application/json"})
    public List<Reporttable> findByTotalcaloriesburned(@PathParam("totalcaloriesburned") Integer totalcaloriesburned) {
        Query query = em.createNamedQuery("Reporttable.findByTotalcaloriesburned");
        query.setParameter("totalcaloriesburned", totalcaloriesburned);
        return query.getResultList();
    }
    
    @GET
    @Path("findByTotalstepstaken/{totalstepstaken}")
    @Produces({"application/json"})
    public List<Reporttable> findByTotalstepstaken(@PathParam("totalstepstaken") Integer totalstepstaken) {
        Query query = em.createNamedQuery("Reporttable.findByTotalstepstaken");
        query.setParameter("totalstepstaken", totalstepstaken);
        return query.getResultList();
    }
    
    @GET
    @Path("findByDailycaloriegoal/{dailycaloriegoal}")
    @Produces({"application/json"})
    public List<Reporttable> findByDailycaloriegoal(@PathParam("dailycaloriegoal") Integer dailycaloriegoal) {
        Query query = em.createNamedQuery("Reporttable.findByDailycaloriegoal");
        query.setParameter("dailycaloriegoal", dailycaloriegoal);
        return query.getResultList();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Reporttable find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Reporttable> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Reporttable> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
