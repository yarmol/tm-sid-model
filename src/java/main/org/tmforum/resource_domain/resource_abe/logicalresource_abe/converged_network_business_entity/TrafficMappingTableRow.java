/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The TrafficMappingTableRow provides a specific rule for one manipulati 
* on, of a set of manipulations, of one or more components flows within  
* the flow dealt with by the instance of LayerTermination.  
 @since SID_R16.5
*/ 

public  class TrafficMappingTableRow  {



/**  
* Field trafficConditioningProfileRef
* Pointer to the TrafficConditioningProfile, an entity that defines a se 

* quence of name value pairs that can be used to define various properti 

* es associated with the manipulation of the component flow identified a 

* nd described in the TrafficMappingTableRow. 

*/
protected TrafficConditioningProfile trafficConditioningProfileRef ;




/**  
* Field vlanIdRange
* This attribute states the VLAN ID or VLAN ID range to which the row ap 

* plies. 

*/
protected String vlanIdRange ;




/**  
* Field priority
* This attribute states the traffic priority for the vlanRange to which  

* this row applies. 

*/
protected String priority ;




/**  
* Field trafficClass
* This attribute states the traffic class for the priority and vlanRange 

*  to which this row applies. 

*/
protected String trafficClass ;




/**  
* Field trafficConditioningParameterList
* This attribute represents a list of traffic conditioning parameters wh 

* ich can be set and/or retrieved at a specified connectionless layer on 

*  a Termination Point (TP) via this TMT as an alternative to use of a T 

* CP or augmenting the TCP. 

*/
protected List<TransmissionParameterList> trafficConditioningParameterList ;


}