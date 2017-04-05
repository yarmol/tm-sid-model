/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* The specification of how to populate the alarm fields when generating  
* a threshold crossing alarm. 
 @since SID_R16.5
*/ 

public  class PerformanceAlarmSpecification  {



/**  
* Field perfAlamSpecSeverity
* A value for the  PerceivedSeverity attribute as part of a threshold cr 

* ossing alarm definition. 

*/
protected PerceivedSeverity perfAlamSpecSeverity ;




/**  
* Field perfAlarmSpecProbableCause
* A value for the ProbableCause attribute as part of a threshold crossin 

* g alarm definition. 

*/
protected String perfAlarmSpecProbableCause ;




/**  
* Field perfAlarmSpecAlarmType
* A value for the AlarmType attribute as part of a threshold crossing al 

* arm definition. 

*/
protected String perfAlarmSpecAlarmType ;




/**  
* Field perfAlarmSpecSpecificProblem
* A value for the  SpecificProblem attribute as part of a threshold cros 

* sing alarm definition. 

*/
protected String perfAlarmSpecSpecificProblem ;




/**  
* Field perfAlarmSpecAdditionalText
* A value for the  AdditionalText attribute as part of a threshold cross 

* ing alarm definition. 

*/
protected String perfAlarmSpecAdditionalText ;




/**  
* Field perfAlarmThresholdCrossingDescription
* A specific description of the threshold crossing (intended to be popul 

* ated e under the alarm under CrossedThreshold structure). 

*/
protected String perfAlarmThresholdCrossingDescription ;




/**  
* Field performanceConsequence
* The Performance alarm specification is part of of a Performance thresh 

* old consequence. 

*/
protected PerformanceConsequence performanceConsequence ;


}