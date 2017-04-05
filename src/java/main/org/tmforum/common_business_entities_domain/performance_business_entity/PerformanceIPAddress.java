/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A Performance-related extension to an IP address. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::PerformanceNetworkAddress" href="_3E3F0EC000E944710E9C004A-content.html">SID Models::Common Business Entities Domain::Performance ABE::PerformanceNetworkAddress</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Address ABE::NetworkAddress |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PerformanceIPAddress extends PerformanceNetworkAddress,NetworkAddress,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field ipAddress
* A single IP address or a range of IP addresses. 

*/
protected String ipAddress ;




/**  
* Field NumOfIPs
* A number that represents the number of IP addresses specified by a ran 

* ge of IP Addresses in the ipAddress attribute. 

*/
protected Integer NumOfIPs ;




/**  
* Field iPAddress
*/
protected IPAddress iPAddress ;


}