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
* The definition of an API whose attribute values are shared by every in 
* stance of an API related to it. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification" href="_5ZTMYG33E.eKS.yM.d.c.hR.z1.yQ-content.html">SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification</a> |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class APISpecification extends SoftwareResourceSpecification,LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field aPI
*/
protected List<API> aPI ;




/**  
* Field apiProtocolType
* API protocol type like REST, SOAP and so on. 

*/
protected String apiProtocolType ;




/**  
* Field externalUrl
* The url of an API offered to the user. this is seen as external url fo 

* r an API brokerage. 

*/
protected URL externalUrl ;




/**  
* Field internalUrl
* The url of an API offered to an API brokerage. 

*/
protected URL internalUrl ;




/**  
* Field externalSchema
* The external API schema of the (external) url offered to the client of 

*  this API. 

*/
protected String externalSchema ;




/**  
* Field internalSchema
* The internal API schema of the (internal) url which an API broker uses 

* . 

*/
protected String internalSchema ;




/**  
* Field authenticationType
* The authentication type like OAUTH, SSL used for this API 

*/
protected String authenticationType ;




/**  
* Field allowedOperations
* A comma separated list of authorised operations like POST, PATCH for t 

* his API. 

*/
protected String allowedOperations ;




/**  
* Field allowedApiEntities
* A comma separated list of authorised entities for this API. 

*/
protected String allowedApiEntities ;




/**  
* Field responseTypeFormat
* Response type format of this API like Text and Json.  

*/
protected String responseTypeFormat ;


}