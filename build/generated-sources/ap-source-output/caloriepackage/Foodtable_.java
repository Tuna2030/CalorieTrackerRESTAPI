package caloriepackage;

import caloriepackage.Consumptiontable;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T23:18:26")
@StaticMetamodel(Foodtable.class)
public class Foodtable_ { 

    public static volatile SingularAttribute<Foodtable, Integer> calorieamount;
    public static volatile SingularAttribute<Foodtable, Integer> servingamount;
    public static volatile SingularAttribute<Foodtable, Integer> foodid;
    public static volatile SingularAttribute<Foodtable, String> name;
    public static volatile SingularAttribute<Foodtable, Integer> fat;
    public static volatile SingularAttribute<Foodtable, String> category;
    public static volatile CollectionAttribute<Foodtable, Consumptiontable> consumptiontableCollection;
    public static volatile SingularAttribute<Foodtable, String> servingunit;

}