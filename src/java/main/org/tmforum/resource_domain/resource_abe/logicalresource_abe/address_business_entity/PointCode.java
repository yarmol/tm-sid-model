/**
* Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C98D60102-content.html">Address ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.address_business_entity ;

/**
* ISUP Signaling OPC and DPC attributes that map to Region, Subregion, N 
* ode Type, and Node Name. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress" href="_3E3F0EC000E93EA768F201CD-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PointCode extends NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field performancePointCode
*/
protected PerformancePointCode performancePointCode ;




/**  
* Field pointCode
* A unique identifier for the PointCode. 

*/
protected String pointCode ;




/**  
* Field validFor
* The period for which a PointCode applies. 

*/
protected TimePeriod validFor ;




/**  
* Field pointCodeType
*/
protected String pointCodeType ;




/**  
* Field performancepointcode
*/
protected PerformancePointCode performancepointcode ;


}