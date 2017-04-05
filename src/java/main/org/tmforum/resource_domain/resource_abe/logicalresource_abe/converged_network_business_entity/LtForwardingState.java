/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Indicates the degree of forwarding, both in terms of capability and ac 
* tually configuration, of the LT via the TPE into FREs in the NFD.. 
 @since SID_R16.5
*/ 

public  enum LtForwardingState  {



/**  
* Field FORWARDING_BIDIRECTIONAL
* The LT is associated with one or more FRE in the NFD for both directio 

* ns of flow. 

*/
 FORWARDING_BIDIRECTIONAL ,




/**  
* Field FORWARDING_FROM_LT_TO_FRE
* The LT is associated with and FRE to allow signal to flow from the LT  

*  to the FRE. 

*/
 FORWARDING_FROM_LT_TO_FRE ,




/**  
* Field FORWARDING_TO_LT__FROM_FRE
* The LT is associated with and FRE to allow signal to flow from the FRE 

*  to the LT. 

*/
 FORWARDING_TO_LT__FROM_FRE ,




/**  
* Field LT_CANNOT_FORWARD
* The LT is not capable of associating with an FRE. 

*/
 LT_CANNOT_FORWARD ,




/**  
* Field LT_FORWARDING_STATE_UNKNOWN
* The association between the LT and FREs is unknown. 

*/
 LT_FORWARDING_STATE_UNKNOWN ,




/**  
* Field LT_NOT_FORWARDING
* Although the LT is capable of associating with an FRE it is not at thi 

* s point. 

*/
 LT_NOT_FORWARDING ,


}