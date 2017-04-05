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
* Common information about a Service, ServiceAccessPoint, and SapSpecifi 
* cation. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::TIP Common ABE::Framework ABE::CommonObjectInfo @since SID_R16.5
*/ 

public  class CommonServiceInfo extends CommonObjectInfo {



/**  
* Field description
* Textual characterization of the service object. 

*/
protected String description ;




/**  
* Field service
*/
protected Service service ;




/**  
* Field sapspecification
*/
protected SapSpecification sapspecification ;




/**  
* Field serviceaccesspoint
*/
protected ServiceAccessPoint serviceaccesspoint ;


}