/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a physical link between two or more (usua 
* l case two; more than two e.g., for representing RPR transport connect 
* ivity) PTPs or a trail between two TPs. A Topological Link (TL) may tr 
* averse through DWDM equipment and optical transport networks managed b 
* y another target OS. The TL reported by the first target OS in that ca 
* se could correspond to a (regenerator) section under its management do 
* main. It is up to the requesting OS user to put together the exact top 
* ology of the network in such cases, based on the reported Managed Elem 
* ents and TLs. For unidirectional TLs the aEndTP marks the traffic sour 
* ce whereas the zEndTP marks the traffic sink. See R_TMF518_NRF_I_0019  
* and R_TMF518_NRF_I_0020. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TopologicalLink extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field direction
* This attribute identifies the direction of the Topological Link. 

*/
protected ConnectionDirection direction ;




/**  
* Field layerRate
* This attribute identifies the layer and bandwidth (rate) of the Topolo 

* gical Link (TL). </br>The Layer Rate of a TL is determined by the lowe 

* st common Layer Rate of the end point TPs, about which the target OS h 

* as knowledge (with the physical layer being the very lowest). 

*/
protected LayerRate layerRate ;




/**  
* Field isReportingAlarms
* This attribute provides an indication of whether alarm reporting for t 

* his Topological Link is administratively activated or de-activated. </ 

* br>True = alarm reporting is activated; False = alarm reporting is de- 

* activated. 

*/
protected Boolean isReportingAlarms ;




/**  
* Field aEndTpRefList
*/
protected List<TIPTerminationPoint> aEndTpRefList ;




/**  
* Field zEndTpRefList
*/
protected List<TIPTerminationPoint> zEndTpRefList ;




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
* Field managementDomain
*/
protected TIPManagementDomain managementDomain ;




/**  
* Field multiLayerSubNetwork
*/
protected MultiLayerSubNetwork multiLayerSubNetwork ;


}