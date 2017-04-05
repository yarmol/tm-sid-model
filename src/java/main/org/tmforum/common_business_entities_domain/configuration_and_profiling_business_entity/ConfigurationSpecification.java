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
* The definition of how a Resource, Service, or Product operates or func 
* tions in terms of CharacteristicSpecification(s) and related ResourceS 
* pec(s), ProductSpec(s), ServiceSpec(s). 
 @since SID_R16.5
*/ 

public  class ConfigurationSpecification  {



/**  
* Field ID
* A unique identifier for the ConfigurationSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the ConfigurationSpecification is kno 

* wn and distinguished from other ConfigurationSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the ConfigurationSpecificatio 

* n is. 

*/
protected String description ;




/**  
* Field version
* A particular form of a ConfigurationSpecification that differs in cert 

* ain respects from an earlier ConfigurationSpecification. 

*/
protected String version ;




/**  
* Field validFor
* The period for which the ConfigurationSpecification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field configuration
*/
protected List<Configuration> configuration ;




/**  
* Field configSpecRelationship
*/
protected List<ConfigSpecRelationship> configSpecRelationship ;




/**  
* Field configSpecRelationship2
*/
protected List<ConfigSpecRelationship> configSpecRelationship2 ;




/**  
* Field configurationSpecConstraint
*/
protected List<ConfigurationSpecConstraint> configurationSpecConstraint ;




/**  
* Field configurationSpecConstraint2
*/
protected List<ConfigurationSpecConstraint> configurationSpecConstraint2 ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field policySet2
*/
protected PolicySet policySet2 ;


}