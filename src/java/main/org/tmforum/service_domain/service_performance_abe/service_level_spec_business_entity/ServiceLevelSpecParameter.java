/**
* Service Level Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EB1D7B80071-content.html">Service Level Spec ABE</a> 
* The Service Specification ABE contains entities that define the invari 
* ant characteristics and behavior of both types of Service entities. Th 
* is enables multiple instances to be derived from a single specificatio 
* n entity. In this derivation, each instance will use the invariant cha 
* racteristics and behavior defined in its associated template.This ABE  
* includes a third type of Service Specification entity: that of a Servi 
* ceLevelSpecification. This type of specification templatizes Services  
* that are bound to a Service Level Agreement. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_abe.service_level_spec_business_entity ;

/**
* A variable whose value is used to determine compliance with a ServiceL 
* evelObjective. 
 @since SID_R16.5
*/ 

public abstract class ServiceLevelSpecParameter  {



/**  
* Field serviceParmPerspective
* A string that specifies whether the ServiceLevelSpecParameter represen 

* ts a single user instance parameter or a parameter that represents an  

* aggregation. 

*/
protected String serviceParmPerspective ;




/**  
* Field serviceParmCategory
* A string that specifies whether the ServiceLevelSpecParameter is techn 

* ology specific, service specific, or technology/service independent 

*/
protected String serviceParmCategory ;




/**  
* Field validFor
* The period of time during with the ServiceLevelSpecParameter is applic 

* able. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceLevelObjective
*/
protected List<ServiceLevelObjective> serviceLevelObjective ;




/**  
* Field serviceLevelSpecification
*/
protected ServiceLevelSpecification serviceLevelSpecification ;




/**  
* Field serviceLevelSpecificationExpression
*/
protected List<ServiceLevelSpecExpression> serviceLevelSpecificationExpression ;


}