/**
* Configuration and Profiling ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_5R.a.s0IR3E.eOHC.rP.bIP.kY.wA-content.html">Configuration and Profiling ABE</a> 
* A Configuration (also referred to as a Profile) defines how a Resource 
* , Service, or Product operates or functions. A Configuration may conta 
* in one or more parts (which is realized by using the Atomic/Composite  
* pattern, but it is represented as a single entity - ConfigurationRelat 
* ionship), and each part may contain zero or more fields. Each field ma 
* y have attributes that are statically or dynamically defined. Some of  
* these fields have fixed values, while others provide values from which 
*  a choice or choices can be made (e.g., using the EntitySpec/Entity an 
* d/or CharacteristicSpec/CharacteristicValue patterns). 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.configuration_and_profiling_business_entity ;

/**
* A aggregation, migration, substitution, dependency, or exclusivity rel 
* ationship between/among ConfigurationSpecifications. 
 @since SID_R16.5
*/ 

public  class ConfigSpecRelationship  {



/**  
* Field configurationSpecification
*/
protected ConfigurationSpecification configurationSpecification ;




/**  
* Field configurationSpecification2
*/
protected ConfigurationSpecification configurationSpecification2 ;




/**  
* Field configSpecRelationshipType
* A categorization of the relationship between two ConfigurationSpecific 

* ations, such as aggregation, migration, substitution, dependency, excl 

* usivity. 

*/
protected String configSpecRelationshipType ;




/**  
* Field validFor
* The period for which the ConfigurationSpecConstraint is valid. 

*/
protected TimePeriod validFor ;


}