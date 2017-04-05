/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a network grouping of zero or more Matrix 
*  Flow Domains (MFDs) and zero or more Connectionless Port Termination  
* Points (CPTPs) that are assigned to these MFDs. See R_TMF518_NRF_I_004 
* 9 and R_TMF518_NRF_I_0050. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class FlowDomain extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field transmissionParameterList
* This attribute contains the technology-specific parameters associated  

* with the different connectionless layers that are supported by the FD. 

*  </br>Refer to to chapter “Connectionless Technology Parameters” of th 

* e attached supporting document SD1-16_LayeredParameters for details of 

*  the currently defined Transmission Parameters...\..\Framework\SD\SD1- 

* 16_LayeredParameters.pdf 

*/
protected TransmissionParameterList transmissionParameterList ;




/**  
* Field connectivityState
* This attribute provides an indication about the server layer connectiv 

* ity between the Matrix Flow Domains associated to the FlowDomain. 

*/
protected ConnectivityState connectivityState ;




/**  
* Field type
* This attribute provides an indication of the type of the Flow Domain. 

*/
protected FlowDomainType type ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field terminationPoint
*/
protected List<TIPTerminationPoint> terminationPoint ;




/**  
* Field flowDomainFragment
*/
protected List<FlowDomainFragment> flowDomainFragment ;


}