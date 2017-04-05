/**
* Software Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WU.i.pIG33E.eKS.yM.d.c.hR.z1.yQ-content.html">Software Resource Specification ABE</a> 
* The definition of an SoftwareResourceSpecification whose attribute val 
* ues are shared by every instance of an SoftwareResource related to it. 
*   This entity is a super-class for  
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_abe.software_resource_and_software_specifications_abe.software_resource_specification_business_entity ;

/**
* The definition of a type of relationship (association) that can exist  
* between SoftwareResourceSpecifications. 
 @since SID_R16.5
*/ 

public  class SoftwareResourceSpecRelationship  {



/**  
* Field softwareResourceSpecification
*/
protected SoftwareResourceSpecification softwareResourceSpecification ;




/**  
* Field softwareResourceSpecification2
*/
protected SoftwareResourceSpecification softwareResourceSpecification2 ;




/**  
* Field relationshipType
* Text that descriptions the type of relationship between the SoftwareRe 

* sourceSpecifications. 

*/
protected Object relationshipType ;




/**  
* Field relationshipTypeCode
* An enumeration of the values for a particular type of SoftwareSpecific 

* ationRelationship that is dependent on the relationshipType attribute. 

* </br></br>For example, for a Refinement type of relationship the value 

*  may represent a substitution, division, or fusion. 

*/
protected Object relationshipTypeCode ;




/**  
* Field relationshipReason
* Text that explains the reason for the association between the Software 

* ResourceSpecifications. 

*/
protected Object relationshipReason ;




/**  
* Field validFor
* The period of time expressed in a start/end date and time during which 

*  the relationship exists. 

*/
protected TimePeriod validFor ;


}