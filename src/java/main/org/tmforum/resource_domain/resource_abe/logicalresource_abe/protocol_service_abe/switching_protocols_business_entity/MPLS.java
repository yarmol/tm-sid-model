/**
* Switching Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EAB28FB0327-content.html">Switching Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.switching_protocols_business_entity ;

/**
* This class is the base class of the MPLS (Multi-Protocol Label Switchi 
* ng) Protocol. Subclasses of the MPLS class are used to configure vario 
* us aspects of MPLS.MPLS separates forwarding packets from defining wha 
* t the label means. The forwarding paradigm used is based on the notion 
*  of label swapping. MPLS supports a wide variety of forwarding behavio 
* r, ranging from a label being associated to a group of routes to a lab 
* el being associated to a particular flow. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Switching Protocols ABE::SwitchingProtocol" href="_3E3F0EC000E93ED562620218-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Switching Protocols ABE::SwitchingProtocol</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class MPLS extends SwitchingProtocol,Protocol,LogicalResource,Resource,Entity,RootEntity {

}