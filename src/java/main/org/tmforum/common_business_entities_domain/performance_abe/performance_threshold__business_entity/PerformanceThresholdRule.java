/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* A base entity for concrete definition of thresholds. 
 @since SID_R16.5
*/ 

public abstract class PerformanceThresholdRule  {



/**  
* Field performanceThreshold
*/
protected PerformanceThreshold performanceThreshold ;




/**  
* Field thresholdRuleCondition
* A threshold may have two possible values: "Raise" - a threshold was cr 

* ossed or "Clear" - a threshold ceased crossing. 

*/
protected ThresholdCondition thresholdRuleCondition ;




/**  
* Field thresholdRuleSeverity
* A threshold can be generated in different severity levels. A crossing  

* for each level may require a different condition and possibly trigger  

* a different consequence. The supported severity levels are equivalent  

* to the possible severity level of alarms. 

*/
protected PerceivedSeverity thresholdRuleSeverity ;




/**  
* Field performanceConsequence
* A threshold crossing or a threshold ceased to be crossing results in a 

*  Performance consequence. 

*/
protected List<PerformanceConsequence> performanceConsequence ;


}