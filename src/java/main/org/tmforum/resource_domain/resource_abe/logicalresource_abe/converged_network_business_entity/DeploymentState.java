/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Represents the degree of deployment of the parts of a resource in the  
* network. 
 @since SID_R16.5
*/ 

public  enum DeploymentState  {



/**  
* Field COMPLETE
* All parts of the resource have been completely deployed in the network 

* . 

*/
 COMPLETE ,




/**  
* Field PARTIAL
* Some but not all parts of the resource have been deployed into the net 

* work. 

*/
 PARTIAL ,




/**  
* Field PENDING
* None of the parts of the resource have been deployed into the network. 

*  The resource is not real in the network. 

*/
 PENDING ,


}