/**
* Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C98D60102-content.html">Address ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.address_business_entity ;

/**
* This class refines the generic IP Address class to add formatting capa 
* bilities that are specific to IPv4. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::IPAddress" href="_3E3F0EC000E93E2C995F0308-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::IPAddress</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress" href="_3E3F0EC000E93EA768F201CD-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPv4Address extends IPAddress,NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field v4Format
* This is an enumerated integer that defines the format of the IPv4 addr 

* ess. Values are:</br></br> 0: dotted decimal</br> 1: CIDR</br> 

*/
protected Integer v4Format ;


}