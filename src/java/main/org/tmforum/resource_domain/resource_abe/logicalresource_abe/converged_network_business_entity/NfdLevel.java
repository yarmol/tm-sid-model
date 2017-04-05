/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Identifies the level of a NetworkForwardingDomain (NFD) 
 @since SID_R16.5
*/ 

public  enum NfdLevel  {



/**  
* Field BOTTOM_LEVEL
* There are no NFDs below this NFD. _supportingNfdRefList = NULL. _suppo 

* rtingNeRef is probably not NULL. 

*/
 BOTTOM_LEVEL ,




/**  
* Field INTERMEDIATE_LEVEL
* This NFD is neither TOP_LEVEL or BOTTOM_LEVEL. The _superiorNfdRef and 

*  _supportingNfdRefList are both not NULL. 

*/
 INTERMEDIATE_LEVEL ,




/**  
* Field SINGLE_LEVEL
* There is no NFD hierarchy. Both _superiorNfdRef and _supportingNfdRefL 

* ist are NULL. 

*/
 SINGLE_LEVEL ,




/**  
* Field TOP_LEVEL
* There are no NFDs above this NFD. _superiorNfdRef = NULL 

*/
 TOP_LEVEL ,


}