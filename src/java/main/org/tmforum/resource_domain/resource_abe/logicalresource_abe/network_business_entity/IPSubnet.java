/**
* Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C322B0390-content.html">Network ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource. These can be divided into four basic types  
* of entities.The first two, PhysicalResource and LogicalResource, are s 
* ets of entities that represent the physical and logical aspects of a R 
* esource, respectively. This is important to enable the SID to build a  
* set of reusable managed entities that can be used to model the physica 
* l and logical aspects of different types of Resources.The third type o 
* f entity, CompoundResource, is a set of entities that shows how to agg 
* regate PhysicalResources and LogicalResources into aggregate entities  
* that has physical and logical characteristics and behavior. This enabl 
* es designers to represent Resources that have physical and logical cha 
* racteristics and behavior as a single entity.The fourth type of entity 
* , Network, is a set of entities that shows how to represent networks,  
* sub-networks, network components, and other related aspects of a netwo 
* rk. This type of entity builds on the notion of a CompoundResource by  
* aggregating CompoundResources into a functional whole. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.network_business_entity ;

/**
* A portion of a network that shares a common address component. On TCP/ 
* IP networks, subnets are defined as all devices whose IP addresses hav 
* e the same prefix. For example, all devices with IP addresses that sta 
* rt with 100.100.100 would be part of the same subnet. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::SubNetwork" href="_3E3F0EC000E93EA97CEF0045-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::SubNetwork</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network" href="_3E3F0EC000E93CDDD46B03BF-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network</a> |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceCollection |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPSubnet extends SubNetwork,Network,ResourceCollection,CompoundResource,Resource,Entity,RootEntity {



/**  
* Field addressType
* This is an enumerated integer that defines the format of the IPAddress 

* . Values include:</br></br> 0: Unknown</br> 1: Dotted Decimal (i.e., A 

* ddress and Mask)</br> 2: CIDR</br> 

*/
protected Integer addressType ;




/**  
* Field addressVersion
* This is an enumerated integer that describes the format of the address 

*  of this IPSubnet. Values include:</br></br> 0: Unknown</br> 1: IPv4</ 

* br> 2: IPv6</br> 

*/
protected Integer addressVersion ;




/**  
* Field addressRange
* This is a string format that contains the range of IP Addresses of thi 

* s IPSubnet. The format is determined by the AddressType attribute, and 

*  is either CIDR or dotted decimal. 

*/
protected String addressRange ;


}