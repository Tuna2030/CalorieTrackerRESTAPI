/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage.service;

import caloriepackage.Consumptiontable;
import caloriepackage.Foodtable;
import caloriepackage.TotalCaloriesConsumed;
import caloriepackage.Usertable;
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
@Path("caloriepackage.consumptiontable")
public class ConsumptiontableFacadeREST extends AbstractFacade<Consumptiontable> {

    @PersistenceContext(unitName = "CalorieTrackerApplicationPU")
    private EntityManager em;

    public ConsumptiontableFacadeREST() {
        super(Consumptiontable.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Consumptiontable entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Consumptiontable entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("findByDate/{date}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByDate(@PathParam("date") String date) throws ParseException {
        Query query = em.createNamedQuery("Consumptiontable.findByDate");
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        query.setParameter("date", d1);
        return query.getResultList();
    }

    @GET
    @Path("findByDailyquantity/{dailyquantity}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByDailyquantity(@PathParam("dailyquantity") Integer dailyquantity) {
        Query query = em.createNamedQuery("Consumptiontable.findByDailyquantity");
        query.setParameter("dailyquantity", dailyquantity);
        return query.getResultList();
    }
    
    @GET
    @Path("findByUserid/{userid}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByUserid(@PathParam("userid") Integer userid) {
        TypedQuery<Consumptiontable> q = em.createQuery("SELECT c FROM Consumptiontable c WHERE c.userid.userid = :userid", Consumptiontable.class);
        q.setParameter("userid", userid);
        return q.getResultList();
    }
    
    @GET
    @Path("findByFoodid/{foodid}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByFoodid(@PathParam("foodid") Integer foodid) {
        TypedQuery<Consumptiontable> q = em.createQuery("SELECT c FROM Consumptiontable c WHERE c.foodid.foodid = :foodid", Consumptiontable.class);
        q.setParameter("foodid", foodid);
        return q.getResultList();
    }

    @GET
    @Path("findByName/{username}/{foodname}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByName(@PathParam("username") String username, @PathParam("foodname") String foodname) {
        TypedQuery<Consumptiontable> q = em.createQuery("SELECT c FROM Consumptiontable c WHERE c.userid.name = :uname AND c.foodid.name = :fname", Consumptiontable.class);
        q.setParameter("uname", username);
        q.setParameter("fname", foodname);
        return q.getResultList();
    }
    
    @GET
    @Path("findByUsernameAndFoodname/{username}/{foodname}")
    @Produces({"application/json"})
    public List<Consumptiontable> findByUsernameAndFoodname(@PathParam("username") String username, @PathParam("foodname") String foodname) {
        Query query = em.createNamedQuery("Consumptiontable.findByUsernameAndFoodname");
        query.setParameter("uname", username);
        query.setParameter("fname", foodname);
        return query.getResultList();
    }
    
    @GET
    @Path("findTotalCaloriesConsuedByUseridANDDate/{userid}/{date}")
    @Produces({"application/json"})
    public List<TotalCaloriesConsumed> findTotalCaloriesConsumedByUseridANDDate(@PathParam("userid") Integer userid, @PathParam("date") String date) throws ParseException {
        TypedQuery<Consumptiontable> query = em.createQuery("SELECT c FROM Consumptiontable c WHERE c.userid.userid = :userid AND c.date = :date", Consumptiontable.class);
        query.setParameter("userid", userid);
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        query.setParameter("date", d1);
        double tcc = 0;
        List<TotalCaloriesConsumed> tcclist = new ArrayList<TotalCaloriesConsumed>();
        for (Consumptiontable var : query.getResultList()) {
            tcc = tcc + var.getFoodid().getCalorieamount();
        }
        tcclist.add(new TotalCaloriesConsumed(userid, tcc, d1));
        return tcclist;
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Consumptiontable find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Consumptiontable> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Consumptiontable> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
