/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a partially ordered list of Cross-Connect 
* s defining the route for a Subnetwork Connection. See R_TMF518_NRF_I_0 
* 035 and R_TMF518_NRF_I_0036. 
 @since SID_R16.5
*/ 

public  class Route  {



/**  
* Field routeIdentifier
* This attribute contains the unique identifier within the SNC name. 

*/
protected ObjectName routeIdentifier ;




/**  
* Field crossConnectList
* This attribute represents a route for a Subnetwork Connection. The Cro 

* ss-Connects are listed from the NE on which the SNC starts (first entr 

* y) to the NE on which the SNC ends (last entry) and the aEnd(G)TpList  

* and zEnd(G)TpList will name CTPs of the same or equivalent layer rate  

* only. 

*/
protected List<CrossConnect> crossConnectList ;




/**  
* Field isIntendedRoute
* This attribute defines the purpose of the route. 

*/
protected Boolean isIntendedRoute ;




/**  
* Field actualState
* This attribute defines the actual summary state of the Cross-Connects  

* (CCs) associated to the Route. 

*/
protected ActualState actualState ;




/**  
* Field administrativeState
* This attribute defines administratively the role that the Route shall  

* play for the belonging SNC. There is not any relationship with the act 

* ualState attribute of the Route. </br>It can have the following values 

* : </br>- "locked", the route is not allowed to be active </br>- "unloc 

* ked", the route is allowed to be active. 

*/
protected ControlState administrativeState ;




/**  
* Field isInUseBy
* This attribute defines if at least one of the routes Cross-Connects or 

*  CTPs is carrying traffic of another SNC (True). 

*/
protected Boolean isInUseBy ;




/**  
* Field isExclusive
* This attribute defines that not any other routes of other SNCs can sha 

* re any of the routes Cross Connects or CTPs, even in pending state (Tr 

* ue). 

*/
protected Boolean isExclusive ;




/**  
* Field additionalInformation
* This attribute allows the communication from the target OS to the requ 

* esting OS of additional information which is not explicitly modelled. 

*/
protected List<AttributeValuePair> additionalInformation ;




/**  
* Field subNetworkConnection
*/
protected SubNetworkConnection subNetworkConnection ;


}