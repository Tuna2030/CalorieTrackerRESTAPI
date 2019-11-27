/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage.service;

import caloriepackage.BMR;
import caloriepackage.CaloriesBurnedPerStep;
import caloriepackage.TotalCaloriesBurnedAtRest;
import caloriepackage.TotalCaloriesConsumed;
import caloriepackage.Usertable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
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
@Path("caloriepackage.usertable")
public class UsertableFacadeREST extends AbstractFacade<Usertable> {

    @PersistenceContext(unitName = "CalorieTrackerApplicationPU")
    private EntityManager em;

    public UsertableFacadeREST() {
        super(Usertable.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Usertable entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Usertable entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("findByName/{name}")
    @Produces({"application/json"})
    public List<Usertable> findByName(@PathParam("name") String name) {
        Query query = em.createNamedQuery("Usertable.findByName");
        query.setParameter("name", name);
        return query.getResultList();
    }

    @GET
    @Path("findBySurname/{surname}")
    @Produces({"application/json"})
    public List<Usertable> findBySurname(@PathParam("surname") String surname) {
        Query query = em.createNamedQuery("Usertable.findBySurname");
        query.setParameter("surname", surname);
        return query.getResultList();
    }

    @GET
    @Path("findByEmail/{email}")
    @Produces({"application/json"})
    public List<Usertable> findByEmail(@PathParam("email") String email) {
        Query query = em.createNamedQuery("Usertable.findByEmail");
        query.setParameter("email", email);
        return query.getResultList();
    }

    @GET
    @Path("findByDateofbirth/{dateofbirth}")
    @Produces({"application/json"})
    public List<Usertable> findByDateofbirth(@PathParam("dateofbirth") String dateofbirth) throws ParseException {
        Query query = em.createNamedQuery("Usertable.findByDateofbirth");
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateofbirth);
        query.setParameter("dateofbirth", d1);
        return query.getResultList();
    }

    @GET
    @Path("findByHeight/{height}")
    @Produces({"application/json"})
    public List<Usertable> findByHeight(@PathParam("height") Integer height) {
        Query query = em.createNamedQuery("Usertable.findByHeight");
        query.setParameter("height", height);
        return query.getResultList();
    }

    @GET
    @Path("findByWeight/{weight}")
    @Produces({"application/json"})
    public List<Usertable> findByWeight(@PathParam("weight") Integer weight) {
        Query query = em.createNamedQuery("Usertable.findByWeight");
        query.setParameter("weight", weight);
        return query.getResultList();
    }

    @GET
    @Path("findByGender/{gender}")
    @Produces({"application/json"})
    public List<Usertable> findByGender(@PathParam("gender") String gender) {
        Query query = em.createNamedQuery("Usertable.findByGender");
        query.setParameter("gender", gender);
        return query.getResultList();
    }

    @GET
    @Path("findByAddress/{address}")
    @Produces({"application/json"})
    public List<Usertable> findByAddress(@PathParam("address") String address) {
        Query query = em.createNamedQuery("Usertable.findByAddress");
        query.setParameter("address", address);
        return query.getResultList();
    }

    @GET
    @Path("findByPostcode/{postcode}")
    @Produces({"application/json"})
    public List<Usertable> findByPostcode(@PathParam("postcode") String postcode) {
        Query query = em.createNamedQuery("Usertable.findByPostcode");
        query.setParameter("postcode", postcode);
        return query.getResultList();
    }

    @GET
    @Path("findByLevelofactivity/{levelofactivity}")
    @Produces({"application/json"})
    public List<Usertable> findByLevelofactivity(@PathParam("levelofactivity") Integer levelofactivity) {
        Query query = em.createNamedQuery("Usertable.findByLevelofactivity");
        query.setParameter("levelofactivity", levelofactivity);
        return query.getResultList();
    }

    @GET
    @Path("findByStepspermile/{stepspermile}")
    @Produces({"application/json"})
    public List<Usertable> findByStepspermile(@PathParam("stepspermile") Integer stepspermile) {
        Query query = em.createNamedQuery("Usertable.findByStepspermile");
        query.setParameter("stepspermile", stepspermile);
        return query.getResultList();
    }

    @GET
    @Path("findByNameANDSurname/{name}/{surname}")
    @Produces({"application/json"})
    public List<Usertable> findByNameANDSurname(@PathParam("name") String name, @PathParam("surname") String surname) {
        TypedQuery<Usertable> query = em.createQuery("SELECT u FROM Usertable u WHERE u.name = :name AND u.surname = :surname", Usertable.class);
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        return query.getResultList();
    }

    @GET
    @Path("findCaloriesBurnedPerStepByUserid/{userid}")
    @Produces({"application/json"})
    public List<CaloriesBurnedPerStep> findCaloriesBurnedPerStepByUserid(@PathParam("userid") Integer userid) {
        TypedQuery<Usertable> query = em.createQuery("SELECT u FROM Usertable u WHERE u.userid = :userid", Usertable.class);
        query.setParameter("userid", userid);
        double cbps = 0;
        List<CaloriesBurnedPerStep> cbpslist = new ArrayList<CaloriesBurnedPerStep>();
        for (Usertable var : query.getResultList()) {
            cbps = (double) var.getWeight() * 0.49;
            cbps = cbps / (double) var.getStepspermile();
            cbpslist.add(new CaloriesBurnedPerStep(userid, cbps));
        }
        return cbpslist;
    }

    @GET
    @Path("findBMRAmount/{userid}")
    @Produces({"application/json"})
    public List<BMR> findBMRAmount(@PathParam("userid") Integer userid) throws ParseException {
        TypedQuery<Usertable> query = em.createQuery("SELECT u FROM Usertable u WHERE u.userid = :userid", Usertable.class);
        query.setParameter("userid", userid);
        double bmramount = 0;
        List<BMR> bmrlist = new ArrayList<BMR>();
        for (Usertable var : query.getResultList()) {

            Date d = var.getDateofbirth();
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH) + 1;
            int date = c.get(Calendar.DATE);
            LocalDate loc = LocalDate.of(year, month, date);
            LocalDate now1 = LocalDate.now();
            Period diff1 = Period.between(loc, now1);
            int age = diff1.getYears();

            if (var.getGender().equals("M")) {
                bmramount = (13.75 * var.getWeight()) + (5.003 * var.getHeight()) - (6.755 * (double)age) + 66.5;
            } else {
                bmramount = (9.563 * var.getWeight()) + (1.85 * var.getHeight()) - (4.676 * (double)age) + 66.5;
            }
            bmrlist.add(new BMR(userid, bmramount));
        }
        return bmrlist;
    }

