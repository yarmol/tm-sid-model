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
* An action that takes place in the event that a ServiceLevelObjective i 
* s not met. 
 @since SID_R16.5
*/ 

public  class ServiceLevelSpecConsequence  {



/**  
* Field prescribedAction
* Recommended remedy for a violated ServiceLevelObjective.</br></br>A pl 

* aceholder that indicates an extension may be made to the SID model her 

* e to further define remedies. 

*/
protected String prescribedAction ;




/**  
* Field validFor
* The period of time for which a ServiceLevelSpecConsequence applies. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceLevelSpecApplicability
*/
protected List<ServiceLevelSpecApplicability> serviceLevelSpecApplicability ;




/**  
* Field serviceLevelSpecification
*/
protected ServiceLevelSpecification serviceLevelSpecification ;




/**  
* Field serviceLevelObjective
*/
protected List<ServiceLevelObjective> serviceLevelObjective ;




/**  
* Field serviceLevelSpecificationExpression
*/
protected List<ServiceLevelSpecExpression> serviceLevelSpecificationExpression ;


}