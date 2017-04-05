/**
* Performance Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_M.j.u.t8EJ-E.eG.f.y.rOV.xYG.hW.g-content.html">Performance Monitoring ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_business_entity ;

/**
* A criteria for specifying what monitored objects are referenced by a P 
* M query, specifying a monitored object class in conjunction with a fil 
* ter. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MonitoredObjectsCriteria" href="_.kODZ4LNSE.eC6.n.t.sF.k9S.z.yA-content.html">SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MonitoredObjectsCriteria</a> @since SID_R16.5
*/ 

public  class MonitoredClassCriteria extends MonitoredObjectsCriteria {



/**  
* Field monitoredObjectClass
*  A  monitored object class for specifying the set of instances that ar 

* e referenced by a PM query. 

*/
protected String monitoredObjectClass ;




/**  
* Field objectInstanceFilter
*  A filter that can be used in conjunction with the  monitored object c 

* lass for specifying the set of instancesthat are referenced by a PM qu 

* ery. 

*/
protected Filter objectInstanceFilter ;


}