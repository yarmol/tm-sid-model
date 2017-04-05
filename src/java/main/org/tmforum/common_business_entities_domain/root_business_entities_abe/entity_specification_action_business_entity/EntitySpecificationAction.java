/**
* Entity Specification Action ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_ZL.w.hQK09E.e.a.zDMG.f.zT.b.l9.g-content.html">Entity Specification Action ABE</a> 
* A collection of entities that can be used to define related entity spe 
* cification actions and workflows. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.entity_specification_action_business_entity ;

/**
* This is the class representing an action like Add, Disconnect and Modi 
* fy for an entity specification. 
 @since SID_R16.5
*/ 

public  class EntitySpecificationAction  {



/**  
* Field name
* A word, term, or phrase by which the EntitySpecificationAction is know 

* n and distinguished from others. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the EntitySpecificationAction 

*  represents. 

*/
protected String description ;




/**  
* Field version
* The version given to this item This may include subfileds like major a 

* nd minor which are separated by a period delimiter. 

*/
protected String version ;




/**  
* Field validFor
* The period of time during which the EntitySpecificationAction is appli 

* cable. 

*/
protected TimePeriod validFor ;




/**  
* Field orderItemAction
* The corresponding order item action like Add, Modify, Disconnect if th 

* is item is orderable. 

*/
protected String orderItemAction ;




/**  
* Field entitySpecification
*/
protected List<EntitySpecification> entitySpecification ;




/**  
* Field entitySpecificationActionWorkflow
*/
protected List<EntitySpecificationActionWorkflow> entitySpecificationActionWorkflow ;


}