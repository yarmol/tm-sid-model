/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* A job for evaluating thresholds defined over performance indicators. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MeasurementJob |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ManagementJob @since SID_R16.5
*/ 

public  class MeasurementThresholdJob extends MeasurementJob,ManagementJob {



/**  
* Field performanceThreshold
* A Measurement Threshold Job evaluates a Performance threshold in a spe 

* cific context and time schedule. 

*/
protected PerformanceThreshold performanceThreshold ;


}