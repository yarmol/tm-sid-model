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
* The specfication of additional constraints to be defined for the relat 
* ed SoftwareResourceSpecifications. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecRelationship" href="_.eNJ.l.kF7ME.eKYG6QMPWHJ.eQ-content.html">SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecRelationship</a> @since SID_R16.5
*/ 

public  class SoftwareSpecConstraintRelationship extends SoftwareResourceSpecRelationship {



/**  
* Field isSymmetricConstraint
* An indicator that specifies if the relationship is from  the perspecti 

* ve of just one specification or from both.  For example, A constrains  

* B, and B constrains A. 

*/
protected Boolean isSymmetricConstraint ;


}