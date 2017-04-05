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
* ServiceLevelSpecExpression describes strict relations between ServiceL 
* evelSpecification subordinates (ServiceLevelSpecParameter, ServiceLeve 
* lObjective, ServiceLevelConsequence, and ServiceLevelApplicability)).  
* The baseline idea of ServiceLevelSpecExpression is to resolve the mult 
* iple associations between its subordinates. For example, an expression 
*  may consist of a consequence and its applicability for a ServiceLevel 
* Specification. 
 @since SID_R16.5
*/ 

public  class ServiceLevelSpecExpression  {



/**  
* Field serviceLevelSpecParameter1
*/
protected ServiceLevelSpecParameter serviceLevelSpecParameter1 ;




/**  
* Field serviceLevelSpecification
*/
protected ServiceLevelSpecification serviceLevelSpecification ;




/**  
* Field serviceLevelSpecApplicability1
*/
protected ServiceLevelSpecApplicability serviceLevelSpecApplicability1 ;




/**  
* Field serviceLevelSpecConsequence1
*/
protected ServiceLevelSpecConsequence serviceLevelSpecConsequence1 ;




/**  
* Field serviceLevelObjective1
*/
protected ServiceLevelObjective serviceLevelObjective1 ;




/**  
* Field serviceLevelSpecApplicability
* An indicator that is set to true if a ServiceLevelSpecApplicability is 

*  part of the expresssion. 

*/
protected Boolean serviceLevelSpecApplicability ;




/**  
* Field serviceLevelSpecConsequence
* An indicator that is set to true if a ServiceLevelSpecConsequence is p 

* art of the expresssion. 

*/
protected Boolean serviceLevelSpecConsequence ;




/**  
* Field serviceLevelObjective
* An indicator that is set to true if a ServiceLevelSpecObjective is par 

* t of the expresssion. 

*/
protected Boolean serviceLevelObjective ;




/**  
* Field serviceLevelSpecParameter
* An indicator that is set to true if a ServiceLevelSpecParameter is par 

* t of the expresssion. 

*/
protected Boolean serviceLevelSpecParameter ;




/**  
* Field validFor
* The period of time for which the expression is valid. 

*/
protected TimePeriod validFor ;


}