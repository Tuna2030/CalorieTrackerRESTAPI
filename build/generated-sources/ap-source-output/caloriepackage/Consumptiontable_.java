package caloriepackage;

import caloriepackage.Foodtable;
import caloriepackage.Usertable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T23:18:26")
@StaticMetamodel(Consumptiontable.class)
public class Consumptiontable_ { 

    public static volatile SingularAttribute<Consumptiontable, Date> date;
    public static volatile SingularAttribute<Consumptiontable, Integer> consumptionid;
    public static volatile SingularAttribute<Consumptiontable, Foodtable> foodid;
    public static volatile SingularAttribute<Consumptiontable, Integer> dailyquantity;
    public static volatile SingularAttribute<Consumptiontable, Usertable> userid;

}