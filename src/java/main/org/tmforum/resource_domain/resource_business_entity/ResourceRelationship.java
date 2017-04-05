/**
* Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9430ADC580046-content.html">Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_business_entity ;

/**
* A migration, substitution, dependency, or exclusivity relationship bet 
* ween/among Resources. 
 @since SID_R16.5
*/ 

public  class ResourceRelationship  {



/**  
* Field type
* A categorization of the relationship, such as migration, substitution, 

*  dependency, exclusivity. 

*/
protected String type ;




/**  
* Field validFor
* The period for which the relationship is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field resource
*/
protected Resource resource ;




/**  
* Field resource2
*/
protected Resource resource2 ;


}