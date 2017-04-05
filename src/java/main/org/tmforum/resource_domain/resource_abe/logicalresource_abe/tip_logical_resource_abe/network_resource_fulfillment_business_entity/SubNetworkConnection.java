/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents the relationship between Termination Poin 
* ts. All end point TPs related by an Subnetwork Connection (SNC) must s 
* upport the same or an equivalent layer rate which is also the SNC's la 
* yer rate. In pending state, generic Connection Termination Point(s) of 
*  the SNC could be replied. Refer to the associated supporting document 
*  SD1-36_SNCTypes for explanation of SNC Properties, SNC Parameters, un 
* idirectional SNCs, Point-to-Multipoint SNC, Routing Constraints and Ro 
* ute Discovery. See R_TMF518_NRF_I_0024 and R_TMF518_NRF_I_0025. For bu 
* ndled SNCs see R_TMF518_NRF_I_0032. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SubNetworkConnection extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field state
* This attribute identifies the SNC connection state. </br>See R_TMF518_ 

* NRF_I_0028. 

*/
protected SubnetworkConnectionState state ;




/**  
* Field direction
* This attribute identifies the directionality of the SNC. 

*/
protected ConnectionDirection direction ;




/**  
* Field layerRate
* This attribute identifies the layer rate of the SNC. It is specified b 

* y the requesting OS upon object creation. </br> </br>Note: In case of  

* a bundled SNC the value LR_Not_Applicable is used. The requesting OS c 

* an determine the layer rate by looking at the CTPs contained in the aE 

* nd and zEnd GTPs. 

*/
protected LayerRate layerRate ;




/**  
* Field staticProtectionLevel
* This attribute indicates the degree of internal resilience/protection  

* of the SNC. 

*/
protected StaticProtectionLevel staticProtectionLevel ;




/**  
* Field type
* This attribute indicates the external traffic flow through the SNC. </ 

* br>See R_TMF518_NRF_I_0029. 

*/
protected SubnetworkConnectionType type ;




/**  
* Field aEndTpDataList
* This attribute lists all A End TP names together with their TP data (T 

* P Mapping Mode, Transmission Parameters). 

*/
protected List<TerminationPointData> aEndTpDataList ;




/**  
* Field zEndTpDataList
* This attribute lists all Z End TP names together with their TP data (T 

* P Mapping Mode, Transmission Parameters). 

*/
protected List<TerminationPointData> zEndTpDataList ;




/**  
* Field rerouteAllowed
* This attribute specifies if the target OS/MEs are allowed and/or requi 

* red to reroute this SNC if there is a failure on this SNC, periodicall 

* y to optimize the routes, of for any other reason. It is an target OS/ 

* ME implementation whether this is done using network routing protocols 

*  or if the target OS/MEs detect the failure and take appropriate actio 

* n to attempt to fix the SNC. </br>The NO value means that the target O 

* S/MEs are not allowed to reroute the SNC. </br>The YES value means tha 

* t the target OS/MEs are allowed to reroute the SNC and are required to 

*  attempt to reroute it upon failure. </br>The NA value is used when th 

* e requesting OS does not want to specify the exact target OS behaviour 

* . In this case it is left up to the target OS to decide whether rerout 

* ing will be provided. It is also used if the target OS/MEs are allowed 

*  to reroute the SNC but not required to attempt to reroute it upon fai 

* lure. 

*/
protected RerouteAllowed rerouteAllowed ;




/**  
* Field networkRouted
* This attribute specifies if the route for this SNC is computed by the  

* network. </br>If rerouting is allowed, this attribute tells who last r 

* erouted the SNC, the network (YES) or the EMS (NO). 

*/
protected NetworkRouted networkRouted ;




/**  
* Field networkReroute
* This attribute indicates if the reroute (if allowed) should be compute 

* d by the network (YES), by the EMS (NO), or if it does not matter (NOT 

* _SET). </br>Changes in the value of this attribute lead to an AVC noti 

* fication. 

*/
protected Reroute networkReroute ;




/**  
* Field revertive
* This attribute defines if the SNC can be switched back to its original 

*  (intended) route. </br>In case the SNC is "revertive" (True), the res 

* toration process will always switch to the intended route if possible, 

*  i.e. if there are no failures or if the intended route is not locked. 

*  </br>Changes in the value of this attribute lead to an AVC notificati 

* on. 

*/
protected Boolean revertive ;




