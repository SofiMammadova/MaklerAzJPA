package az.makler.entity;

import az.makler.entity.Elan;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-09T16:31:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Agentlik.class)
public class Agentlik_ { 

    public static volatile SingularAttribute<Agentlik, Integer> agentId;
    public static volatile ListAttribute<Agentlik, Elan> elanList;
    public static volatile SingularAttribute<Agentlik, String> contact;
    public static volatile SingularAttribute<Agentlik, String> agentName;

}