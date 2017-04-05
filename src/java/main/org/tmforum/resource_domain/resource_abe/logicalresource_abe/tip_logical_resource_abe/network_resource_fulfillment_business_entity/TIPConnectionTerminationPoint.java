/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is an actual or potential end point of a Subnetwork  
* Connection or Flow Domain Fragment. For example, the ConnectionTermina 
* tionPoint (CTP) can represent a logical channel or a timeslot on a phy 
* sical link. Note regarding naming: Wherever multiple layers are applic 
* able to a particular CTP, the connectable layer is used as a basis for 
*  the name. When the CTP has no connectable layer, any layer that ensur 
* es name unicity can be used. See R_TMF518_NRF_I_0009 and R_TMF518_NRF_ 
* I_0010. For Flow Points in connectionless networks see R_TMF518_NRF_I_ 
* 0018. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint" href="_.v0.h8.wC.sCE.d.y.x.q.rD.z5.j4.e5.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::TIP Logical Resource ABE::Network Resource Fulfillment ABE::TIPTerminationPoint</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TIPConnectionTerminationPoint extends TIPTerminationPoint,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field connectionState
* The values that this attribute may take are constrained by the value o 

* f the "direction" attribute of the CTP. There is also a dependency on  

* the value of the "tpMappingMode" attribute of the CTP. </br>See R_TMF5 

* 18_NRF_I_0037. 

*/
protected TerminationPointConnectionState connectionState ;




/**  
* Field tpMappingMode
* Within the façade definition, the CTP/FTP can act as an aggregate of a 

* ssociated G.805 TCPs, G.805 Termination Functions and G.805 CPs at one 

*  or more LayerRates. The CTP is contained within a PTP or FTP. The tpM 

* appingMode attribute indicates and controls the connection of the name 

* d CP at a specified LayerRate to the dedicated G.805 TCP and associate 

* d G.805 Termination Function at the same LayerRate within the CTP/FTP. 

*/
protected TerminationMode tpMappingMode ;




/**  
* Field connectionTerminationPoint1
*/
protected List<TIPConnectionTerminationPoint> connectionTerminationPoint1 ;




/**  
* Field connectionTerminationPoint1
*/
protected TIPConnectionTerminationPoint connectionTerminationPoint1 ;


}