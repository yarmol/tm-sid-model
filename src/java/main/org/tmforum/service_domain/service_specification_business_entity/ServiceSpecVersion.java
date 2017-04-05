/**
* Service Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D50919203C4-content.html">Service Specification ABE</a> 
* The Service Specification ABE contains entities that define the shared 
*  characteristics of both types of Service entities. This enables multi 
* ple instances to be derived from a single specification entity. In thi 
* s derivation, each instance will use the characteristics  defined in i 
* ts associated specification.Entities in this ABE focus on adherence to 
*  standards, distinguishing features of a Service, dependencies (both p 
* hysical and logical, as well as on other services), quality, and cost. 
*  In general, entities in this ABE enable Services to be bound to Produ 
* cts and run using Resources.Network services are one example of Servic 
* es that can be built. Additional examples include installation, mainte 
* nance, monitoring, and content authentication, authorization, accounti 
* ng, and auditing functions. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_business_entity ;

/**
* This class represents the ability to distinguish between different ins 
* tances of ServiceSpecifications. It represents a particular form or va 
* riety of a ServiceSpecification that is different from others or from  
* the original. The form represents differences in attributes, methods,  
* relationships, and/or constraints that characterize this particular Se 
* rviceSpecification, but which are not enough to warrant creating a new 
*  ServiceSpecification. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ServiceSpecVersion extends Entity {



/**  
* Field svcSpecRevisionName
* This defines the name of this revision of this ServiceSpecification. 

*/
protected String svcSpecRevisionName ;




/**  
* Field svcSpecRevisionFormat
* This attribute defines the specific revision format used in this versi 

* on. Each field of the revision is separated by a period. For example,  

* if the desired format is .>, then the value of this string could be:</ 

* br></br> major-number.minor-number</br></br>The semantics of the forma 

* t should be described in the revisionSemantics attribute of this class 

* .</br> 

*/
protected String svcSpecRevisionFormat ;




/**  
* Field svcSpecRevisionNumber
* This is the revision number of this instance. This includes subfileds  

* such as major number, minor number, and so forth. The subfields are se 

* parated by a period delimited. The format of the subfields is provided 

*  in the revisionFormat attribute of this class. 

*/
protected String svcSpecRevisionNumber ;




/**  
* Field svcSpecRevisionReason
* This is a string that describes the reason for creating this version. 

*/
protected String svcSpecRevisionReason ;




/**  
* Field svcSpecRevisionSemantics
* This is a string that is used to define the particular semantics of th 

* is version. This string should include as a minimum a description of t 

* he format of the revisionNumber. 

*/
protected String svcSpecRevisionSemantics ;




/**  
* Field svcSpecRevisionTimestamp
* This defines the date and time of the revision. 

*/
protected DateTime svcSpecRevisionTimestamp ;




/**  
* Field svcSpecRevisionValidityPeriod
* This defines the time period in which this revision is valid for. 

*/
protected TimePeriod svcSpecRevisionValidityPeriod ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;


}