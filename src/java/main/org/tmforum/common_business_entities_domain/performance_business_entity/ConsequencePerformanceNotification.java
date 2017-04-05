/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A communication that occurs as part of a PerformanceConsquence. A Noti 
* fication is typically one-sided, in that no Response is expected. For  
* example, an alert be raised as the result of a PerformanceThreshold be 
* ing violated. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::PerformanceNotification" href="_3E3F0EC000E94479FA5403A8-content.html">SID Models::Common Business Entities Domain::Performance ABE::PerformanceNotification</a> |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class ConsequencePerformanceNotification extends PerformanceNotification,BusinessInteraction {



/**  
* Field consequencePerformanceNotificationSpec
*/
protected ConsequencePerformanceNotificationSpec consequencePerformanceNotificationSpec ;




/**  
* Field performanceThresholdApplicabilityConsequence
*/
protected PerformanceThresholdApplicabilityConsequence performanceThresholdApplicabilityConsequence ;




/**  
* Field performanceConsequence
*/
protected PerformanceConsequence performanceConsequence ;


}