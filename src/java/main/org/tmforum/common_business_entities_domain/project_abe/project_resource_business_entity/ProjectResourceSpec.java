/**
* Project Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536A800DF-content.html">Project Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_resource_business_entity ;

/**
* Costing ModuleCould be simple cost blocks, parameterised costing block 
* s (template) or rule engine baseddirect + indirect costs 
 @since SID_R16.5
*/ 

public abstract class ProjectResourceSpec  {



/**  
* Field projectResource
*/
protected List<ProjectResource> projectResource ;




/**  
* Field compoundProjectResourceSpec
*/
protected CompoundProjectResourceSpec compoundProjectResourceSpec ;




/**  
* Field resourceSpecCostParameter
*/
protected List<ResourceSpecCostParameter> resourceSpecCostParameter ;




/**  
* Field projectResourcePool
*/
protected ProjectResourcePool projectResourcePool ;




/**  
* Field generalWOFufillment
*/
protected GeneralWOFufillment generalWOFufillment ;




/**  
* Field projectResourceHolding
*/
protected ProjectResourceHolding projectResourceHolding ;




/**  
* Field activitySpec
*/
protected List<ActivitySpec> activitySpec ;




/**  
* Field versionNr
*/
protected String versionNr ;




/**  
* Field name
*/
protected String name ;




/**  
* Field description
*/
protected String description ;




/**  
* Field unitCost
*/
protected Money unitCost ;




/**  
* Field type
*/
protected String type ;




/**  
* Field validFor
*/
protected TimePeriod validFor ;




/**  
* Field resourceRate
*/
protected CostRate resourceRate ;




/**  
* Field id
*/
protected String id ;




/**  
* Field isConsumable
*/
protected Boolean isConsumable ;




/**  
* Field isReservable
*/
protected Boolean isReservable ;




/**  
* Field unit
*/
protected String unit ;


}