package az.makler.entity;

import az.makler.entity.Agentlik;
import az.makler.entity.Category;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-09T16:31:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Elan.class)
public class Elan_ { 

    public static volatile SingularAttribute<Elan, Integer> mertebe;
    public static volatile SingularAttribute<Elan, Integer> elanId;
    public static volatile SingularAttribute<Elan, Agentlik> agentlik;
    public static volatile SingularAttribute<Elan, String> tip;
    public static volatile SingularAttribute<Elan, Category> category;
    public static volatile SingularAttribute<Elan, Integer> sahe;
    public static volatile SingularAttribute<Elan, String> unvan;

}