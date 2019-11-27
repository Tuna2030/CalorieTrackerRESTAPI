package caloriepackage;

import caloriepackage.Usertable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T23:18:26")
@StaticMetamodel(Reporttable.class)
public class Reporttable_ { 

    public static volatile SingularAttribute<Reporttable, Date> date;
    public static volatile SingularAttribute<Reporttable, Integer> reportid;
    public static volatile SingularAttribute<Reporttable, Integer> totalcaloriesconsumed;
    public static volatile SingularAttribute<Reporttable, Integer> totalcaloriesburned;
    public static volatile SingularAttribute<Reporttable, Integer> totalstepstaken;
    public static volatile SingularAttribute<Reporttable, Integer> dailycaloriegoal;
    public static volatile SingularAttribute<Reporttable, Usertable> userid;

}