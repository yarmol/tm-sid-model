/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Represents the direction of flow at the EndPoint with respect to the a 
* ssociated FRE and TPE. 
 @since SID_R16.5
*/ 

public  enum EndpointDirection  {



/**  
* Field BIDIRECTIONAL
* Signal flow is both into the FRE from the TPE and out from the FRE to  

* the TPE. 

*/
 BIDIRECTIONAL ,




/**  
* Field EGRESS
* The signal only flows out from the FRE to the TPE. 

*/
 EGRESS ,




/**  
* Field INGRESS
* The signal flows in from the TPE to the FRE. 

*/
 INGRESS ,


}