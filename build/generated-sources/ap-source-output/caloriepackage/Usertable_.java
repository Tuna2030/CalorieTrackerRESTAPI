package caloriepackage;

import caloriepackage.Consumptiontable;
import caloriepackage.Credentialtable;
import caloriepackage.Reporttable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T23:18:26")
@StaticMetamodel(Usertable.class)
public class Usertable_ { 

    public static volatile SingularAttribute<Usertable, Date> dateofbirth;
    public static volatile SingularAttribute<Usertable, String> address;
    public static volatile SingularAttribute<Usertable, String> gender;
    public static volatile CollectionAttribute<Usertable, Credentialtable> credentialtableCollection;
    public static volatile SingularAttribute<Usertable, Integer> stepspermile;
    public static volatile SingularAttribute<Usertable, String> postcode;
    public static volatile SingularAttribute<Usertable, Integer> weight;
    public static volatile CollectionAttribute<Usertable, Reporttable> reporttableCollection;
    public static volatile SingularAttribute<Usertable, Integer> userid;
    public static volatile SingularAttribute<Usertable, String> surname;
    public static volatile SingularAttribute<Usertable, String> name;
    public static volatile SingularAttribute<Usertable, Integer> levelofactivity;
    public static volatile CollectionAttribute<Usertable, Consumptiontable> consumptiontableCollection;
    public static volatile SingularAttribute<Usertable, String> email;
    public static volatile SingularAttribute<Usertable, Integer> height;

}