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
* Defines a set of attributes and (optionally) associated values that ma 
* y be applied to one or more service access points. 
 @since SID_R16.5
*/ 

public  class SapSpecification  {



/**  
* Field serviceDefinition
*/
protected List<ServiceDefinition> serviceDefinition ;




/**  
* Field type
* Method to group SAP Specifications that have strongly marked and readi 

* ly defined similarities. 

*/
protected String type ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field serviceAccessPoint
*/
protected List<ServiceAccessPoint> serviceAccessPoint ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field serviceSpecificationType
*/
protected ServiceSpecificationType serviceSpecificationType ;




/**  
* Field applicableStateValues
* A list of possible states that a ServiceAccessPoint may take on. 

*/
protected String applicableStateValues ;




/**  
* Field commonServiceInfo
*/
protected CommonServiceInfo commonServiceInfo ;


}