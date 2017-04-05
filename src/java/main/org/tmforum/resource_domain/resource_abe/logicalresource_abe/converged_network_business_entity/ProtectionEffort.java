/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Indicates the degree of support of specified internal protection of th 
* e FRE that is required on initial routing and rerouting. 
 @since SID_R16.5
*/ 

public  enum ProtectionEffort  {



/**  
* Field SAME
* The protection must be as specified. 

*/
 SAME ,




/**  
* Field SAME_AS_OR_BETTER
* The degree of protection must be at least as specified. 

*/
 SAME_AS_OR_BETTER ,




/**  
* Field SAME_AS_OR_WORSE
* The degree of protection may be less than specified but must not be mo 

* re. 

*/
 SAME_AS_OR_WORSE ,




/**  
* Field WHATEVER
* The specified protection level is a preference but any other level is  

* acceptable. 

*/
 WHATEVER ,


}