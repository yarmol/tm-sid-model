/**
* Performance Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_M.j.u.t8EJ-E.eG.f.y.rOV.xYG.hW.g-content.html">Performance Monitoring ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_business_entity ;

/**
* A job for scheduling PM related activities: the collection of performa 
* nce indicators or the production of performance indicators.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ManagementJob @since SID_R16.5
*/ 

public abstract class MeasurementJob extends ManagementJob {



/**  
* Field performanceIndicatorGroupSpecification
* The requested indicator groups are specified using PerformanceIndicato 

* rGroupSpecification.  

*/
protected List<PerformanceIndicatorGroupSpecification> performanceIndicatorGroupSpecification ;




/**  
* Field performanceIndicatorSpecification
* The requested indicators are specified using PerformanceIndicatorSpeci 

* fication. 

*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field consumingApplicationId
* The identifier of the application that produces performance  indicator 

* s. 

*/
protected String consumingApplicationId ;




/**  
* Field producingApplicationId
* The identifier of the application that consumes performance indicators 

* . 

*/
protected String producingApplicationId ;




/**  
* Field granularity
* The sampling rate of Performance Indicators as determined when they ar 

* e produced. </br>Note:</br></br>In many cases a different granularity  

* of an indicator will be reflected in a different indicator value (e.g. 

*  a gauge) 

*/
protected Granularity granularity ;




/**  
* Field monitoredObjectsCriteria
*  Monitored objects are specified by the MonitoredObjectsCriteria. 

*/
protected MonitoredObjectsCriteria monitoredObjectsCriteria ;




/**  
* Field trackingRecord
*/
protected List<TrackingRecord> trackingRecord ;


}