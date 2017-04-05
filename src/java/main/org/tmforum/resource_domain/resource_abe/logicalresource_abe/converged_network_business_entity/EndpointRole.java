/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Extensible list of Roles that provide details of the visible abstracti 
* on of the internal structure of the encapsulation, i.e. that that can  
* be seen and controlled via the FRE. 
 @since SID_R16.5
*/ 

public  enum EndpointRole  {



/**  
* Field ADMINISTRATIVE_MASTER
* The point has a role of Master from an administrative perspective. 

*/
 ADMINISTRATIVE_MASTER ,




/**  
* Field FORWARDING_BRIDGE
* The point supports the flow required for the bridging required between 

*  two INTERCONNECT FREs to form a ladder protection structure. 

*/
 FORWARDING_BRIDGE ,




/**  
* Field FORWARDING_HUB
* The common point in a HUB_SPOKE FRE. The point can feed to and draw fr 

* om any other HUBs and any SPOKEs. 

*/
 FORWARDING_HUB ,




/**  
* Field FORWARDING_PROTECTING
* A point that will be receiving traffic that is the same as traffic rec 

* eived by another point in the FRE so that it can be an alternative to  

* that other point in forwarding traffic to a RESILIENT point in the FRE 

* . 

*/
 FORWARDING_PROTECTING ,




/**  
* Field FORWARDING_RESILIENT
* The point can draw equivalent traffic from several other points in the 

*  FRE such that the alternative sources improve the reliability of outp 

* ut of the FRE at this (RESILIENT) point. This point appears in a PROTE 

* CTED FRE (which is equivalent to an ADD_DROP SNC). 

*/
 FORWARDING_RESILIENT ,




/**  
* Field FORWARDING_SPOKE
* The point can feed to and draw from any HUBs but not from any SPOKES i 

* n a HUB_SPOKE FRE. 

*/
 FORWARDING_SPOKE ,




/**  
* Field FORWARDING_SYMMETRIC
* The point has an equal role to all other points in the FRE. There are  

* no constraints on flow across the FRE so any SYMMETRIC point can have  

* forwarding to/from any other SYMMETRIC point. 

*/
 FORWARDING_SYMMETRIC ,




/**  
* Field REVERSION_MAIN
* The point has a role of "preferred" with respect to a protection switc 

* h position. 

*/
 REVERSION_MAIN ,




/**  
* Field REVERSION_STANDBY
* The point has a role of "not&nbsp;preferred" with respect to a protect 

* ion switch position. 

*/
 REVERSION_STANDBY ,


}