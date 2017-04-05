/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Package of attributes that relate to delegated routing capability util 
* ised during the construction and maintenance of the FRE such as that a 
* ssociated with a traditional control plane. 
 @since SID_R16.5
*/ 

public  class FreControlPlane  {



/**  
* Field routeGroupLabel
* This attribute represents the Route Group the FRE is associated to. Wh 

* en a target OS creates a Call with diverse Route Groups, it assigns a  

* Route Group label (which may be a number) to each FRE. FREs in the sam 

* e Route Group will be assigned the same value for routeGroupLabel. FRE 

* s in different Route Groups will be assigned different values for rout 

* eGroupLabel. 

*/
protected String routeGroupLabel ;




/**  
* Field isUsingHomeRoute
* This attribute indicates whether the Connection is currently using the 

*  home route or not. 

*/
protected Boolean isUsingHomeRoute ;




/**  
* Field maximumCost
* This attribute defines a number that indicates the maximum cost allowe 

* d for an FRE. The cost of an FRE is calculated based on the cost of th 

* e supporting links. This link cost represents a vector of one or more  

* metrics, each of which indicates the relative desirability of a partic 

* ular link over another during path selection.  

*/
protected List<AttributeValuePair> maximumCost ;




/**  
* Field routingConstraintEffort
* This attribute indicates the requested level of effort to meet the rou 

* ting constraint when creating and when rerouting the FRE. 

*/
protected RoutingConstraintEffort routingConstraintEffort ;




/**  
* Field connectionSetupType
* This attribute identifies the setup type of the FRE. It indicates whet 

* her the FRE has been established by UNI signalling (SC) or NMS operati 

* on (SPC, PC). 

*/
protected ConnectionSetupType connectionSetupType ;




/**  
* Field callId
* Pointer to the "call" that this FRE is part of. 

*/
protected Call callId ;




/**  
* Field connectionParameterProfileRef
* Pointer to the ConnectionParameterProfile, an entity that defines a se 

* quence of name value pairs that can be used to define class of service 

*  parameters and their values to be associated to an FRE. 

*/
protected ConnectionParameterProfile connectionParameterProfileRef ;


}