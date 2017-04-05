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
* Represents a type of Service Specification introduced for the purposes 
*  of Service Fulfillment. It defines specific ServiceSpecCharacteristic 
* sValues for the globally set ServiceSpecCharacteristics that can be dy 
* namically referenced by multiple Service instances during their lifecy 
* cle span. A ServiceTemplate is checked against its associated ServiceD 
* efinition by verifying the presence of the ServiceSpecCharacteristics  
* and the validity of the corresponding assigned ServiceSpecCharacterist 
* icsValues. 
 @since SID_R16.5
*/ 

public  class ServiceTemplate  {



/**  
* Field stStatus
* The state of the Service Template; it may take on one of the following 

*  values: Draft, Pilot, Commercial, Retired. 

*/
protected String stStatus ;




/**  
* Field source
* Determines whether the source of the OS providing the Service Template 

*  is “external” or “internal” to a given organization. 

*/
protected String source ;




/**  
* Field serviceLocation
* Gives the URL of where the service component activation OS is actually 

*  located. 

*/
protected String serviceLocation ;




/**  
* Field serviceDefinition
*/
protected ServiceDefinition serviceDefinition ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;


}