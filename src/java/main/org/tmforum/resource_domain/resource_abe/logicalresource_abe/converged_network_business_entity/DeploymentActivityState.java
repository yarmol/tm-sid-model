/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Represents the degree of deployment activity. 
 @since SID_R16.5
*/ 

public  enum DeploymentActivityState  {



/**  
* Field DEPLOYING
* At least one activate deployment activity or modify deployment activit 

* y (that is intended to result in a deployed capability) related the re 

* source is in progress and has not yet completed. 

*/
 DEPLOYING ,




/**  
* Field INACTIVE
* There is no deployment activity in progress related to the resource. 

*/
 INACTIVE ,




/**  
* Field UNDEPLOYING
* At least one deactivate deployment activity or modify deployment activ 

* ity (that is intended to result in no deployed capability)  related to 

*  the resource is in progress and has not yet completed. 

*/
 UNDEPLOYING ,


}