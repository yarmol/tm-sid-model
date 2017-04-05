/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is an actual or potential end point of a Topological 
*  (physical) Link. The PTP does participate in associations unique to t 
* he PTP class (i.e., associations which do not apply to CTPs and theref 
* ore cannot be captured via the TP superclass). See R_TMF518_NRF_I_0007 
* . 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint" href="_.v0.h8.wC.sCE.d.y.x.q.rD.z5.j4.e5.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalTerminationPoint extends TIPTerminationPoint,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field equipment
*/
protected Equipment equipment ;




/**  
* Field connectionTerminationPoint
*/
protected List<TIPConnectionTerminationPoint> connectionTerminationPoint ;




/**  
* Field managedElement
*/
protected ManagedElement managedElement ;


}