/**  
* Field isReportingAlarms
* This attribute identifies whether alarm reporting for this subnetwork  

* connection is administratively activated or de-activated. </br>Changes 

*  in the value of this attribute lead to an AVC notification. </br> </b 

* r>True = alarm reporting is activated; False = alarm reporting is de-a 

* ctivated. 

*/
protected Boolean isReportingAlarms ;




/**  
* Field correlationIdentifier
* This attribute contains information about relationships that this subn 

* etwork connection may have to other objects. </br>Changes in the value 

*  of this attribute lead to an AVC notification. 

*/
protected String correlationIdentifier ;




/**  
* Field isBundledSnc
* This attribute indicates if the SNC is a bundled SNC. 

*/
protected Boolean isBundledSnc ;




/**  
* Field mustRemoveGtps
* This attribute defines that the target OS has to delete all the interi 

* or GTPs supporting the bundled SNC when the SNC is deleted. It is only 

*  used for bundled SNCs. </br> </br>It can take on two possible values: 

*  </br>- TRUE (the target OS must make a best-effort attempt to remove  

* the interior GTPs that once belonged to the SNC) and </br>- FALSE (the 

*  requesting OS doesn't care if the target OS removes the interior GTPs 

*  or not). </br> </br>In the case that mustRemoveGTPs is set to "TRUE"  

* and the target OS cannot remove all the interior GTPs, the target OS s 

* hould return a list of the GTPs that could not be removed in the error 

* Reason field of the deactivateAndDeleteSNC and deleteSNC operations. T 

* he errorReason will be "not all interior GTPs could be deleted" - this 

*  will be followed by the names of the GTPs that could not be deleted. 

*/
protected Boolean mustRemoveGtps ;




/**  
* Field isFixed
* This attribute identifies if the SubnetworkConnection is fixed (i.e. c 

* annot be deleted by the requestig OS). </br>A fixed SNC is defined a S 

* NC whose all cross connects are fixed. 

*/
protected Boolean isFixed ;




/**  
* Field mustRetainOldSnc
* This attribute identifies if an original route of the SNC is maintaine 

* d and that it is possible to swap back this route. </br>Changes in the 

*  value of this attribute lead to an AVC notification. 

*/
protected Boolean mustRetainOldSnc ;




/**  
* Field priority
* This attribute identifies the priority of the SNC. </br>Allowed values 

*  are = "0" , "1" , "2" , ... where zero (0) is the highest priority. < 

* /br>Changes in the value of this attribute lead to an AVC notification 

* . 

*/
protected Integer priority ;




/**  
* Field aEndPointsRole
* This attribute indicates the end point role of the aEndTPs of the SNC. 

*  </br>At a connection matrix (CM) end point the span of the SNC starts 

*  at a G.805 CP with a fixed or flexible connection through the ME at t 

* he SNC layer, i.e. the connectable layer of the end point. At a link c 

* onnection (LC) end point connectivity is adapted from a server layer a 

* nd the span of the SNC starts with a G.805 TCP. </br>See R_TMF518_NRF_ 

* I_0026. 

*/
protected List<EndPointRole> aEndPointsRole ;




/**  
* Field zEndPointsRole
* This attribute indicates the end point role of the zEndTPs of the SNC. 

*  </br>At a connection matrix (CM) end point the span of the SNC starts 

*  at a G.805 CP with a fixed or flexible connection through the ME at t 

* he SNC layer, i.e. the connectable layer of the end point. At a link c 

* onnection (LC) end point connectivity is adapted from a server layer a 

* nd the span of the SNC starts with a G.805 TCP. </br>See R_TMF518_NRF_ 

* I_0026. 

*/
protected List<EndPointRole> zEndPointsRole ;




/**  
* Field routeGroupLabel
* This attribute represents the Route Group the Subnetwork Connection is 

*  associated to. When a target OS creates a Call with diverse Route Gro 

* ups, it assigns a Route Group label (which may be a number) to each SN 

* C. SNCs in the same Route Group will be assigned the same value for ro 

* uteGroupLabel. SNCs in different Route Groups will be assigned differe 

* nt values for routeGroupLabel. 

*/
protected String routeGroupLabel ;




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
* Field route
*/
protected List<Route> route ;




/**  
* Field aEndTpList
*/
protected GroupTerminationPoint aEndTpList ;




/**  
* Field terminationPoint
*/
protected TIPTerminationPoint terminationPoint ;




/**  
* Field zEndTpList
*/
protected GroupTerminationPoint zEndTpList ;




/**  
* Field terminationPoint
*/
protected TIPTerminationPoint terminationPoint ;




/**  
* Field multiLayerSubNetwork
*/
protected MultiLayerSubNetwork multiLayerSubNetwork ;


}