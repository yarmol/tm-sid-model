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
* A representation of how a Resource, Service, or Product operates or fu 
* nctions in terms of characteristics and related Resource(s), Product(s 
* ), Service(s). 
 @since SID_R16.5
*/ 

public  class Configuration  {



/**  
* Field configurationSpecification
*/
protected ConfigurationSpecification configurationSpecification ;




/**  
* Field configRelationship
*/
protected List<ConfigRelationship> configRelationship ;




/**  
* Field configRelationship2
*/
protected List<ConfigRelationship> configRelationship2 ;




/**  
* Field version
* A particular form of a Configuration that differs in certain respects  

* from an earlier Configuration. 

*/
protected String version ;




/**  
* Field description
* A narrative that explains in detail what the Configuration is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the Configuration is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field dateCreated
* The date and time on which the Configuration was created. 

*/
protected DateTime dateCreated ;


}