/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Y500
 */
@XmlRootElement
public class TotalCaloriesBurnedAtRest {
    
    Integer userid;
    double totalcaloriesburnedatrest;
    
    public Integer getUserid(){
    return this.userid;}
    
    public void setUserid(Integer id){
    this.userid=id;}
    
    public double getTotalCaloriesBurnedAtRest(){
    return this.totalcaloriesburnedatrest;}
    
    public void setTotalCaloriesBurnedAtRest(double tcbar){
    this.totalcaloriesburnedatrest=tcbar;}
    
    public TotalCaloriesBurnedAtRest(){
    this.userid=0;
    this.totalcaloriesburnedatrest=0;}
    
    public TotalCaloriesBurnedAtRest(Integer userid, double tcbar){
    this.userid=userid;
    this.totalcaloriesburnedatrest=tcbar;}
    
    
}
