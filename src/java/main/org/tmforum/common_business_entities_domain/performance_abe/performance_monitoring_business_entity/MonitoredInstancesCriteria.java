/**
* Performance Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_M.j.u.t8EJ-E.eG.f.y.rOV.xYG.hW.g-content.html">Performance Monitoring ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_monitoring_business_entity ;

/**
* A criteria for specifying what monitored objects are referenced by a P 
* M query, specifying a list of monitored object instances. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MonitoredObjectsCriteria" href="_.kODZ4LNSE.eC6.n.t.sF.k9S.z.yA-content.html">SID Models::Common Business Entities Domain::Performance ABE::Performance Monitoring ABE::MonitoredObjectsCriteria</a> @since SID_R16.5
*/ 

public  class MonitoredInstancesCriteria extends MonitoredObjectsCriteria {



/**  
* Field moniitoredObjectInstances
* A list of object identifiers for specifying what monitored objects nee 

* d to be referenced by a PM query. 

*/
protected List<ObjectName> moniitoredObjectInstances ;


}