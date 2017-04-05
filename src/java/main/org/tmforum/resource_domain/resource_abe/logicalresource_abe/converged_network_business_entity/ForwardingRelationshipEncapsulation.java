/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The ForwardingRelationshipEncapsulation (FRE) is bounded by two or mor 
* e endpoints each of which may be associated with a TPEs. The FRE repre 
* sents the enabled constrained potential for forwarding of information  
* between those endpoints (i.e. to/from the associated TPEs) for a parti 
* cular layer protocol (where the TPE must clearly have LayerTermination 
* s (LTs) associated that operate with that layer protocol). Note that w 
* here the TPE is associated indirectly with a TopologicalLink (TL) the  
* information from the FRE will be passed across the network via that TL 
*  and where the LT of the TPE is a layer protocol termination the infor 
* mation from the FRE will be prepared to transition layers of the netwo 
* rk.Each endpoint of the FRE has a specific role in the context of the  
* FRE where the possible roles and the interpretation of the roles are g 
* overened by the type of FRE. The types of FRE are equivalent to the ty 
* pes of SNC described in MTOSI SD1-36 (refer to SD1-36_SNCTypes for exp 
* lanation of SNC Properties, SNC Parameters, unidirectional SNCs, Point 
* -to-Multipoint SNC, Routing Constraints and Route Discovery).An FRE ma 
* y encompass a sequence of supporting FREs (which describe in more deta 
* il the route of the information comveyed by the FRE thorugh the networ 
* k). The relationship is recursive such that a supporting FREs may itse 
* lf be supported FREs (i.e. FREs supporting FREs supporting FREs). The  
* FRE at the highest level of a recursion is referred to as top-level FR 
* E. Note that a Call may have one or more parallel top-level Connection 
* (s).An FRE may be used to represent various planning states. In these  
* planning states the FRE may have only partial values for associated TP 
* E name etc. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ForwardingRelationshipEncapsulation extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deploymentState
* This attribute represents the state of provisioning of the forwarding  

* relationship between the set of end points.</br>PARTIAL: Indicates tha 

* t only part of the FRE has been activated in the network.</br>PENDING: 

*  Indicates that none of the FRE resources have been deployed.</br>COMP 

* LETE: Indicates the FRE has been successfully deployed in all Network  

* Elements and no further intervention is required.</br></br>Note that a 

*  COMPLETE FRE is not necessarily enabled to carry traffic or carrying  

* traffic. 

*/
protected DeploymentState deploymentState ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field isFixed
* This attribute identifies whether the FRE can be deleted via the inter 

* face (isFixed = FALSE) or cannot be deleted (isFixed = TRUE). </br>Whe 

* re isFixed = TRUE attempts to delete the FRE by the OS will be rejecte 

* d.</br></br>Where an FRE has a route (i.e. is known to traverse multip 

* le NEs) all NFREs of the FRE must be fxed for the FRE to be fixed.</br 

* > 

*/
protected Boolean isFixed ;




/**  
* Field isAlarmReporting
* This attribute identifies whether alarm reporting for this FRE is admi 

* nistratively enabled or disabled. </br>True = alarm reporting is enabl 

* ed; False = alarm reporting is disabled. 

*/
protected Boolean isAlarmReporting ;




/**  
* Field freType
* This attribute provides the name of the type of the FRE.</br>The type  

* is an expression of the traffic flow and potential for flow (accountin 

* g for protection switching constructs etc) through the FRE between the 

*  EndPoints of the FRE.</br>This attribute essentially provides the nam 

* e of the spec for the FRE. The FRE may have further specification deta 

* ils provided via other specification mechanisms. 

*/
protected FreType freType ;




/**  
* Field direction
* This attribute represents the directionality of the FRE. 

*/
protected NetworkDirection direction ;




/**  
* Field wasRoutedByNetwork
* This attribute indicates if the current route of the FRE was computed  

* by the managed system (i.e. "the network", all capabilities below the  

* interface that defines the perspectiveof managed system) or not (e.g.  

* the route was provided over an interface by a client EMS). </br></br>I 

* f rerouting is allowed, this attribute identifies whether the routing  

* was carried out by "the network" or not.</br></br>If there is no netwo 

* rk routing capability the attribute should be set to False. 

*/
protected Boolean wasRoutedByNetwork ;




/**  
* Field supportingFreRefList
* https://www1.gotomeeting.com/join/149318416  

*/
protected List<ForwardingRelationshipEncapsulation> supportingFreRefList ;




/**  
* Field asapRef
* This attribute indicates the assignment of an Alarm Severity Assignmen 

* t Profile (ASAP) to the FRE. 

*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field freProtectionPackage
* Pulls in the package of attributes that relate to internal resilience  

* of the FRE. 

*/
protected FreProtection freProtectionPackage ;




/**  
* Field freConnectionlessPackage
* Pulls in to package of attributes that relate to preservation of infor 

* mation flow identifiers and other flow control properties across the F 

* RE. 

*/
protected FreConnectionless freConnectionlessPackage ;




/**  
* Field freControlPlanePackage
* Pulls in the package of attributes that relate to delegated routing ca 

* pability utilised during the construction and maintenance of the FRE s 

* uch as that associated with a traditional control plane. 

*/
protected FreControlPlane freControlPlanePackage ;




/**  
* Field deploymentActivityState
* This attribute represents the activity state of the current deployment 

*  request (e.g. activate, modify, and deactivate). If there is no in-pr 

* ogress deployment request, then the activity state is INACTIVE. 

*/
protected DeploymentActivityState deploymentActivityState ;




/**  
* Field endPointList
* A pointer to the list of EndPoints and hence indirectly to the TPE. Th 

* e FreType is defined with 2 or more EndPoints. 

*/
protected EndPoint endPointList ;




/**  
* Field transmissionParameterList
* A list of specific parameters related to the layer of the FRE.  

*/
protected List<AttributeValuePair> transmissionParameterList ;




/**  
* Field layerProtocolName
* Provides the name and potentially additional information such as versi 

* on number for the protocol/layer that the FRE supports. Syntax and sem 

* antic to be specified.</br></br>Note: allowed value examples: “X2”, “L 

* R Optical Channel”. 

*/
protected String layerProtocolName ;




/**  
* Field routeRefList
* Identifier of the routes(s) supporting an FRE. 

*/
protected List<Route> routeRefList ;




/**  
* Field nfdRef
* Where naming does not relate the FRE to the NFD this association is us 

* ed. Identifies the NFD that the FRE is within. Applies where NFDs are  

* defined for or within ManagedElements. 

*/
protected NetworkForwardingDomain nfdRef ;




/**  
* Field managedelement
*/
protected ManagedElement managedelement ;


}