/**
* Performance Collection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_RVF.yEI.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Collection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_abe.performance_collection_business_entity ;

/**
* A job for collecting performance indicators. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MeasurementJob |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ManagementJob @since SID_R16.5
*/ 

public  class MeasurementCollectionJob extends MeasurementJob,ManagementJob {



/**  
* Field outputFormat
* The file format that is used for transferring the performance data bet 

* ween applications. 

*/
protected String outputFormat ;




/**  
* Field productionJob
* A collection job maybe attached to a production job. In such a case op 

* erations such as create job and delete job will be applied on the pair 

*  of jobs. 

*/
protected List<MeasurementProductionJob> productionJob ;




/**  
* Field reportingPeriod
* The rate of collecting Performance Indicators reports.  

*/
protected ReportingPeriod reportingPeriod ;


}