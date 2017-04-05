/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is an abstraction of the topology provided by the ta 
* rget OS which describes the potential for SubNetwork Connections. Top- 
* level Multi Layer Subnetworks are subnetworks contained directly under 
*  either the target OS or a Management Domain. See R_TMF518_NRF_I_0021  
* and R_TMF518_NRF_I_0021. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class MultiLayerSubNetwork extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field type
* This attribute identifies the type of the Subnetwork. </br>See R_TMF51 

* 8_NRF_I_0023. 

*/
protected Topology type ;




/**  
* Field supportedRateList
* This attribute identifies the supported connection layer rates of the  

* subnetwork. 

*/
protected List<LayerRate> supportedRateList ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field managedElement
*/
protected List<ManagedElement> managedElement ;




/**  
* Field terminationPoint
*/
protected List<TIPTerminationPoint> terminationPoint ;




/**  
* Field subNetworkConnection
*/
protected List<SubNetworkConnection> subNetworkConnection ;




/**  
* Field tpPool
*/
protected List<TerminationPointPool> tpPool ;




/**  
* Field managementDomain
*/
protected TIPManagementDomain managementDomain ;




/**  
* Field topologicallink
*/
protected List<TopologicalLink> topologicallink ;


}