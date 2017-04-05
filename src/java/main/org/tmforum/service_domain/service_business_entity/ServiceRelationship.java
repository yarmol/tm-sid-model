/**
* Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D5091860236-content.html">Service ABE</a> 
* The Service ABE contains entities that are used to represent both cust 
* omer-facing and resource-facing types of services. Entities in this AB 
* E provide different views to examine, analyze, configure, monitor and  
* repair Services of all types. Entities in this ABE are derived from Se 
* rvice Specification entities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;

/**
* A relationship between/among Services, such as  replacement, migration 
* , substitution, or dependency. 
 @since SID_R16.5
*/ 

public  class ServiceRelationship  {



/**  
* Field type
* A categorization of the relationship, such as relies on. 

*/
protected String type ;




/**  
* Field validFor
* The period for which the relationship is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field service
*/
protected Service service ;




/**  
* Field service2
*/
protected Service service2 ;


}