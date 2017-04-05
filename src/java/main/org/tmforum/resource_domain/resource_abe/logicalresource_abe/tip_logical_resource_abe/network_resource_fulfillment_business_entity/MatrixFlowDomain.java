/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is contained within a Managed Element (ME) and repre 
* sents a grouping of assigned Connectionless Port Termination Points (C 
* PTPs). See R_TMF518_NRF_I_0047 and R_TMF518_NRF_I_0048. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class MatrixFlowDomain extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field transmissionParameterList
* This attribute contains the technology-specific parameters associated  

* with the different connectionless layers that are supported by the MFD 

* . </br>Refer to to chapter “Connectionless Technology Parameters” of t 

* he attached supporting document SD1-16_LayeredParameters for details o 

* f the currently defined Transmission Parameters...\..\Framework\SD\SD1 

* -16_LayeredParameters.pdf 

*/
protected TransmissionParameterList transmissionParameterList ;




/**  
* Field isFlexible
* This attribute indicates whether the MFD is fixed and cannot be config 

* ured by the NMS (= False) or is flexible (= True). 

*/
protected Boolean isFlexible ;




/**  
* Field tmdState
* This attribute contains the state of consistency between a TP and its  

* associated egress TransmissionDescriptor. 

*/
protected TransmissionDescriptorState tmdState ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field flowDomain
*/
protected FlowDomain flowDomain ;




/**  
* Field matrixFlowDomainFragment
*/
protected List<MatrixFlowDomainFragment> matrixFlowDomainFragment ;




/**  
* Field terminationPoint
*/
protected List<TIPTerminationPoint> terminationPoint ;




/**  
* Field managedElement
*/
protected ManagedElement managedElement ;


}