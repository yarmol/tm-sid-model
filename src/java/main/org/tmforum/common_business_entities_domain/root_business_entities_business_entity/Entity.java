/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

import org.tmforum.common_business_entities_domain.root_business_entities_abe.entity_identification_business_entity.EntityIdentification;

import java.util.List;

/**
* This is an abstract class that extends the RootEntity class in order t 
* o represent classes of objects that play a business function. Entities 
*  can be either managed or unmanaged. If it is managed, then it is furt 
* her defined by a ManagedEntity, else it has no relationship with Manag 
* edEntity.More formally, an Entity represents objects that have a separ 
* ate and distinct existence. They are not just a collection of attribut 
* es or an abstraction of behavior. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class Entity extends RootEntity {



/**  
* Field entityIdentification
*/
protected List<EntityIdentification> entityIdentification ;




/**  
* Field entityRole
*/
protected List<EntityRole> entityRole ;




/**  
* Field managedEntity
*/
protected ManagedEntity managedEntity ;


}