/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* The invariant characteristics that define a communication (notificatio 
* n) that occurs as part of performance measurement. A Notification is t 
* ypically one-sided, in that no Response is expected. 
 @since SID_R16.5
*/ 

public  class PerformanceNotificationSpecification  {



/**  
* Field ID
* A unique identifier for the PerformanceNotificationSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PerformanceNotificationSpecificat 

* ion is known and distinguished from other PerformanceNotificationSpeci 

* fications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the PerformanceNotificationSpecification. 

*/
protected String description ;




/**  
* Field validFor
* The period of time for which a PerformanceNotificationSpecification is 

*  applicable. 

*/
protected TimePeriod validFor ;


}