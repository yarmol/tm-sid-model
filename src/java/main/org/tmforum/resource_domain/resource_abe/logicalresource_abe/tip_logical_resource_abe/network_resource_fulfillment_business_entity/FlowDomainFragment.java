/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is a logical entity that represents a transparent en 
* d-to-end connectivity between two or more Flow Points. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class FlowDomainFragment extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field direction
* This attribute represents the directionality of the FDFr. 

*/
protected ConnectionDirection direction ;




/**  
* Field transmissionParameterList
* This attribute contains the technology-specific parameters associated  

* with the different connectionless layers that are supported by the FDF 

* r. </br>Refer to to chapter “Connectionless Technology Parameters” of  

* the attached supporting document SD1-16_LayeredParameters for details  

* of the currently defined Transmission Parameters...\..\Framework\SD\SD 

* 1-16_LayeredParameters.pdf 

*/
protected TransmissionParameterList transmissionParameterList ;




/**  
* Field aEndTpDataList
* This attribute lists all A End Flow Point names together with their TP 

*  data (TP Mapping Mode, Transmission Parameters). 

*/
protected List<TerminationPointData> aEndTpDataList ;




/**  
* Field zEndTpDataList
* This attribute lists all Z End Flow Point names together with their TP 

*  data (TP Mapping Mode, Transmission Parameters). 

*/
protected List<TerminationPointData> zEndTpDataList ;




/**  
* Field isFlexible
* This attribute indicates whether the FDFr is fixed (= True) or is flex 

* ible (= False). 

*/
protected Boolean isFlexible ;




/**  
* Field administrativeState
* This attribute defines administratively the role that the Route shall  

* play for the belonging SNC. There is not any relationship with the act 

* ualState attribute of the Route. </br>It can have the following values 

* : </br>- "locked", the route is not allowed to be active </br>- "unloc 

* ked", the route is allowed to be active. </br> </br>This attribute ind 

* icates whether the FDFr is locked (i.e., traffic units cannot flow thr 

* ough the FDFr) or unlocked (i.e., traffic units are allowed to flow th 

* rough the FDFr). 

*/
protected ControlState administrativeState ;




/**  
* Field state
* This attribute indicates if the FDFr is active or partial. 

*/
protected SubnetworkConnectionState state ;




/**  
* Field type
* This attribute indicates the type of the FDFr. 

*/
protected FlowDomainFragmentType type ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field matrixFlowDomainFragment
*/
protected List<MatrixFlowDomainFragment> matrixFlowDomainFragment ;




/**  
* Field connectionTerminationPoint
*/
protected TIPConnectionTerminationPoint connectionTerminationPoint ;




/**  
* Field connectionTerminationPoint
*/
protected List<TIPConnectionTerminationPoint> connectionTerminationPoint ;




/**  
* Field flowDomainFragmentRoute
*/
protected FlowDomainFragmentRoute flowDomainFragmentRoute ;


}