/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The NetworkForwardingDomain (NFD) object class represents the capacity 
*  to enable forwarding and potential for forwarding via ForwardingRelea 
* tionshipEncapsulation (FRE) constructs. The NFD represents the capabil 
* ity to define a route for forwarding across the contained network. The 
*  NFD represents capability for one or more specific layerProtocols whe 
* re the relevant boundaries for each layerProtocol coincide appropriate 
* lyIt a grouping of zero or more:- TPEs which represent access to the N 
* FD- subordinate NFDs which are a partition of its capacity (and hence  
* completely contained)- TLs between the grouped subordinate NFDsThe TPE 
* s associated may terminate TopologicalLinks (TLs). NFD instances and T 
* L instances together define the network topology.New TPEs may be assig 
* ned to the NFD and TPEs may be unassigned from the NFD.Note that the N 
* FD object may be used to represent routing domains or other administra 
* tive domains. The domain groupings may be orthogonal.The top level NFD 
*  corresponds to the whole network for the layerProtocols it includes. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class NetworkForwardingDomain extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field nfdRole
* This attribute identifies purpose for the grouping provided by the NFD 

* .</br></br>The NFD could be:</br>- ROUTING_AREA</br>- FORWARDING_AREA< 

* /br>- ADMINISTRATIVE_AREA</br> 

*/
protected NfdRole nfdRole ;




/**  
* Field edgeTpeRefList
* This attribute lists all of the TPEs that define the boundary of the N 

* FD. 

*/
protected List<TerminationPointEncapsulation> edgeTpeRefList ;




/**  
* Field nfdType
* This attribute  provides the name of the type of the NFD. The type is  

* an expression of the contained topology. 

*/
protected NfdType nfdType ;




/**  
* Field supportingMeRef
* This attribute provides the reference to an ME For cases where the NFD 

*  represents the capability of a single ME or a partition of the capabi 

* lity of an ME. 

*/
protected ManagedElement supportingMeRef ;




/**  
* Field layerProtocolNameList
* Each entry provides the name and potentially additional information su 

* ch as version number for (one of) the protocol(s)/layer(s) that the NF 

* D supports. Syntax and semantic to be specified. 

*/
protected String layerProtocolNameList ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field nfdLevel
* This attribute expresses the level  of the NFD in the hierarchy of NFD 

* s 

*/
protected NfdLevel nfdLevel ;




/**  
* Field nfdRoutingParameterPackage
* Pulls in the package of attributes of the NFD that relate to routing. 

*/
protected RoutingParameters nfdRoutingParameterPackage ;




/**  
* Field layerProtocolParameters
* Pulls in the package of transmission parameters relating to a specifie 

* d layerProticil of the NFD. 

*/
protected List<LayerProtocolParameters> layerProtocolParameters ;




/**  
* Field superiorNfdRef
*/
protected NetworkForwardingDomain superiorNfdRef ;


}