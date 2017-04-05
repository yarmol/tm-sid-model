/**
* Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CCD30232-content.html">Resource Specification ABE</a> 
* The Resource Specification ABE contains entities that define the share 
* d characteristics and behavior of each of the four types of Resource e 
* ntities. This enables multiple instances to be derived from a single s 
* pecification entity. In this derivation, each instance will use the sh 
* ared characteristics and behavior defined in its associated template. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_business_entity ;

/**
* This class represents the ability to distinguish between different ins 
* tances of ResourceSpecifications. It represents a particular form or v 
* ariety of a ResourceSpecification that is different from others or fro 
* m the original. The form represents differences in attributes, methods 
* , relationships, and/or constraints that characterize this particular  
* ResourceSpecification, but which are not enough to warrant creating a  
* new ResourceSpecification. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ResourceSpecVersion extends Entity {



/**  
* Field resSpecRevisionName
* This defines the name of this revision of this ServiceSpecification. 

*/
protected String resSpecRevisionName ;




/**  
* Field resSpecRevisionFormat
* This attribute defines the specific revision format used in this versi 

* on. Each field of the revision is separated by a period. For example,  

* if the desired format is .>, then the value of this string could be:</ 

* br></br> major-number.minor-number</br></br>The semantics of the forma 

* t should be described in the revisionSemantics attribute of this class 

* .</br> 

*/
protected String resSpecRevisionFormat ;




/**  
* Field resSpecRevisionNumber
* This is the revision number of this instance. This includes subfileds  

* such as major number, minor number, and so forth. The subfields are se 

* parated by a period delimited. The format of the subfields is provided 

*  in the revisionFormat attribute of this class. 

*/
protected String resSpecRevisionNumber ;




/**  
* Field resSpecRevisionReason
* This is a string that describes the reason for creating this version. 

*/
protected String resSpecRevisionReason ;




/**  
* Field resSpecRevisionSemantics
* This is a string that is used to define the particular semantics of th 

* is version. This string should include as a minimum a description of t 

* he format of the revisionNumber. 

*/
protected String resSpecRevisionSemantics ;




/**  
* Field resSpecRevisionTimestamp
* This defines the date and time of the revision. 

*/
protected DateTime resSpecRevisionTimestamp ;




/**  
* Field resSpecRevisionValidityPeriod
* This defines the time period in which this revision is valid for. 

*/
protected TimePeriod resSpecRevisionValidityPeriod ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;


}