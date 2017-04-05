/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Where there are multiple routes available to the FRE this attribute pa 
* ckage indicates the state of a particular Route. 
 @since SID_R16.5
*/ 

public  class MultiRouteManagement  {



/**  
* Field isIntendedRoute
* This attribute indicates whether this route is the intended (prefered) 

*  route of the FRE (True) or not (False). 

*/
protected Boolean isIntendedRoute ;




/**  
* Field includesResourcesUseByAnotherFre
* This attribute indicates whether one (or more) of the component FREs o 

* f the route or TPEs  associated directly with an component FRE of the  

* route is carrying traffic of another FRE, i.e. is involved in another  

* route that is active, (True) or not (False). 

*/
protected Boolean includesResourcesUseByAnotherFre ;


}