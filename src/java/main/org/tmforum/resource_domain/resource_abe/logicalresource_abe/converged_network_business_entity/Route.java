/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* This object class represents a partially ordered list of component FRE 
* s defining a route associated with an FRE. 
 @since SID_R16.5
*/ 

public  class Route  {



/**  
* Field routeIdentifier
* This attribute contains the unique identifier of the route within the  

* referencing FRE. 

*/
protected ObjectName routeIdentifier ;




/**  
* Field actualState
* This attribute indicates the summary state of the component FREs assoc 

* iated to the Route. 

*/
protected ActualState actualState ;




/**  
* Field administrativeState
* This attribute indicates whether the Route is currently administrative 

* ly enabled to support the FRE ("unlocked") or not ("locked"). There is 

*  not any relationship with the actualState attribute of the Route. </b 

* r></br>The values can be interpreted as follows: </br>- "locked", the  

* route is not allowed to be active </br>- "unlocked", the route is allo 

* wed to be active. 

*/
protected ControlState administrativeState ;




/**  
* Field additionalInformation
* This attribute allows the communication from the target OS to the requ 

* esting OS of additional information which is not explicitly modelled. 

*/
protected List<AttributeValuePair> additionalInformation ;




/**  
* Field multiRoutePackage
* Pulls in the package of attributes relevant to cases where there are m 

* ultiple routes related to the FRE. 

*/
protected MultiRouteManagement multiRoutePackage ;




/**  
* Field isExclusive
* This attribute indicates whether the component FREs of this Route can  

* be shared in Routes of other FREs (False) or not (True). This applies  

* regardless of other state considerations. If True then MultiRouteManag 

* ement should be included.</br></br> 

*/
protected Boolean isExclusive ;




/**  
* Field freRefList
* Partially ordered list of FREs defining the Route. 

*/
protected ForwardingRelationshipEncapsulation freRefList ;


}