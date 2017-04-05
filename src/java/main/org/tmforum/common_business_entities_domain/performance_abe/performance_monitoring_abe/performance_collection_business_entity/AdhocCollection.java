/**
* Performance Collection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_RVF.yEI.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Collection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_abe.performance_collection_business_entity ;

/**
* A PM query for collecting performance indicators of a certain time ran 
* ge. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ManagementJob @since SID_R16.5
*/ 

public  class AdhocCollection extends ManagementJob {



/**  
* Field performanceIndicatorGroupSpecification
*/
protected List<PerformanceIndicatorGroupSpecification> performanceIndicatorGroupSpecification ;




/**  
* Field performanceIndicatorSpecification
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field consumingApplicationId
* The identifier of the application that consumes performance indicators 

* . 

*/
protected String consumingApplicationId ;




/**  
* Field producingApplicationId
* The identifier of the application that produces performance  indicator 

* s. 

*/
protected String producingApplicationId ;




/**  
* Field granularity
* The sampling rate of Performance Indicators as determined when they ar 

* e produced. In many cases a different granularity  of an indicator wil 

* l be reflected in a different indicator value (e.g. a gauge) 

*/
protected Granularity granularity ;




/**  
* Field outputFormat
* The file format that is used for transferring the performance data bet 

* ween applications.</br> 

*/
protected String outputFormat ;




/**  
* Field collectionPeriod
* The time range of the requested Performance Indicators. 

*/
protected TimePeriod collectionPeriod ;




/**  
* Field monitoredObjectsCriteria
*/
protected MonitoredObjectsCriteria monitoredObjectsCriteria ;




/**  
* Field trackingRecord
* Allows the tracking of modifications on the adhoc collection.</br>The  

* tracking records should not be returned by default with the adhoc coll 

* ection to allow retrieving the adhoc collection without the tracking r 

* ecords.</br>Whether the tracking records is stored with the adhoc coll 

* ection or outside of it is implementation specific. 

*/
protected List<TrackingRecord> trackingRecord ;


}