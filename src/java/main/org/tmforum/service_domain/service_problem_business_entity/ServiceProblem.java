/**
* Service Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_SC.d7.wP.a6E.d2F.u5.zG43E.t.pQ-content.html">Service Problem ABE</a> 
* The Service Problem ABE manages faults, alarms, and outages from a Ser 
* vice point-of-view. This is then correlated to trouble tickets, regard 
* less of whether the cause is physical or logical.Other entities in thi 
* s ABE are used to direct the recovery from each of these three types o 
* f problems. They provide the ability to associate Resource faults and  
* alarms to degradation and outages of Services that run on those Resour 
* ces. These functions are independent of the Resources and technologies 
*  used to build the Service.A third set of entities in this ABE is used 
*  to differentiate between customer-reported problems and network-induc 
* ed problems. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_problem_business_entity ;

/**
* A Service Problem is an indication that a service is no longer functio 
* ning according to the agreement with its client(s). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Trouble or Problem ABE::Problem @since SID_R16.5
*/ 

public  class ServiceProblem extends Problem {



/**  
* Field affectedServiceNumber
* Number of affected services (mandatory, but value can be zero). 

*/
protected Integer affectedServiceNumber ;




/**  
* Field underlyingAlarms
*/
protected List<ResourceAlarm> underlyingAlarms ;




/**  
* Field affectedResources
*/
protected List<Resource> affectedResources ;




/**  
* Field affectedServices
*/
protected List<Service> affectedServices ;


}