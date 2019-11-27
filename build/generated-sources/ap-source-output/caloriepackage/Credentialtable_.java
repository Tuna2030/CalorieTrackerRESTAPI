package caloriepackage;

import caloriepackage.Usertable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T23:18:26")
@StaticMetamodel(Credentialtable.class)
public class Credentialtable_ { 

    public static volatile SingularAttribute<Credentialtable, Date> signupdate;
    public static volatile SingularAttribute<Credentialtable, Integer> credentialid;
    public static volatile SingularAttribute<Credentialtable, String> passwordhash;
    public static volatile SingularAttribute<Credentialtable, Usertable> userid;
    public static volatile SingularAttribute<Credentialtable, String> username;

}