/**
* Performance Production ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.e.lXAI.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Production ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_abe.performance_production_business_entity ;

/**
* A job for producing performance indicators. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MeasurementJob |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Management Job ABE::ManagementJob @since SID_R16.5
*/ 

public  class MeasurementProductionJob extends MeasurementJob,ManagementJob {



/**  
* Field collectionJob
* A production job may have a collection job associated to it. In such a 

*  case operations such as create job and delete job will be applied on  

* the pair of jobs. 

*/
protected MeasurementCollectionJob collectionJob ;


}