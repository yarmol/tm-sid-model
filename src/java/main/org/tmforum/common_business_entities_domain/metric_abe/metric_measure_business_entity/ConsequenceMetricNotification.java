/**
* Metric Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V6H.b.gJM.yE.eO.bUN.v1_8.v.h8.w-content.html">Metric Measure ABE</a> 
* The Metric Measure ABE contains entities describing measures according 
*  to a MetricDefMeasure such as MetricMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity ;

/**
* A communication that occurs as part of a MetricMeasureConsquence to in 
* form about a MetricDefMeasureThresholdRule being crossed.A Notificatio 
* n is typically one-sided, in that no Response is expected.For example, 
*  a notification might be sent to a supervisor and another one to a tec 
* hnician as the result of a MetricDefMeasureThresholdRule fixing the li 
* mits of lost packets, being crossed. Each ConsequenceMetricNotificatio 
* n will include the value of the MetricMeasure and other information ac 
* cording to the scope of interest from the supervisor and the technicia 
* n. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class ConsequenceMetricNotification extends BusinessInteraction {



/**  
* Field consequenceMetricNotificationSpec
*/
protected ConsequenceMetricNotificationSpec consequenceMetricNotificationSpec ;




/**  
* Field metricMeasureConsequence
*/
protected MetricMeasureConsequence metricMeasureConsequence ;


}