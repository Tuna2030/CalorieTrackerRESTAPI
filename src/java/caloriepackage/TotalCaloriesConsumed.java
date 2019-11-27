
package caloriepackage;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TotalCaloriesConsumed {
    Integer userid;
    double totalcaloriesconsumed;
    Date d1;
    
    public Integer getUserid(){
    return this.userid;}
    
    public void setUserid(Integer id){
    this.userid=id;}
    
    public double getTotalCaloriesConsumed(){
    return this.totalcaloriesconsumed;}
    
    public void setTotalCaloriesConsumed(double tcc){
    this.totalcaloriesconsumed=tcc;}
    
    public Date getDate(){
    return this.d1;}
    
    public void setDate(Date d){
    this.d1=d;}
    
    public TotalCaloriesConsumed(){
    this.userid=0;
    this.totalcaloriesconsumed=0;
    this.d1=null;}
    
    public TotalCaloriesConsumed(Integer userid, double tcc, Date d1){
    this.userid=userid;
    this.totalcaloriesconsumed=tcc;
    this.d1=d1;}
}


