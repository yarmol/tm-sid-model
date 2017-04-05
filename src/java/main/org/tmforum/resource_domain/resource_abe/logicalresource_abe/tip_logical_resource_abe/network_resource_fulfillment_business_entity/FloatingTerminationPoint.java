/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a TP without a physical layer that behave 
* s both like a PTP and a CTP. Floating Termination Points (FTPs) are co 
* ntained in managed elements as PTPs. Note: The value of tpMappingMode  
* for FTPs considers exclusively mapping on the server side. See R_TMF51 
* 8_NRF_I_0011. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPConnectionTerminationPoint" href="_YKK.w0DX.lE.d.y6.c.fT6.nDQ.m.x.w-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPConnectionTerminationPoint</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::PhysicalTerminationPoint" href="_GQ.v_YMNXE.d.y.d.iYA.u_Q32IQ-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::PhysicalTerminationPoint</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint" href="_.v0.h8.wC.sCE.d.y.x.q.rD.z5.j4.e5.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class FloatingTerminationPoint extends TIPConnectionTerminationPoint,PhysicalTerminationPoint,TIPTerminationPoint,LogicalResource,Resource,Entity,RootEntity {

}