/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is the superclass of the CTP (ConnectionTerminationP 
* oint) and PTP (PhysicalTerminationPoint) object classes. TP encapsulat 
* es object characteristics common to both CTPs and PTPs (i.e., common t 
* o end points (actual or potential) of Subnetwork Connections, Topologi 
* cal Links and Flow Domain Fragments). The layer rate of the TP is expr 
* essed in terms of the Transmission Parameters list attribute. See R_TM 
* F518_NRF_I_0005 and R_TMF518_NRF_I_0006. For Connectionless Port Termi 
* nation Points (CPTP) in connectionless network see R_TMF518_NRF_I_0016 
* . 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class TIPTerminationPoint extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field direction
* This attribute represents a static, inherent capability of the TP. 

*/
protected Directionality direction ;




/**  
* Field tpProtectionAssociation
* This attribute indicates whether the TP has an associated protection T 

* P and, if so, what kind of protection association exists. 

*/
protected TerminationPointProtectionAssociation tpProtectionAssociation ;




/**  
* Field isEdgePoint
* This attribute indicates if the TP is an edge point of at least one Su 

* bnetwork or Flow Domain, i.e. if it is an end point of a potential int 

* er-Subnetwork/inter-FlowDomain Topological Link. </br>See R_TMF518_NRF 

* _I_0008. 

*/
protected Boolean isEdgePoint ;




/**  
* Field isEquipmentProtected
* This attribute indicates whether or not the TP is supported by a prote 

* cted Equipment. 

*/
protected Boolean isEquipmentProtected ;




/**  
* Field egressTmdState
* This attribute contains the state of consistency between a TP and its  

* associated egress TransmissionDescriptor. 

*/
protected TransmissionDescriptorState egressTmdState ;




/**  
* Field ingressTmdState
* This attribute contains the state of consistency between a TP and its  

* associated ingress TransmissionDescriptor. 

*/
protected TransmissionDescriptorState ingressTmdState ;




/**  
* Field egressTmdRef
*/
protected TransmissionDescriptor egressTmdRef ;




/**  
* Field ingressTmdRef
*/
protected TransmissionDescriptor ingressTmdRef ;




/**  
* Field transmissionParameterList
* This attribute contains the layered Transmission Parameters associated 

*  with the different layers that are encapsulated within the TP. </br>R 

* efer to attached supporting document SD1-16_LayeredParameters for deta 

* ils of the currently defined Transmission Parameters...\..\Framework\S 

* D\SD1-16_LayeredParameters.pdf 

*/
protected List<TransmissionParameterList> transmissionParameterList ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field asapRef
*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field terminationPoint1
*/
protected TIPTerminationPoint terminationPoint1 ;




/**  
* Field trafficConditioningProfile
*/
protected List<TrafficConditioningProfile> trafficConditioningProfile ;




/**  
* Field terminationPointPool
*/
protected List<TerminationPointPool> terminationPointPool ;


}