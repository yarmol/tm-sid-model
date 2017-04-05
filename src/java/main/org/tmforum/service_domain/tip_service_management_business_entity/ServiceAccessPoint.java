/**
* TIP Service Management ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_4C.d.s.gN4PE.d-RS.o.tR.aD.m1.g.w-content.html">TIP Service Management ABE</a> 
* The TMF Interface Program introduced in the Multi-Technology Operation 
* s System Interface (MTOSI) 2.0, Service Management interfaces based up 
* on extensions to the SID service model in this ABE. The resulting solu 
* tion set introduced two new service management activation interfaces,  
* and a service inventory interface. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.tip_service_management_business_entity ;

/**
* Represents a set of parameters associated (directly or indirectly) wit 
* h a unique (logical and/or physical) resource where the Service can be 
*  accessed. 
 @since SID_R16.5
*/ 

public  class ServiceAccessPoint  {



/**  
* Field type
* Method to group service access points that have strongly marked and re 

* adily defined similarities. This attribute is used in the Service Defi 

* nition to identify the type of SAP required at service activation time 

* . 

*/
protected String type ;




/**  
* Field serviceState
* Indicates the ability of an entity to provide service. 

*/
protected String serviceState ;




/**  
* Field operationalState
* Indicates whether the set of resources supporting the service are inst 

* alled and working. 

*/
protected String operationalState ;




/**  
* Field adminState
* Represents the administrative suspension (or resumption) of traffic fo 

* r a given subscriber. 

*/
protected String adminState ;




/**  
* Field service
*/
protected List<Service> service ;




/**  
* Field sapSpec
*/
protected SapSpecification sapSpec ;




/**  
* Field characteristicValue
*/
protected CharacteristicValue characteristicValue ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field commonServiceInfo
*/
protected CommonServiceInfo commonServiceInfo ;


}