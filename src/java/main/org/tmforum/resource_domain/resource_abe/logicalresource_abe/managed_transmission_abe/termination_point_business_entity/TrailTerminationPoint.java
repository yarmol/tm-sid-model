/**
* Termination Point ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C314E00A4-content.html">Termination Point ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_abe.termination_point_business_entity ;

/**
* This is an abstract class whose purpose is to group different types of 
*  TrailTerminationPoints. This enables a single composition (CTPsInTrai 
* l) to be run to this class, which is then inherited by its subclasses. 
*  This is deemed better than building three relationships between the ( 
* currently) three types of TrailTerminationPoints and the CTP class. No 
* te that each has the same containment relationship.This object is deri 
* ved from M.3100. M.3100 didn't define this object per se, but did defi 
* ne three objects that inherited from TerminationPoint that can be bett 
* er modeled as being subclassed from this class. The SID integrates it  
* into the ManagedTransmissionEntity hierarchy so that it can interact w 
* ith IETF managed objects. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Termination Point ABE::TerminationPoint" href="_3E3F0EC000E93CDDCABC021F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Termination Point ABE::TerminationPoint</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TrailTerminationPoint extends TerminationPoint,ManagedTransmissionEntity,LogicalResource,Resource,Entity,RootEntity {

}