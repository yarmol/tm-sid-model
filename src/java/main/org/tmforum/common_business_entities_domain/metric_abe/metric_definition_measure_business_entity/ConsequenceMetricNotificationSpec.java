/**
* Metric Definition Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_LG5.m0A8.rE.eOYVLP.tPBF.v2.g-content.html">Metric Definition Measure ABE</a> 
* The MetricDefMeasure specifies a measure of a specific aspect of an en 
* tity and is the main part of a MetricDefinition.The Metric Definition  
* Measure ABE contains all entities describing the MetricDefMeasure such 
*  as the related threshold, notification and consequence. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_business_entity ;

/**
* It specifies the invariant characteristics that define a communication 
*  (notification) that occurs as part of a MetricDefMeasureConsquence. A 
*  Notification is typically one-sided, in that no Response is expected. 
*  For example, a notification might be defined for a supervisor role an 
* d another one for a technician role as the result of a MetricDefMeasur 
* eThresholdRule.In this case, each ConsequenceMetricNotificationSpec wi 
* ll specify to include the value of the MetricMeasure but the text migh 
* t be different and they could contain different information according  
* to the scope of interest from the supervisor and the technician. 
 @since SID_R16.5
*/ 

public  class ConsequenceMetricNotificationSpec  {



/**  
* Field consequenceMetricNotification
*/
protected List<ConsequenceMetricNotification> consequenceMetricNotification ;




/**  
* Field metricDefMeasureConsequence
*/
protected List<MetricDefMeasureConsequence> metricDefMeasureConsequence ;


}