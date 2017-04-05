/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Indicates the degree to which the routing constraints should be met. 
 @since SID_R16.5
*/ 

public  enum RoutingConstraintEffort  {



/**  
* Field BEST_EFFORT
* The routing contraints are a preference but not meeting them is accept 

* able. 

*/
 BEST_EFFORT ,




/**  
* Field EXACT_MATCH
* The routing constraints must be met exactly. 

*/
 EXACT_MATCH ,


}