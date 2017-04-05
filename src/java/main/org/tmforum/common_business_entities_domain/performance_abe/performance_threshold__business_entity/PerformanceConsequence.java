/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* A Consequence can be applied as a result of a threshold crossing or a  
* threshold ceasing to be crossed.  
 @since SID_R16.5
*/ 

public  class PerformanceConsequence  {



/**  
* Field performanceIndicator
*/
protected List<PerformanceIndicator> performanceIndicator ;




/**  
* Field ID
* A unique identifier for the PerformanceConsequence. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a PerformanceConsequence is known and 

*  distinguished from other PerformanceConsequences. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the PerforrmanceConsequence i 

* s. 

*/
protected String description ;




/**  
* Field prescribedAction
* Recommended remedy for a violated Performance threshold. 

*/
protected String prescribedAction ;




/**  
* Field validFor
* The period for which a PerformanceConsequence applies. 

*/
protected Object validFor ;




/**  
* Field performanceThresholdApplicability
*/
protected List<PerformanceThresholdApplicability> performanceThresholdApplicability ;




/**  
* Field alarmSpecification
* The Performance alarm specification is a kind of a Consequence. 

*/
protected PerformanceAlarmSpecification alarmSpecification ;




/**  
* Field consequencePerformanceNotificationSpec
*/
protected ConsequencePerformanceNotificationSpec consequencePerformanceNotificationSpec ;




/**  
* Field consequencePerformanceNotification
*/
protected List<ConsequencePerformanceNotification> consequencePerformanceNotification ;


}