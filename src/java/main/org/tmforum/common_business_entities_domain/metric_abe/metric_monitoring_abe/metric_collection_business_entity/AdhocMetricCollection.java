/**
* Metric Collection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.r.o.r.u.zX0WE.eO.iY.q.x.wU.q84N.g-content.html">Metric Collection ABE</a> 
* The Metric Collection ABE is initialized but has to be further studied 
*  during iteration 3. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_abe.metric_collection_business_entity ;

/**
* A job for collecting MetricMeasures produced by another job to make av 
* ailable MetricMeasures for subscribers. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Metric ABE::Metric Monitoring ABE::Metric Job ABE::MetricMeasurementJob @since SID_R16.5
*/ 

public  class AdhocMetricCollection extends MetricMeasurementJob {



/**  
* Field outputFormat
* The file format that is used for transferring the MetricMeasure data b 

* etween applications.</br> 

*/
protected String outputFormat ;




/**  
* Field collectionPeriod
* The time range of the requested MetricMeasure. 

*/
protected TimePeriod collectionPeriod ;


}