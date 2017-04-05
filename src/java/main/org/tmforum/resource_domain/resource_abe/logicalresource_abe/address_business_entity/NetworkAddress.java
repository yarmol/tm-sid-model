/**
* Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C98D60102-content.html">Address ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.address_business_entity ;

/**
* This class represents the generic concept of a network address. Its su 
* bclasses define different types of addresses of different technologies 
* , such as an IPAddress vs. an IPXAddress. Its utility lies in its abil 
* ity to serve as a convenient point for sourcing and terminating relati 
* onships. This eliminates undue duplication of relationships that inter 
* act with the subclasses of NetworkAddress. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class NetworkAddress extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface
*/
protected DeviceInterface deviceInterface ;




/**  
* Field networkAddress
*/
protected List<NetworkAddress> networkAddress ;




/**  
* Field networkAddress1
*/
protected List<NetworkAddress> networkAddress1 ;


}