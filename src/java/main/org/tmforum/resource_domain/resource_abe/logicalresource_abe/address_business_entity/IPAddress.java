/**
* Address ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C98D60102-content.html">Address ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.address_business_entity ;

/**
* This class represents an IP address. It can be either in v4 or v6 form 
* , and can be formatted as dotted decimal or CIDR. One or more host ali 
* ases can also be supplied. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress" href="_3E3F0EC000E93EA768F201CD-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class IPAddress extends NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field performanceIPAddress
*/
protected PerformanceIPAddress performanceIPAddress ;




/**  
* Field networkNumber
* This contains the network number portion of the IP Address. 

*/
protected String networkNumber ;




/**  
* Field hostNumber
* This contains the host number portion of the IP Address. 

*/
protected String hostNumber ;




/**  
* Field subnetMask
* This is a string attribute that defines the subnet mask for the IP Add 

* ress of this instance. The IP Address is constructed by concatenating  

* the networkNumber and the hostNumber, forming a dotted decimal IP Addr 

* ess. The subnetMask is formatted according to the appropriate conventi 

* on as defined in the addressFormat attribute of this object. 

*/
protected String subnetMask ;




/**  
* Field performanceipaddress
*/
protected PerformanceIPAddress performanceipaddress ;




/**  
* Field dhcpSecurityEvent
*/
protected List<DHCPSecurityEvent> dhcpSecurityEvent ;




/**  
* Field nacSecurityEventSubject
*/
protected NACSecurityEventSubject nacSecurityEventSubject ;




/**  
* Field securityEventEndpoint
*/
protected SecurityEventEndpoint securityEventEndpoint ;


}