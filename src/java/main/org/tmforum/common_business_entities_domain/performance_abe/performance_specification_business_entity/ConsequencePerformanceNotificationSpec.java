/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* The invariant characteristics that define a communication (notificatio 
* n) that occurs as part of a PerformanceConsquence. A Notification is t 
* ypically one-sided, in that no Response is expected. For example, an a 
* larm may be raised as the result of a PerformanceThreshold being viola 
* ted. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::Performance Specification ABE::PerformanceNotificationSpecification" href="_3E3F0EC000E9447663930138-content.html">SID Models::Common Business Entities Domain::Performance ABE::Performance Specification ABE::PerformanceNotificationSpecification</a> @since SID_R16.5
*/ 

public  class ConsequencePerformanceNotificationSpec extends PerformanceNotificationSpecification {



/**  
* Field consequencePerformanceNotification
*/
protected List<ConsequencePerformanceNotification> consequencePerformanceNotification ;




/**  
* Field performanceThresholdApplicabilityConsequence
*/
protected List<PerformanceThresholdApplicabilityConsequence> performanceThresholdApplicabilityConsequence ;




/**  
* Field performanceConsequence
*/
protected List<PerformanceConsequence> performanceConsequence ;


}