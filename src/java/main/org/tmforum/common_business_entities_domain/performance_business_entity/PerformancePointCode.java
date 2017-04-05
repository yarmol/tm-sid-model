/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A Performance-related extension to a Point Code, which represents ISUP 
*  Signaling OPC and DPC attributes that map to Region, Subregion, Node  
* Type, and Node Name. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::PerformanceNetworkAddress" href="_3E3F0EC000E944710E9C004A-content.html">SID Models::Common Business Entities Domain::Performance ABE::PerformanceNetworkAddress</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PerformancePointCode extends PerformanceNetworkAddress,NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field NetworkInd
*/
protected String NetworkInd ;




/**  
* Field pointCode
*/
protected PointCode pointCode ;


}