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
* A relationship between two Configurations.  One relationship may repre 
* sent a group of Configurations that are configured. For example, the C 
* onfiguration for a connection may be composed of the Configurations fo 
* r the connection as well as for connection termination points that are 
*  assigned to the connection. 
 @since SID_R16.5
*/ 

public  class ConfigRelationship  {



/**  
* Field configuration
*/
protected Configuration configuration ;




/**  
* Field configuration2
*/
protected Configuration configuration2 ;




/**  
* Field validFor
* The period for which the ConfigurationSpecConstraint is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition of the ConfigRelationship, such as active, inactive, pla 

* nned. 

*/
protected String status ;


}