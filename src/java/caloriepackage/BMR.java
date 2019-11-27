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
public class BMR {
    Integer userid;
    double bmramount;
    
    public Integer getUserid(){
    return this.userid;}
    
    public void setUserid(Integer id){
    this.userid=id;}
    
    public double getBMRAmount(){
    return this.bmramount;}
    
    public void setBMRAmount(double bmr){
    this.bmramount=bmr;}
    
    public BMR(){
    this.userid=0;
    this.bmramount=0;}
    
    public BMR(Integer userid, double bmr){
    this.userid=userid;
    this.bmramount=bmr;}
}
