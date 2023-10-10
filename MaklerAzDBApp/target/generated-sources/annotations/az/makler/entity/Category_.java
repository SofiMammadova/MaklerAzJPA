package az.makler.entity;

import az.makler.entity.Elan;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-09T16:31:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile ListAttribute<Category, Elan> elanList;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Integer> categoryId;

}