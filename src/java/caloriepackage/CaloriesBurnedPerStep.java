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
public class CaloriesBurnedPerStep {
    Integer userid;
    double caloriesburnedperstep;
    
    public Integer getUserid(){
    return this.userid;}
    
    public void setUserid(Integer id){
    this.userid=id;}
    
    public double getCaloriesBurnedPerStep(){
    return this.caloriesburnedperstep;}
    
    public void setCaloriesBurnedPerStep(double cbps){
    this.caloriesburnedperstep=cbps;}
    
    public CaloriesBurnedPerStep(){
    this.userid=0;
    this.caloriesburnedperstep=0;}
    
    public CaloriesBurnedPerStep(Integer userid, double cbps){
    this.userid=userid;
    this.caloriesburnedperstep=cbps;}
    
}
