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
*  of Service Fulfillment. It defines ALL the ServiceSpecCharacteristics 
*  (SSCs) that must be used to create corresponding Service instances. T 
* his includes the SSCs which are:  globally set (the corresponding valu 
* es are defined only in ServiceTemplates and are sometimes designated a 
* s “invariant”) and  set per instance (since the ServiceDefinition does 
*  not contain any value for such SSCs, the corresponding values can be  
* defined only over the Activation Interface and are sometimes designate 
* d as “variant”) 
 @since SID_R16.5
*/ 

public  class ServiceDefinition  {



/**  
* Field sdStatus
* The state of the Service Definition; it may take on one of the followi 

* ng values: Draft, Standard, or Proprietary. 

*/
protected String sdStatus ;




/**  
* Field activationMode
* Indicates whether the designed service is activated through provisioni 

* ng, or is signaled. 

*/
protected String activationMode ;




/**  
* Field serviceTemplate
*/
protected List<ServiceTemplate> serviceTemplate ;




/**  
* Field saPSpec
*/
protected List<SapSpecification> saPSpec ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;


}