    @GET
    @Path("findTotalCaloriesBurnedAtRest/{userid}")
    @Produces({"application/json"})
    public List<TotalCaloriesBurnedAtRest> findTotalCaloriesBurnedAtRest(@PathParam("userid") Integer userid) throws ParseException{
        TypedQuery<Usertable> query = em.createQuery("SELECT u FROM Usertable u WHERE u.userid = :userid", Usertable.class);
        query.setParameter("userid", userid);
        List<BMR> bmrlist = new ArrayList<BMR>();
        bmrlist = findBMRAmount(userid);
        double tcbaramount = 0;
        List<TotalCaloriesBurnedAtRest> tcbarlist = new ArrayList<TotalCaloriesBurnedAtRest>();
        for (Usertable var : query.getResultList()) 
        {
            if(var.getLevelofactivity() == 1) tcbaramount = bmrlist.get(0).getBMRAmount()*1.2;
            if(var.getLevelofactivity() == 2) tcbaramount = bmrlist.get(0).getBMRAmount()*1.375;
            if(var.getLevelofactivity() == 3) tcbaramount = bmrlist.get(0).getBMRAmount()*1.55;
            if(var.getLevelofactivity() == 4) tcbaramount = bmrlist.get(0).getBMRAmount()*1.725;
            if(var.getLevelofactivity() == 5) tcbaramount = bmrlist.get(0).getBMRAmount()*1.9;
            tcbarlist.add(new TotalCaloriesBurnedAtRest(userid,tcbaramount));
        }
        return tcbarlist;
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Usertable find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Usertable> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Usertable> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
